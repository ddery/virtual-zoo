package cell.facility.road.exit;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class ExitTest {
    @Test
    public void OverallTest() {
        Exit road = new Exit();
        assertTrue(road.cekTypeCell(Global.EXIT));
    }
}