package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class PumaTest {
    @Test
    public void OverallTest(){
        Puma animal= new Puma(false);
        assertTrue(animal.getName().equals("Puma"));
        assertFalse(animal.isDomestic());
        assertTrue(animal.foodConsumption()==18);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.numberOfHands()==0);
        assertTrue(animal.numberOfLegs()==4);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==180);
    }
}