package cell.facility.park;
import cell.facility.Facility;
import renderable.Renderable;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class Park extends Facility implements Renderable {
    /**
     * park_name define the name of the park
     * as an identifier for a park-type cell
     */
    private String park_name;
    /**
     * Park constructor
     * <p>
     * Make a Park type cell, can be used by people
     * @param name : name of park that will be assigned
     */
    public Park(String name) {
        super.SetType('P');
        park_name = name;
    }
    /**
     * Getter for park_name
     * <p>
     * Give the name of the park
     * @return string type park name
     */
    public String GetParkName() { return park_name; }
    /**
     * Display Park into monitor
     * <p>
     * Display Park based on its characteristics
     */
    public void Render() {
        System.out.print(' ');
    }
}
