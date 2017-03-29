package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class OstrichTest {
    @Test
    public void OverallTest() {
        Ostrich animal= new Ostrich(true);
        assertTrue(animal.getName().equals("Ostrich"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==14.5);
        assertTrue(animal.getBioType()== Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN+Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==145);
    }
}