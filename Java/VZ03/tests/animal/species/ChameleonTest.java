package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class ChameleonTest {
    @Test
    public void OverallTest() {
        Chameleon cham= new Chameleon(true);
        assertTrue(cham.getName().equals("Chameleon"));
        assertTrue(cham.isDomestic());
        assertTrue(cham.foodConsumption()==0.1);
        assertTrue(cham.getBioType()== Global.LAND);
        assertTrue(cham.getDietType()==Global.CARN);
        assertTrue(cham.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(cham.getWeight()==1);
    }
}