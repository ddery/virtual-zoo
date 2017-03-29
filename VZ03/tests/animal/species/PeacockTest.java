package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class PeacockTest {
    @Test
    public void OverallTest() {
        Peacock animal= new Peacock(true);
        assertTrue(animal.getName().equals("Peacock"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.8);
        assertTrue(animal.getBioType()== Global.AIR);
        assertTrue(animal.getDietType()==Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==8);
    }
}