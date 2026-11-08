
/**
 * Represents a rice meal sold in the campus cafe.
 *
 * @author Your Name
 * @version 1.0
 */
public class Meal extends MenuItem {

    private boolean upsized;
    private int extraSides;

    /**
     * Creates a meal with default values.
     */
    public Meal() {
        super();
        upsized = false;
        extraSides = 0;
    }

    /**
     * Creates a meal with specific information.
     *
     * @param name meal name
     * @param basePrice meal base price
     * @param itemCode meal code
     * @param upsized indicates if the meal is upsized
     * @param extraSides number of extra sides
     */
    public Meal(String name, double basePrice, String itemCode,
                boolean upsized, int extraSides) {
        super(name, basePrice, itemCode);
        this.upsized = upsized;
        this.extraSides = 0;
        setExtraSides(extraSides);
    }

    /**
     * Computes the final meal price.
     
     * @return final meal price
     */
    @Override
    public double computePrice() {
        double price = basePrice;

        if (upsized) {
            price += 20;
        }

        price += 12 * extraSides;

        return price;
    }

    /**
     * Returns the meal description.
     *
     * @return meal description
     */
    @Override
    public String getDescription() {
        String status;

        if (upsized) {
            status = "Upsized";
        } else {
            status = "Regular";
        }

        return super.getDescription() + ", " +
               status + ", " + extraSides + " sides";
    }

    /*
     * Checks whether the meal is upsized.
     *
     * @return true if upsized
     */
    public boolean isUpsized() {
        return upsized;
    }

    /**
     * Sets the meal size status.
     *
     * @param upsized true for upsized
     */
    public void setUpsized(boolean upsized) {
        this.upsized = upsized;
    }

    /**
     * Gets the number of extra sides.
     *
     * @return number of extra sides
     */
    public int getExtraSides() {
        return extraSides;
    }

    /**
     * Sets the number of extra sides.
     *
     * @param extraSides number of sides
     */
    public void setExtraSides(int extraSides) {
        if (extraSides >= 0) {
            this.extraSides = extraSides;
        } else {
            System.out.println("Error: Extra sides cannot be negative.");
        }
    }
}
