package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class SalamanderTest {
    @Test
    public void OverallTest() {
        Salamander animal= new Salamander(true);
        assertTrue(animal.getName().equals("Salamander"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.1);
        assertTrue(animal.getBioType()== Global.WATER+Global.LAND);
        assertTrue(animal.getDietType()==Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG+Global.GILL);
        assertTrue(animal.getWeight()==1);
    }
}