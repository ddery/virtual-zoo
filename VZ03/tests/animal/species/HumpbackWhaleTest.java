package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class HumpbackWhaleTest {
    @Test
    public void OverallTest() {
        HumpbackWhale animal= new HumpbackWhale(true);
        assertTrue(animal.getName().equals("HumpbackWhale"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==3600);
        assertTrue(animal.getBioType()== Global.WATER);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.numberOfHands()==0);
        assertTrue(animal.numberOfLegs()==0);
        assertTrue(animal.getWeight()==36000);
    }
}