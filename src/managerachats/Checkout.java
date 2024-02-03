package managerachats;

import mangerstock.Order;
import mangerstock.Product;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private List<Order> orders;

    public Checkout() {
        this.orders = new ArrayList<>();
    }

    public void processOrder(ShoppingCart cart, String customerName) {
        Order order = new Order(customerName);
        for (Product product : cart.getProducts()) {
            order.addProduct(product);
        }
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}
