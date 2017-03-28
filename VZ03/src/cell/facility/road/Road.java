package cell.facility.road;
import cell.facility.Facility;
import renderable.Renderable;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class Road extends Facility {
    /**
     * road_type define the type of the road
     * as an identifier for a road-type cell
     */
    private String roadType;
    /**
     * Road constructor
     * <p>
     * Make a Road type cell, can be used by people
     * the default for road_type = "default_road"
     */
    public Road() {
        super.setType(Global.ROAD);
        roadType = "default_road";
    }
    /**
     * Getter for road_type
     * <p>
     * Give the type of the road
     * @return string type road type
     */
    public String getRoadType() {
        return roadType;
    }
    /**
     * Setter for road_type
     * <p>
     * Give the new type of the road
     * @param typeRoad = new road type
     */
    protected void setRoadType(String typeRoad) {
        roadType = typeRoad;
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
