package products;

public enum ProductInfo {

    BEER(1001, "beer", 3.5),
    EGGS(2463,"eggs", 4.6),
    CHOCOLATE(8573,"chocolate", 3.9),
    SODA(2736,"soda", 2.9),
    BREAD(9386, "bread", 3.9);

    private final int barcode;
    private final String name;
    private final double price;

    ProductInfo(int barcode, String name, double price) {
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

    public double getPrice() {
        return price;
    }
}
