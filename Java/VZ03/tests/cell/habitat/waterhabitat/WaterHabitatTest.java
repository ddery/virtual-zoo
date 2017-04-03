package cell.habitat.waterhabitat;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class WaterHabitatTest {
    @Test
    public void waterHabitatTest() {
        WaterHabitat wh = new WaterHabitat();
        assertTrue(wh.cekTypeCell(Global.WATER));
    }
}