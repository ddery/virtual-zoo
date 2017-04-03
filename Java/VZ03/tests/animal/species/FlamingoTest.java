package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class FlamingoTest {
    @Test
    public void OverallTest() {
        Flamingo animal= new Flamingo(true);
        assertTrue(animal.getName().equals("Flamingo"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.2);
        assertTrue(animal.getBioType()== Global.AIR+Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==2);
    }
}