/**Runs the Campus Cafe Ordering System.
 * Demonstrates customers, menu items, orders, and receipts.
 * @author Dangculos Aschantal Myka B.
 * @version 1.0
 */
public class CafeApp {

    /**Creates the application object.
     */
    public CafeApp() {
        // No setup is needed before main runs.
    }

    /** Starts the Campus Cafe Ordering System.
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create customers using overloaded constructors.
        Customer customer1 = new Customer("Ana Reyes", true);
        Customer customer2 = new Customer();
        customer2.setName("Ben Cruz");
        customer2.setStudent(false);

        // Create menu items.
        Beverage icedLatte =
                new Beverage("Iced Latte", 95.00, "B-01", "L");

        Pastry ensaymada =
                new Pastry("Ensaymada", 45.00, "P-01", true);

        Meal chickenAdobo =
                new Meal("Chicken Adobo", 110.00, "M-01", true, 1);

        // Demonstrate default constructors.
        Beverage defaultBeverage = new Beverage();
        defaultBeverage.setName("Default Drink");
        defaultBeverage.setBasePrice(40.00);
        defaultBeverage.setItemCode("B-99");
        defaultBeverage.setSize("S");

        Pastry defaultPastry = new Pastry();
        defaultPastry.setName("Plain Donut");
        defaultPastry.setBasePrice(30.00);
        defaultPastry.setItemCode("P-99");
        defaultPastry.setWarmed(false);

        Meal defaultMeal = new Meal();
        defaultMeal.setName("Regular Rice");
        defaultMeal.setBasePrice(50.00);
        defaultMeal.setItemCode("M-99");
        defaultMeal.setUpsized(false);
        defaultMeal.setExtraSides(0);

        // Create the first order.
        Order order1 = new Order("1001", customer1);

        order1.addItem(icedLatte);
        order1.addItem(ensaymada);
        order1.addItem(chickenAdobo);

        // Demonstrate the three-item limit.
        Pastry cookie =
                new Pastry("Cookie", 25.00, "P-02", false);

        order1.addItem(cookie);

        // Print the first receipt.
        order1.printReceipt();

        // Create another beverage.
        Beverage hotChocolate = new Beverage();
        hotChocolate.setName("Hot Chocolate");
        hotChocolate.setItemCode("B-02");
        hotChocolate.setSize("M");

        // Demonstrate invalid price validation.
        hotChocolate.setBasePrice(-5);
        hotChocolate.setBasePrice(80);

        // Create another meal.
        Meal beefTapa =
                new Meal("Beef Tapa", 130.00, "M-02", false, 0);

        // Create the second order.
        Order order2 = new Order("1002", customer2);

        order2.addItem(hotChocolate);
        order2.addItem(beefTapa);

        // Print the second receipt with a voucher.
        order2.printReceipt(20.00);

        // Demonstrate invalid extra-side validation.
        defaultMeal.setExtraSides(-2);
    }
}
