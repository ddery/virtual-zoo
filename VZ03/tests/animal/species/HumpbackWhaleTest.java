package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
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