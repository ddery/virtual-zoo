package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class LionTest {
    @Test
    public void OverallTest() {
        Lion animal= new Lion(true);
        assertTrue(animal.getName().equals("Lion"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==20);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.getDietType()==Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.numberOfHands()==0);
        assertTrue(animal.numberOfLegs()==4);
        assertTrue(animal.getWeight()==200);
    }
}