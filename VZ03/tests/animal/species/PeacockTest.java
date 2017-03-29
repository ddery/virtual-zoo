package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class PeacockTest {
    @Test
    public void OverallTest() {
        Peacock animal= new Peacock(true);
        assertTrue(animal.getName().equals("Peacock"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.8);
        assertTrue(animal.getBioType()== Global.AIR);
        assertTrue(animal.getDietType()==Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==8);
    }
}