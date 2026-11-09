/** Represents a general menu item sold at the campus cafe.
 * This abstract class stores common item information.
 * @author Dangculos Aschantal Myka B.
 * @version 1.0
 */
public abstract class MenuItem {
    private String name;
    private double basePrice;
    private String itemCode;

    /**Creates a menu item with default values.
     */
    public MenuItem() {
        name = "Unnamed Item";
        basePrice = 0.0;
        itemCode = "N/A";
    }

    /** Creates a menu item with supplied details.
     * @param name the item name
     * @param basePrice the original price
     * @param itemCode the item code
     */
    public MenuItem(String name, double basePrice, String itemCode) {
        this();

        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("Error: item name cannot be empty.");
        }

        if (basePrice >= 0) {
            this.basePrice = basePrice;
        } else {
            System.out.println("Error: base price cannot be negative.");
        }

        if (itemCode != null && !itemCode.trim().isEmpty()) {
            this.itemCode = itemCode.trim();
        } else {
            System.out.println("Error: item code cannot be empty.");
        }
    }

    /**Calculates the final price of the menu item.
     * @return the computed price
     */
    public abstract double computePrice();

    /** Returns the basic item description.
     * @return the item description
     */
    public String getDescription() {
        return name + " [" + itemCode + "]";
    }

    /**Returns the item name.
     * @return the item name
     */
    public String getName() {
        return name;
    }

    /** Changes the item name.
     * @param name the new item name
     */
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            System.out.println("Error: item name cannot be empty.");
        }
    }

    /** Returns the original item price.
     * @return the base price
     */
    public double getBasePrice() {
        return basePrice;
    }

    /** Changes the base price.
     * @param basePrice the new base price
     */
    public void setBasePrice(double basePrice) {
        if (basePrice >= 0) {
            this.basePrice = basePrice;
        } else {
            System.out.println("Error: base price cannot be negative.");
        }
    }

    /** Returns the item code.
     * @return the item code
     */
    public String getItemCode() {
        return itemCode;
    }

    /**Changes the item code.
     * @param itemCode the new item code
     */
    public void setItemCode(String itemCode) {
        if (itemCode != null && !itemCode.trim().isEmpty()) {
            this.itemCode = itemCode.trim();
        } else {
            System.out.println("Error: item code cannot be empty.");
        }
    }
}
