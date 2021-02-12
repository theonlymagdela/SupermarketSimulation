import products.Product;
import products.ProductInfo;

public class Main {

    public static void main(String[] args) {

        Register rg = new Register();

        rg.addToBasket(new Product(ProductInfo.BREAD.getBarcode(), ProductInfo.BREAD.getName(), ProductInfo.BREAD.getPrice(), 2));
        rg.addToBasket(new Product(ProductInfo.SODA.getBarcode(), ProductInfo.SODA.getName(), ProductInfo.SODA.getPrice(), 1));
        rg.addToBasket(new Product(ProductInfo.BEER.getBarcode(), ProductInfo.BEER.getName(), ProductInfo.BEER.getPrice(), 1));
        rg.addToBasket(new Product(ProductInfo.CHOCOLATE.getBarcode(), ProductInfo.CHOCOLATE.getName(), ProductInfo.CHOCOLATE.getPrice(), 2));
        rg.addToBasket(new Product(ProductInfo.BEER.getBarcode(), ProductInfo.BEER.getName(), ProductInfo.BEER.getPrice(), 1));
        rg.addToBasket(new Product(ProductInfo.EGGS.getBarcode(), ProductInfo.EGGS.getName(), ProductInfo.EGGS.getPrice(), 8));
        rg.addToBasket(new Product(ProductInfo.BEER.getBarcode(), ProductInfo.BEER.getName(), ProductInfo.BEER.getPrice(), 1));
        rg.addToBasket(new Product(ProductInfo.SODA.getBarcode(), ProductInfo.SODA.getName(), ProductInfo.SODA.getPrice(), 1));

        rg.getTheBill();
    }
}
