package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class EagleTest {
    @Test
    public void OverallTest() {
        Eagle eagle= new Eagle(true);
        assertTrue(eagle.getName().equals("Eagle"));
        assertTrue(eagle.isDomestic());
        assertTrue(eagle.foodConsumption()==0.41);
        assertTrue(eagle.getBioType()== Global.AIR);
        assertTrue(eagle.getDietType()==Global.CARN);
        assertTrue(eagle.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(eagle.getWeight()==4.1);
    }
}