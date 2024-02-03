package managerachats;

import mangerstock.Product;

import java.util.List;

public interface Commandable {
    void addProduct(Product product);

    List<Product> getProducts();
}
