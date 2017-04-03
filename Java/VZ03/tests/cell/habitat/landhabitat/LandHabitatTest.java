package cell.habitat.landhabitat;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class LandHabitatTest {
    @Test
    public void landHabitatTest() {
        LandHabitat lh = new LandHabitat();
        assertTrue(lh.cekTypeCell(Global.LAND));
    }

}