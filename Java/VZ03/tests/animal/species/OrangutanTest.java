package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class OrangutanTest {
    @Test
    public void OverallTest() {
        Orangutan animal= new Orangutan(true);
        assertTrue(animal.getName().equals("Orangutan"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==8);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN+Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.numberOfHands()==2);
        assertTrue(animal.numberOfLegs()==2);
        assertTrue(animal.getWeight()==80);
    }
}