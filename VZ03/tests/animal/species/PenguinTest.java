package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class PenguinTest {
    @Test
    public void OverallTest() {
        Penguin animal= new Penguin(true);
        assertTrue(animal.getName().equals("Penguin"));
        assertTrue(animal.isDomestic());
        assertTrue(animal.foodConsumption()==3);
        assertTrue(animal.getBioType()== Global.WATER+Global.LAND);
        assertTrue(animal.getDietType()==Global.CARN);
        assertTrue(animal.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(animal.getWeight()==30);
    }
}