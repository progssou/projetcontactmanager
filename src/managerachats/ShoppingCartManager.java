package managerachats;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartManager {
    private List<ShoppingCart> carts;

    public ShoppingCartManager() {
        this.carts = new ArrayList<>();
    }

    public ShoppingCart createShoppingCart() {
        ShoppingCart cart = new ShoppingCart();
        carts.add(cart);
        return cart;
    }

    public List<ShoppingCart> getShoppingCarts() {
        return carts;
    }
}
