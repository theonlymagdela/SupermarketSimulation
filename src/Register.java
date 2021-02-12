import products.Product;

public class Register {

    private final Basket basket = new Basket();
    private final Bill bill = new Bill();

    public Register() {
    }

    public void addToBasket(Product product) {
        basket.addToBasket(product);
    }

    public void getTheBill() {
        double total = 0.0;

        System.out.println("barcode, name, amount, price");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Product product: basket.getBasket()) {
            if(!bill.isKey(product.getName())) {
                bill.addToBill(product, 1);
            } else {
                bill.replaceValue(product, bill.getValueByKey(product.getName()) + 1);
            }
            double price = getPrice(product);
            total = total + price;
            System.out.println(product.getBarcode() + ", " + product.getName() + ", " + 1 + ", " + String.format("%.2f", price) + " PLN");
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Total " + String.format("%.2f", total) + " PLN");
        bill.clearBill();
        basket.clearBasket();
    }

    public double getPrice(Product product) {
        double productPrice = product.getPrice();
        double calculatedPrice;
        int qty = bill.getValueByKey(product.getName());

        if(qty == 0) {
            calculatedPrice = 0;
        } else if (qty == 1) {
            calculatedPrice = productPrice;
        } else if (qty == 2) {
            calculatedPrice = 0.75 * productPrice;
        } else {
            calculatedPrice = 0.5 * productPrice;
        }

        return calculatedPrice;
    }
}
