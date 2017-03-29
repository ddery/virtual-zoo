package cell.facility.road;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class RoadTest {
    @Test
    public void OverallTest() {
        Road road = new Road();
        assertTrue(road.cekTypeCell(Global.ROAD));
    }
}