
/**
 * Represents the common properties of all cafe menu items.
 *
 * @author Your Name
 * @version 1.0
 */
public abstract class MenuItem {

    protected String name;
    protected double basePrice;
    private String itemCode;

    
    public MenuItem() {
        name = "Unnamed Item";
        basePrice = 0.0;
        itemCode = "N/A";
    }

    /**
     * Creates a menu item using given information.
     * @param name the item name
     * @param basePrice the basic price
     * @param itemCode the item code
     */
    public MenuItem(String name, double basePrice, String itemCode) {
        this.name = name;
        this.basePrice = 0.0;
        this.itemCode = itemCode;
        setBasePrice(basePrice);
    }

    /**
     * Computes the final price of the menu item.
     * @return the computed price
     */
    public abstract double computePrice();

    /**
     * Returns the item's name and code.
     * @return item description
     */
    public String getDescription() {
        return name + " [" + itemCode + "]";
    }

    /**
     * Gets the item name.
     * @return item name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the item name.
     * @param name the new item name
     */
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Error: Invalid item name.");
        }
    }

    /**
     * Gets the base price.
     * @return base price
     */
    public double getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the base price if it is not negative.
     * @param basePrice the new base price
     */
    public void setBasePrice(double basePrice) {
        if (basePrice >= 0) {
            this.basePrice = basePrice;
        } else {
            System.out.println("Error: base price cannot be negative.");
        }
    }

    /**
     * Gets the item code.
     * @return item code
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the item code.
     * @param itemCode the new item code
     */
    public void setItemCode(String itemCode) {
        if (itemCode != null && !itemCode.isEmpty()) {
            this.itemCode = itemCode;
        } else {
            System.out.println("Error: Invalid item code.");
        }
    }
}
