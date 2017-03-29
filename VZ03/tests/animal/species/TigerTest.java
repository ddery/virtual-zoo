package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class TigerTest {

    @Test
    public void OverallTest(){
        Tiger animal= new Tiger(false);
        assertTrue(animal.getName().equals("Tiger"));
        assertFalse(animal.isDomestic());
        assertTrue(animal.foodConsumption()==21);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.numberOfHands()==0);
        assertTrue(animal.numberOfLegs()==4);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==210);
    }
}