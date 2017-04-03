package cell.facility.restaurant;
import cell.facility.Facility;
import renderable.Renderable;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class Restaurant extends Facility implements Renderable {
    /**
     * Restaurant constructor
     * <p>
     * Make a Restaurant type cell, can be used by people
     */
    public Restaurant() {
        super.setType(Global.RESTAURANT);
    }

    /**
     * Display Restaurant into monitor
     * <p>
     * Display Restaurant based on its characteristics
     */
    public void render() {
        System.out.print(Global.ANSI_PURPLE_BACKGROUND + "  " + Global.ANSI_RESET);
    }
}
