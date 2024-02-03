package mangerstock;
import java.util.ArrayList;
import java.util.List;
public class CustomerOrderManager {
    private List<Order> orders;

    public CustomerOrderManager() {
        this.orders = new ArrayList<>();
    }

    public void createOrder(String customerName, List<Product> products) {
        Order order = new Order(customerName);
        for (Product product : products) {
            order.addProduct(product);
        }
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
