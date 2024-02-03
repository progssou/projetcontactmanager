package mangerstock;
import managerachats.Commandable;
import mangercontact.Contact;

import java.util.ArrayList;
import java.util.List;
public class Order extends Contact implements Commandable {
    private String customerName;
    private List<Product> products;

    public Order(String customerName) {
        super(customerName, "", "");
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        if (product.isAvailable()) {
            products.add(product);
            product.updateStock(1);
        }
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}