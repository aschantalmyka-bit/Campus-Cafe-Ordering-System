
/**
 * Main application for the Campus Cafe Ordering System.
 * Demonstrates Java OOP concepts.
 *
 * @author Your Name
 * @version 1.0
 */
public class CafeApp {

    /**
     * Starts the Campus Cafe Ordering System.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create customers using different constructors.
        Customer customer1 =
            new Customer("Marlita Acibron", true);

        Customer customer2 =
            new Customer("Primo Cruz");

        // Create a Beverage using a parameterized constructor.
        Beverage icedLatte =
            new Beverage("Iced Latte", 95, "B-01", "L");

        // Create a Beverage using the default constructor.
        Beverage hotChocolate = new Beverage();

        hotChocolate.setName("Hot Chocolate");
        hotChocolate.setItemCode("B-02");

        // Demonstrate invalid price validation.
        hotChocolate.setBasePrice(-5);

        // Set the correct price afterward.
        hotChocolate.setBasePrice(80);
        hotChocolate.setSize("M");

        // Create a Pastry using a parameterized constructor.
        Pastry ensaymada =
            new Pastry("Ensaymada", 45, "P-01", true);

        // Create a Pastry using the default constructor.
        Pastry cookie = new Pastry();

        cookie.setName("Cookie");
        cookie.setBasePrice(30);
        cookie.setItemCode("P-02");

        // Create a Meal using a parameterized constructor.
        Meal chickenAdobo =
            new Meal("Chicken Adobo", 110, "M-01",
                     true, 1);

        // Create a Meal using the default constructor.
        Meal beefTapa = new Meal();

        beefTapa.setName("Beef Tapa");
        beefTapa.setBasePrice(130);
        beefTapa.setItemCode("M-02");
        beefTapa.setUpsized(false);
        beefTapa.setExtraSides(0);

        // Create the first order.
        Order order1 = new Order("1001", customer1);

        order1.addItem(icedLatte);
        order1.addItem(ensaymada);
        order1.addItem(chickenAdobo);

        // Try adding a fourth item.
        order1.addItem(cookie);

        // Print first receipt.
        order1.printReceipt();

        // Create the second order.
        Order order2 = new Order("1002", customer2);

        order2.addItem(hotChocolate);
        order2.addItem(beefTapa);

        // Apply a 20-peso voucher.
        order2.computeTotal(20);

        // Print second receipt.
        order2.printReceipt();
    }
}
