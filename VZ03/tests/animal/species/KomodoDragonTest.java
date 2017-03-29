package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
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