package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class FlamingoTest {
    @Test
    public void OverallTest() {
        Flamingo animal= new Flamingo(true);
        assertTrue(animal.getName().equals("Flamingo"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.2);
        assertTrue(animal.getBioType()== Global.AIR+Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==2);
    }
}