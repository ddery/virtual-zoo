package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class KomodoDragonTest {
    @Test
    public void OverallTest() {
        KomodoDragon animal= new KomodoDragon(true);
        assertTrue(animal.getName().equals("KomodoDragon"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==7);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==70);
    }
}