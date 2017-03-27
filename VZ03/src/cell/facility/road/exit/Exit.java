package cell.facility.road.exit;
import cell.facility.road.Road;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class Exit extends Road{
    /**
     * Road constructor
     * <p>
     * Make an Exit Road type cell, can be used by people
     * the road_type for Exit Road = "Exit"
     */
    public Exit() {
        super();
        super.SetRoadType("Exit");
        super.SetType('e');
    }
}