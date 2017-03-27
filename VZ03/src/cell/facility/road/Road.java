package cell.facility.road;
import cell.facility.Facility;
import renderable.Renderable;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class Road extends Facility implements Renderable {
    /**
     * road_type define the type of the road
     * as an identifier for a road-type cell
     */
    private String road_type;
    /**
     * Road constructor
     * <p>
     * Make a Road type cell, can be used by people
     * the default for road_type = "default_road"
     */
    public Road() {
        super.SetType('r');
        road_type = "default_road";
    }
    /**
     * Getter for road_type
     * <p>
     * Give the type of the road
     * @return string type road type
     */
    public String GetRoadType() {
        return road_type;
    }
    /**
     * Setter for road_type
     * <p>
     * Give the new type of the road
     * @param type_road = new road type
     */
    protected void SetRoadType(String type_road) {
        road_type = type_road;
    }
    /**
     * Display Road into monitor
     * <p>
     * Display Road based on its characteristics
     */
    public void Render() {
        System.out.print(' ');
    }
}
