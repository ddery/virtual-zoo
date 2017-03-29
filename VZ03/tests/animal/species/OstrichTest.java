package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class OstrichTest {
    @Test
    public void OverallTest() {
        Ostrich animal= new Ostrich(true);
        assertTrue(animal.getName().equals("Ostrich"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==14.5);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN+Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==145);
    }
}