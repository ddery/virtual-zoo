package cell.habitat.airhabitat;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class AirHabitatTest {
    @Test
    public void airHabitatTest() {
        AirHabitat ah = new AirHabitat();
        assertTrue(ah.cekTypeCell(Global.AIR));
    }
}