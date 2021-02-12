import products.Product;
import products.ProductInfo;

public class Main {

    public static void main(String[] args) {

        Register rg = new Register();

        rg.addToBasket(new Product(ProductInfo.BREAD.getBarcode(), ProductInfo.BREAD.getName(), ProductInfo.BREAD.getPrice()));
        rg.addToBasket(new Product(ProductInfo.SODA.getBarcode(), ProductInfo.SODA.getName(), ProductInfo.SODA.getPrice()));
        rg.addToBasket(new Product(ProductInfo.BEER.getBarcode(), ProductInfo.BEER.getName(), ProductInfo.BEER.getPrice()));
        rg.addToBasket(new Product(ProductInfo.CHOCOLATE.getBarcode(), ProductInfo.CHOCOLATE.getName(), ProductInfo.CHOCOLATE.getPrice()));
        rg.addToBasket(new Product(ProductInfo.BEER.getBarcode(), ProductInfo.BEER.getName(), ProductInfo.BEER.getPrice()));
        rg.addToBasket(new Product(ProductInfo.BEER.getBarcode(), ProductInfo.BEER.getName(), ProductInfo.BEER.getPrice()));
        rg.addToBasket(new Product(ProductInfo.SODA.getBarcode(), ProductInfo.SODA.getName(), ProductInfo.SODA.getPrice()));

        rg.getTheBill();
    }
}
