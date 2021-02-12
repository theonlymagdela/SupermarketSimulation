package products;

public class Product {

    private final int barcode;
    private final String name;
    private final double price;

    public Product(int barcode, String name, double price) {
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
