import mangercontact.Contact;
import mangercontact.ContactManager;
import mangerstock.*;
import managerachats.*;
public class Main {
    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();

       // Contact contact1 = new Contact("John Doe", "1234567890", "john.doe@example.com");
       // Contact contact2 = new Contact("Jane Doe", "0987654321", "jane.doe@example.com");

        contactManager.printContacts();

        Contact foundContact = contactManager.findContactByName("John Doe");
        if (foundContact != null) {
            System.out.println("Contact found: " + foundContact.getName());
        }


        contactManager.printContacts();

        ShoppingCartManager manager = new ShoppingCartManager();

        ShoppingCart cart1 = manager.createShoppingCart();
        cart1.addProduct(new Product("Product 1", 100, true));
        cart1.addProduct(new Product("Product 2", 200, true));

        ShoppingCart cart2 = manager.createShoppingCart();
        cart2.addProduct(new Product("Product 3", 300, true));
        cart2.addProduct(new Product("Product 4", 400, true));

        Checkout checkout = new Checkout();
        checkout.processOrder(cart1, "Customer 1");
        checkout.processOrder(cart2, "Customer 2");


    }

}