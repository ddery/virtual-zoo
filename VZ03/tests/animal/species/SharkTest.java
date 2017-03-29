package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class SharkTest {
    @Test
    public void OverallTest() {
        Shark animal= new Shark(false);
        assertTrue(animal.getName().equals("Shark"));
        assertFalse(animal.isDomestic());
        assertTrue(animal.foodConsumption()==90.7);
        assertTrue(animal.getBioType()== Global.WATER);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.GILL);
        assertTrue(animal.getWeight()==907);
        assertTrue(animal.isHarmful());
    }
}