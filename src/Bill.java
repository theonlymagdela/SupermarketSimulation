import products.Product;

import java.util.HashMap;
import java.util.Map;

public class Bill {

    private final Map<String, Integer> bill = new HashMap<>();

    public Bill() {
    }

    public int getValueByKey(String keyName) {
        return bill.get(keyName);
    }

    public boolean isKey(String keyName) {
        return bill.containsKey(keyName);
    }

    public void addToBill(Product product, Integer qn) {
        bill.put(product.getName(), qn);
    }

    public void replaceValue(Product product, Integer qn) {
        bill.replace(product.getName(), qn);
    }

    public void clearBill() {
        bill.clear();
    }
}
