package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class DolphinTest {
    @Test
    public void OverallTest() {
        Dolphin dolphin= new Dolphin(true);
        assertTrue(dolphin.getName().equals("Dolphin"));
        assertTrue(dolphin.isDomestic());
        assertTrue(dolphin.numberOfHands()==0);
        assertTrue(dolphin.numberOfLegs()==4);
        assertTrue(dolphin.foodConsumption()==63.5);
        assertTrue(dolphin.getBioType()== Global.WATER);
        assertTrue(dolphin.getDietType()==Global.CARN);
        assertTrue(dolphin.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(dolphin.getWeight()==635);
    }
}