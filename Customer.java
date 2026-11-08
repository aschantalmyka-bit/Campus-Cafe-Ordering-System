
/**
 * Represents a customer of the campus cafe.
 *
 * @author Your Name
 * @version 1.0
 */
public class Customer {

    private String name;
    private boolean student;
    private int loyaltyPoints;

    /**
     * Creates a customer with default values.
     */
    public Customer() {
        name = "Unknown Customer";
        student = false;
        loyaltyPoints = 0;
    }

    /**
     * Creates a customer using their name.
     *
     * @param name customer name
     */
    public Customer(String name) {
        this(name, false);
    }

    /**
     * Creates a customer using their name and student status.
     *
     * @param name customer name
     * @param student student status
     */
    public Customer(String name, boolean student) {
        this.name = "Unknown Customer";
        this.student = student;
        loyaltyPoints = 0;
        setName(name);
    }

    /**
     * Adds loyalty points directly.
     *
     * @param points number of points to add
     */
    public void addPoints(int points) {
        if (points >= 0) {
            loyaltyPoints += points;
        } else {
            System.out.println("Error: Points cannot be negative.");
        }
    }

    /**
     * Adds one point for every 50 pesos spent.
     *
     * @param amountSpent amount spent by customer
     */
    public void addPoints(double amountSpent) {
        if (amountSpent >= 0) {
            int points = (int) (amountSpent / 50);
            loyaltyPoints += points;
        } else {
            System.out.println("Error: Amount cannot be negative.");
        }
    }

    /**
     * Gets the customer name.
     *
     * @return customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the customer name.
     *
     * @param name new customer name
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid customer name.");
        }
    }

    /**
     * Checks whether the customer is a student.
     *
     * @return true if student
     */
    public boolean isStudent() {
        return student;
    }

    /**
     * Sets the student status.
     *
     * @param student student status
     */
    public void setStudent(boolean student) {
        this.student = student;
    }

    /**
     * Gets the customer's loyalty points.
     *
     * @return loyalty points
     */
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /**
     * Sets the customer's loyalty points.
     *
     * @param loyaltyPoints new loyalty points
     */
    public void setLoyaltyPoints(int loyaltyPoints) {
        if (loyaltyPoints >= 0) {
            this.loyaltyPoints = loyaltyPoints;
        } else {
            System.out.println("Error: Loyalty points cannot be negative.");
        }
    }
}
