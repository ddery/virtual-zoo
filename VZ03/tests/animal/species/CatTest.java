package animal.species;

import animal.species.Cat;
import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Abdurahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class CatTest {
    @Test
    public void OverallTest() {
        Cat cat= new Cat(true);
        assertTrue(cat.getName().equals("Cat"));
        assertTrue(cat.isDomestic());
        assertTrue(cat.foodConsumption()==0.39);
        assertTrue(cat.getBioType()== Global.LAND);
        assertTrue(cat.getDietType()==Global.CARN);
        assertTrue(cat.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(cat.getWeight()==3.9);
        assertTrue(cat.numberOfHands()==0);
        assertTrue(cat.numberOfLegs()==4);
    }
}