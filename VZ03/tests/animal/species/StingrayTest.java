package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class StingrayTest {

    @Test
    public void OverallTest() {
        Stingray animal= new Stingray(true);
        assertTrue(animal.getName().equals("Stingray"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==10);
        assertTrue(animal.getBioType()== Global.WATER);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.GILL);
        assertTrue(animal.getWeight()==100);
        assertFalse(animal.isHarmful());
    }
}