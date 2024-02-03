package mangerstock;
public class Product {
    private String name;

    private String price;
    private int stock;

    public Product(String name, int stock, boolean b) {
        this.name = name;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void updateStock(int quantity) {
        stock += quantity;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }


    public String getPrice() {
        return price;
    }
}