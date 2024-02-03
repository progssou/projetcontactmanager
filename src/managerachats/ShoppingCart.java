package managerachats;

import mangerstock.Product;
import java.util.List;
import java.util.ArrayList;

public class ShoppingCart implements Achetable{
    private final List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product.isAvailable()) {
            products.add(product);
            product.updateStock(1);
        }
    }

    @Override
    public boolean isAvailable() {
        return !products.isEmpty();
    }

    @Override
    public void updateStock(int quantity) {
        // ShoppingCart doesn't have its own stock
    }

    public List<Product> getProducts() {
        return products;
    }
}
