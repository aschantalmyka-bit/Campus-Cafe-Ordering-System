
/**
 * Represents a baked pastry sold in the campus cafe.
 *
 * @author Your Name
 * @version 1.0
 */
public class Pastry extends MenuItem {

    private boolean warmed;

    /**
     * Creates a pastry with default values.
     */
    public Pastry() {
        super();
        warmed = false;
    }

    /**
     * Creates a pastry with specific information.
     * @param name pastry name
     * @param basePrice pastry base price
     * @param itemCode pastry code
     * @param warmed indicates if the pastry is warmed
     */
    public Pastry(String name, double basePrice,
                  String itemCode, boolean warmed) {
        super(name, basePrice, itemCode);
        this.warmed = warmed;
    }

    /**
     * Computes the pastry price.
     * @return final pastry price
     */
    @Override
    public double computePrice() {
        if (warmed) {
            return basePrice + 10;
        } else {
            return basePrice;
        }
    }

    /**
     * Returns the pastry description.
     * @return pastry description
     */
    @Override
    public String getDescription() {
        if (warmed) {
            return super.getDescription() + " (Warmed)";
        } else {
            return super.getDescription();
        }
    }

    /**
     * Checks whether the pastry is warmed.
     * @return true if warmed
     */
    public boolean isWarmed() {
        return warmed;
    }

    /**
     * Sets the warming status.
     * @param warmed warming status
     */
    public void setWarmed(boolean warmed) {
        this.warmed = warmed;
    }
}
