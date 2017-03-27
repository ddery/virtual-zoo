package cell.facility.restaurant;
import cell.facility.Facility;
import renderable.Renderable;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Restaurant extends Facility implements Renderable {
    /**
     * resto_name define the name of the restaurant
     * as an identifier for a restaurant-type cell
     */
    private String resto_name;
    /**
     * Restaurant constructor
     * <p>
     * Make a Restaurant type cell, can be used by people
     * @param name : name of restaurant that will be assigned
     */
    public Restaurant(String name) {
        super.SetType('R');
        resto_name = name;
    }
    /**
     * Getter for resto_name
     * <p>
     * Give the name of the restaurant
     * @return string type restaurant name
     */
    public String GetRestoName() { return resto_name; }
    /**
     * Display Restaurant into monitor
     * <p>
     * Display Restaurant based on its characteristics
     */
    public void Render() {
        System.out.print(' ');
    }
}
