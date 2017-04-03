package cell.facility.park;
import cell.facility.Facility;
import renderable.Renderable;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class Park extends Facility implements Renderable {
    /**
     * Park constructor
     * <p>
     * Make a Park type cell, can be used by people
     */
    public Park() {
        super.setType(Global.PARK);
    }

    /**
     * Display Park into monitor
     * <p>
     * Display Park based on its characteristics
     */
    public void render() { System.out.print(Global.ANSI_GREEN_BACKGROUND + "  " + Global.ANSI_RESET); }
}
