package products;

import java.math.BigDecimal;

public class Product {

    private final int barcode;
    private final String name;
    private final BigDecimal price;

    public Product(int barcode, String name, BigDecimal price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
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
}
