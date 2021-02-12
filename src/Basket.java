import products.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Product> basket = new ArrayList<>();

    public Basket() {
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void addToBasket(Product product) {
        basket.add(product);
    }

    public void clearBasket() {
        basket.clear();
    }
}
