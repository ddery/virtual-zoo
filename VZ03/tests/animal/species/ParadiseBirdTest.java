package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class ParadiseBirdTest {
    @Test
    public void OverallTest() {
        ParadiseBird animal= new ParadiseBird(true);
        assertTrue(animal.getName().equals("ParadiseBird"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==0.05);
        assertTrue(animal.getBioType()== Global.AIR);
        assertTrue(animal.getDietType()==Global.CARN+Global.HERB);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==0.5);
    }
}