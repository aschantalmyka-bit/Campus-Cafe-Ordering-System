/*Represents a baked item sold at the campus cafe.
 * A pastry may be warmed for an additional fee.
 * @author Dangculos Aschantal Myka B.
 * @version 1.0 */
public class Pastry extends MenuItem {
    private boolean warmed;

    /** Creates a pastry that is not warmed.
     */
    public Pastry() {
        super();
        warmed = false;
    }

    /**Creates a pastry with supplied details.
     * @param name the pastry name
     * @param basePrice the original price
     * @param itemCode the pastry code
     * @param warmed true if warmed
     */
    public Pastry(String name, double basePrice,
                  String itemCode, boolean warmed) {
        super(name, basePrice, itemCode);
        this.warmed = warmed;
    }

    /** Computes the pastry price.
     * @return the computed pastry price
     */
    @Override
    public double computePrice() {
        if (warmed) {
            return getBasePrice() + 10;
        } else {
            return getBasePrice();
        }
    }

    /**Returns the pastry description.
     * @return the pastry description
     */
    @Override
    public String getDescription() {
        if (warmed) {
            return super.getDescription() + " (Warmed)";
        } else {
            return super.getDescription() + " (Not warmed)";
        }
    }

    /**Checks whether the pastry is warmed.
     * @return true if warmed
     */
    public boolean isWarmed() {
        return warmed;
    }

    /** Changes the warming status.
     * @param warmed true to warm the pastry
     */
    public void setWarmed(boolean warmed) {
        this.warmed = warmed;
    }
}
