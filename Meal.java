/**Represents a rice meal sold at the campus cafe.
 * A meal may be upsized and may include extra side dishes.
 * @author Dangculos Aschantal Myka B.
 * @version 1.0
 */
public class Meal extends MenuItem {
    private boolean upsized;
    private int extraSides;

    /** Creates a regular meal with no extra sides.
     */
    public Meal() {
        super();
        upsized = false;
        extraSides = 0;
    }

    /**Creates a meal with supplied details.
     * @param name the meal name
     * @param basePrice the original price
     * @param itemCode the meal code
     * @param upsized true if upsized
     * @param extraSides the number of extra sides
     */
    public Meal(String name, double basePrice, String itemCode,
                boolean upsized, int extraSides) {
        super(name, basePrice, itemCode);
        this.upsized = upsized;
        this.extraSides = 0;
        setExtraSides(extraSides);
    }

    /**Computes the meal price.
     * @return the computed meal price
     */
    @Override
    public double computePrice() {
        double price = getBasePrice();

        if (upsized) {
            price += 20;
        }

        price += 12 * extraSides;
        return price;
    }

    /** Returns the meal description.
     * @return the meal description
     */
    @Override
    public String getDescription() {
        String sizeDescription;

        if (upsized) {
            sizeDescription = "Upsized";
        } else {
            sizeDescription = "Regular";
        }

        return super.getDescription() + " " + sizeDescription
                + ", " + extraSides + " sides";
    }

    /** Checks whether the meal is upsized.
     * @return true if upsized
     */
    public boolean isUpsized() {
        return upsized;
    }

    /** Changes the meal size status.
     * @param upsized true to upsize the meal
     */
    public void setUpsized(boolean upsized) {
        this.upsized = upsized;
    }

    /** Returns the number of extra sides.
     * @return the number of extra sides
     */
    public int getExtraSides() {
        return extraSides;
    }

    /** Changes the number of extra sides.
     * @param extraSides the new number of extra sides
     */
    public void setExtraSides(int extraSides) {
        if (extraSides >= 0) {
            this.extraSides = extraSides;
        } else {
            System.out.println("Error: extra sides cannot be negative.");
        }
    }
}
