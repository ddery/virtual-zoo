package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class SalmonTest {
    @Test
    public void OverallTest() {
        Salmon animal= new Salmon(true);
        assertTrue(animal.getName().equals("Salmon"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.4);
        assertTrue(animal.getBioType()== Global.WATER);
        assertTrue(animal.getDietType()==Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.GILL);
        assertTrue(animal.getWeight()==4);
        assertFalse(animal.isHarmful());
    }
}