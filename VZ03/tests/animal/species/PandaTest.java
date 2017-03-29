package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class PandaTest {
    @Test
    public void OverallTest() {
        Panda animal= new Panda(true);
        assertTrue(animal.getName().equals("Panda"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==10);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN+Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.numberOfHands()==0);
        assertTrue(animal.numberOfLegs()==4);
        assertTrue(animal.getWeight()==100);
    }
}