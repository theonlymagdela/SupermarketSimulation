import products.Product;

import java.math.BigDecimal;

public class Register {

    private final Basket basket = new Basket();
    private final Bill bill = new Bill();

    public Register() {
    }

    public void addToBasket(Product product) {
        basket.addToBasket(product);
    }

    public void getTheBill() {
        BigDecimal total = new BigDecimal("0.0");

        System.out.println("barcode, name, amount, price");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for(Product product: basket.getBasket()) {
            if(!bill.isKey(product.getName())) {
                bill.addToBill(product, product.getQuantity());
            } else {
                bill.replaceValue(product, bill.getValueByKey(product.getName()) + product.getQuantity());
            }
            BigDecimal price = getPrice(product).multiply(new BigDecimal(product.getQuantity()));
            total = total.add(price);
            System.out.println(product.getBarcode() + ", " +
                    product.getName() + ", " +
                    product.getQuantity() + ", " +
                    String.format("%.2f", price) + " PLN");
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total " + String.format("%.2f", total) + " PLN");
        bill.clearBill();
        basket.clearBasket();
    }

    public BigDecimal getPrice(Product product) {
        BigDecimal productPrice = product.getPrice();
        BigDecimal calculatedPrice;
        int qty = bill.getValueByKey(product.getName());

        if(qty == 0) {
            calculatedPrice = new BigDecimal(0);
        } else if (qty == 1) {
            calculatedPrice = productPrice;
        } else if (qty == 2) {
            calculatedPrice = (new BigDecimal("0.75")).multiply(productPrice);
            System.out.println("-- every second 25% off");
        } else {
            calculatedPrice = (new BigDecimal("0.5")).multiply(productPrice);
            System.out.println("-- every third and further 50% off");
        }

        return calculatedPrice;
    }
}
