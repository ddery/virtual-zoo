package cell.facility.road.entrance;
import cell.facility.road.Road;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Entrance extends Road{
    /**
     * Road constructor
     * <p>
     * Make an Entrance Road type cell, can be used by people
     * the road_type for Entrance Road = "Entrance"
     */
    public Entrance() {
        super();
        super.SetRoadType("Entrance");
        super.SetType('E');
    }
}
