
/**
 * Represents a cafe order containing a customer and up to three items.
 *
 * @author Your Name
 * @version 1.0
 */
public class Order {

    private Customer customer;
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private int itemCount;
    private String orderId;

    private double voucherAmount;
    private boolean pointsAwarded;

    /* Creates an order for a customer.
     * @param orderId unique order identification
     * @param customer customer placing the order
     */
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        itemCount = 0;
        voucherAmount = 0;
        pointsAwarded = false;
    }

    /* Adds a menu item to the first available slot.
     * @param item menu item to add
     * @return true if added successfully
     */
    public boolean addItem(MenuItem item) {

        if (item == null) {
            System.out.println("Error: Cannot add an empty item.");
            return false;
        }

        if (itemCount >= 3) {
            System.out.println(
                "Order is full. Cannot add " +
                item.getDescription() + "."
            );
            return false;
        } else if (item1 == null) {
            item1 = item;
            itemCount++;
            return true;
        } else if (item2 == null) {
            item2 = item;
            itemCount++;
            return true;
        } else if (item3 == null) {
            item3 = item;
            itemCount++;
            return true;
        }

        return false;
    }

    /**
     * Computes the subtotal of all ordered items.
     *
     * @return total price before discounts
     */
    public double computeSubtotal() {
        double subtotal = 0;

        if (item1 != null) {
            subtotal += item1.computePrice();
        }

        if (item2 != null) {
            subtotal += item2.computePrice();
        }

        if (item3 != null) {
            subtotal += item3.computePrice();
        }

        return subtotal;
    }

    /*Computes the total with student discount if applicable.
     
     * @return final amount after discount
     */
    public double computeTotal() {
        double subtotal = computeSubtotal();
        double discount = 0;

        voucherAmount = 0;

        if (customer.isStudent()) {
            discount = subtotal * 0.10;
        }

        return subtotal - discount;
    }

    /* Computes the total after student discount and voucher.
     * @param voucher voucher amount
     * @return final total, never below zero
     */
    public double computeTotal(double voucher) {
        double subtotal = computeSubtotal();
        double discount = 0;

        if (customer.isStudent()) {
            discount = subtotal * 0.10;
        }

        if (voucher < 0) {
            System.out.println("Error: Voucher cannot be negative.");
            voucher = 0;
        }

        voucherAmount = voucher;

        double total = subtotal - discount - voucherAmount;

        if (total < 0) {
            total = 0;
        }

        return total;
    }

    /**
     * Prints the order receipt and updates loyalty points.
     */
    public void printReceipt() {

        double subtotal = computeSubtotal();
        double discount = 0;

        if (customer.isStudent()) {
            discount = subtotal * 0.10;
        }

        double total = subtotal - discount - voucherAmount;

        if (total < 0) {
            total = 0;
        }

        System.out.println("\nOrder #" + orderId +
                           " - " + customer.getName() +
                           (customer.isStudent() ? " (Student)" : ""));

        if (item1 != null) {
            System.out.printf("  %-28s %8.2f%n",
                item1.getDescription(), item1.computePrice());
        }

        if (item2 != null) {
            System.out.printf("  %-28s %8.2f%n",
                item2.getDescription(), item2.computePrice());
        }

        if (item3 != null) {
            System.out.printf("  %-28s %8.2f%n",
                item3.getDescription(), item3.computePrice());
        }

        System.out.printf("  Subtotal:                  %.2f%n",
                          subtotal);

        if (discount > 0) {
            System.out.printf("  Student discount (10%%):  -%.2f%n",
                              discount);
        }

        if (voucherAmount > 0) {
            System.out.printf("  Voucher:                  -%.2f%n",
                              voucherAmount);
        }

        System.out.printf("  TOTAL:                     %.2f%n",
                          total);

        // Award points only once per order receipt.
        if (!pointsAwarded) {
            customer.addPoints(total);
            pointsAwarded = true;
        }

        System.out.println("  Loyalty points: " +
                           customer.getLoyaltyPoints());
    }

    /**
     * Gets the order identification.
     *
     * @return order ID
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Gets the customer who placed the order.
     *
     * @return customer object
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Gets the number of items in the order.
     *
     * @return item count
     */
    public int getItemCount() {
        return itemCount;
    }
}
