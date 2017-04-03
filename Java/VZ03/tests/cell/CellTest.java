package cell;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class CellTest {
    @Test
    public void cellTest() {
        Cell cell = new Cell();
        assertTrue(cell.getType() == ' ');
        assertTrue(cell.getAnimal() == null);
        assertFalse(cell.isAnimal());
        assertFalse(cell.cekTypeCell(Global.AIR));
    }
}