package managerachats;
import java.util.List;

public interface Achetable {
    boolean isAvailable();

    void updateStock(int quantity);
}
