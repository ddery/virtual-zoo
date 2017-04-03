package cell.facility.park;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class ParkTest {


    @Test
    public void OverallTest() {
        Park park = new Park();
        assertTrue(park.cekTypeCell(Global.PARK));
    }
}