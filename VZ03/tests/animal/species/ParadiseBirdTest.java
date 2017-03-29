package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class ParadiseBirdTest {
    @Test
    public void OverallTest() {
        ParadiseBird animal= new ParadiseBird(true);
        assertTrue(animal.getName().equals("ParadiseBird"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.05);
        assertTrue(animal.getBioType()== Global.AIR);
        assertTrue(animal.getDietType()==Global.CARN+Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==0.5);
    }
}