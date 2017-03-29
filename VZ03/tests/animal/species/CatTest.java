package animal.species;

import animal.species.Cat;
import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by nim_13515024 on 29/03/17.
 */
@SuppressWarnings("ALL")
public class CatTest {
    @Test
    public void OverallTest() {
        Cat cat= new Cat("Kucing", true);
        assertTrue(cat.getName().equals("Kucing"));
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