package products;

import java.math.BigDecimal;

public class Product {

    private final int barcode;
    private final String name;
    private final BigDecimal price;
    private final int quantity;

    public Product(int barcode, String name, BigDecimal price, int quantity) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
