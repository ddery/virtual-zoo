package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class GoliathFrogTest {
    @Test
    public void OverallTest() {
        GoliathFrog animal= new GoliathFrog(true);
        assertTrue(animal.getName().equals("GoliathFrog"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==500);
        assertTrue(animal.getBioType()== Global.WATER+Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG+Global.GILL);
        assertTrue(animal.getWeight()==5000);
    }
}