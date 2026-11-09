/** Represents a drink sold at the campus cafe.
 * Its price depends on the selected size.
 * @author Dangculos Aschantal Myka B.
 * @version 1.0*/
public class Beverage extends MenuItem {
    private String size;

    /** Creates a small beverage with default details.
     */
    public Beverage() {
        super();
        size = "S";
    }

    /**Creates a beverage with supplied details.
     * @param name the beverage name
     * @param basePrice the original price
     * @param itemCode the beverage code
     * @param size the beverage size
     */
    public Beverage(String name, double basePrice,
                    String itemCode, String size) {
        super(name, basePrice, itemCode);
        this.size = "S";
        setSize(size);
    }

    /** Computes the beverage price based on its size.
     * @return the computed price
     */
    @Override
    public double computePrice() {
        if (size.equals("M")) {
            return getBasePrice() + 15;
        } else if (size.equals("L")) {
            return getBasePrice() + 25;
        } else {
            return getBasePrice();
        }
    }

    /** Returns the beverage description.
     * @return the beverage description
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " Size: " + size;
    }

    /** Returns the beverage size.
     * @return the beverage size
     */
    public String getSize() {
        return size;
    }

    /**Changes the beverage size.
     * @param size the new size: S, M, or L
     */
    public void setSize(String size) {
        if (size != null &&
            (size.equalsIgnoreCase("S")
            || size.equalsIgnoreCase("M")
            || size.equalsIgnoreCase("L"))) {
            this.size = size.toUpperCase();
        } else {
            System.out.println("Error: size must be S, M, or L.");
        }
    }
}
