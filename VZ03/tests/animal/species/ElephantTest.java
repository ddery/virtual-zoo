package animal.species;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * Created by adr_rahman on 3/29/2017.
 */
public class ElephantTest {
    @Test
    public void OverallTest(){
        Elephant chim= new Elephant(true);
        assertTrue(chim.getName().equals("Elephant"));
        assertTrue(chim.isDomestic());
        assertTrue(chim.foodConsumption()==500);
        assertTrue(chim.getBioType()== Global.LAND);
        assertTrue(chim.numberOfHands()==0);
        assertTrue(chim.numberOfLegs()==4);
        assertTrue(chim.getDietType()==Global.HERB);
        assertTrue(chim.getRespiratoryOrgan()==Global.LUNG);
        assertTrue(chim.getWeight()==5000);
    }
}