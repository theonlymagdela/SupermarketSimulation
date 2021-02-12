package products;

import java.math.BigDecimal;

public enum ProductInfo {

    BEER(1001, "beer", new BigDecimal("3.5")),
    EGGS(2463,"eggs", new BigDecimal("4.6")),
    CHOCOLATE(8573,"chocolate", new BigDecimal("3.9")),
    SODA(2736,"soda", new BigDecimal("2.9")),
    BREAD(9386, "bread", new BigDecimal("3.9"));

    private final int barcode;
    private final String name;
    private final BigDecimal price;

    ProductInfo(int barcode, String name, BigDecimal price) {
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
