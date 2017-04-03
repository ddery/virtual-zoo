package cell.facility.road.entrance;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class EntranceTest {

    @Test
    public void OverallTest() {
        Entrance road = new Entrance();
        assertTrue(road.cekTypeCell(Global.ENTRANCE));
    }
}