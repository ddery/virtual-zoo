package cell.facility.road;
import cell.facility.Facility;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

@SuppressWarnings("ALL")
public class Road extends Facility {
    /**
     * Road constructor
     * <p>
     * Make a Road type cell, can be used by people
     * the default for road_type = "default_road"
     */
    public Road() {
        super.setType(Global.ROAD);
    }

    /**
     * Setter for road_type
     * <p>
     * Give the new type of the road
     * @param typeRoad = new road type
     */
    @SuppressWarnings({"EmptyMethod", "unused"})
    protected void setRoadType(String typeRoad) {
    }
    /**
     * Display Road into monitor
     * <p>
     * Display Road based on its characteristics
     */
    public void render() {
        System.out.print(Global.ANSI_BLACK_BACKGROUND + "  " + Global.ANSI_RESET);
    }
}
