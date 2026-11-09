/** Represents a customer who places orders at the campus cafe.
 * Customers may be students and can earn loyalty points.
 * @author Dangculos Aschantal Myka B.
 * @version 1.0
 */
public class Customer {
    private String name;
    private boolean student;
    private int loyaltyPoints;

    /** Creates a guest customer.
     */
    public Customer() {
        name = "Guest";
        student = false;
        loyaltyPoints = 0;
    }

    /**Creates a non-student customer.
     * @param name the customer's name
     */
    public Customer(String name) {
        this();
        setName(name);
    }

    /**Creates a customer with student status.
     * @param name the customer's name
     * @param student true if the customer is a student
     */
    public Customer(String name, boolean student) {
        this(name);
        this.student = student;
    }

    /** Adds a specified number of loyalty points.
     * @param points the points to add
     */
    public void addPoints(int points) {
        if (points >= 0) {
            loyaltyPoints += points;
        } else {
            System.out.println("Error: points cannot be negative.");
        }
    }

    /** Adds one point for every fifty pesos spent.
     * @param amountSpent the amount spent
     */
    public void addPoints(double amountSpent) {
        if (amountSpent >= 0) {
            int points = (int) (amountSpent / 50.0);
            addPoints(points);
        } else {
            System.out.println("Error: amount spent cannot be negative.");
        }
    }

    /**Returns the customer's name.
     * @return the customer's name
     */
    public String getName() {
        return name;
    }

    /** Changes the customer's name.
     * @param name the new customer name
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("Error: customer name cannot be empty.");
        }
    }

    /**Checks whether the customer is a student.
     * @return true if the customer is a student
     */
    public boolean isStudent() {
        return student;
    }

    /**Changes the customer's student status.
     * @param student the customer's student status
     */
    public void setStudent(boolean student) {
        this.student = student;
    }

    /**Returns the customer's loyalty points.
     * @return the current loyalty points
     */
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    /** Changes the customer's loyalty point balance.
     * @param loyaltyPoints the new points balance
     */
    public void setLoyaltyPoints(int loyaltyPoints) {
        if (loyaltyPoints >= 0) {
            this.loyaltyPoints = loyaltyPoints;
        } else {
            System.out.println("Error: loyalty points cannot be negative.");
        }
    }
    }
