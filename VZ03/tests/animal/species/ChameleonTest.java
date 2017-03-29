package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class ChameleonTest {
    @Test
    public void OverallTest() {
        Chameleon cham= new Chameleon("Chameleon",true);
        assertTrue(cham.getName().equals("Chameleon"));
        assertTrue(cham.isDomestic());
        assertTrue(cham.foodConsumption()==0.1);
        assertTrue(cham.getBioType()== Global.LAND);
        assertTrue(cham.getDietType()==Global.CARN);
        assertTrue(cham.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(cham.getWeight()==1);
    }
}