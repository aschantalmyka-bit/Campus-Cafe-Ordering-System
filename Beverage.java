/**
 * Represents a beverage sold in the campus cafe.
 *
 * @author Your Name
 * @version 1.0
 */
public class Beverage extends MenuItem {

    private String size;

    /**
     * Creates a beverage with default values.
     */
    public Beverage() {
        super();
        size = "S";
    }

    /**
     * Creates a beverage with specific information.
     * @param name beverage name
     * @param basePrice beverage base price
     * @param itemCode beverage code
     * @param size beverage size
     */
    public Beverage(String name, double basePrice,
                    String itemCode, String size) {
        super(name, basePrice, itemCode);
        this.size = "S";
        setSize(size);
    }

    /**
     * Computes the beverage price based on size.
     * @return final beverage price
     */
    @Override
    public double computePrice() {
        if (size.equals("L")) {
            return basePrice + 25;
        } else if (size.equals("M")) {
            return basePrice + 15;
        } else {
            return basePrice;
        }
    }

    /**
     * Returns the beverage description including size.
     * @return beverage description
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " Size: " + size;
    }

    /**
     * Gets the beverage size.
     * @return beverage size
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the beverage size.
     * @param size S, M, or L
     */
    public void setSize(String size) {
        if (size != null &&
            (size.equals("S") || size.equals("M") ||
             size.equals("L"))) {
            this.size = size;
        } else {
            System.out.println("Error: Size must be S, M, or L.");
        }
    }
}
