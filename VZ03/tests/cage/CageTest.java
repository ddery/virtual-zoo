package cage;

import animal.species.Cat;
import animal.species.Elephant;
import animal.species.Monkey;
import org.junit.Test;
import util.Global;
import zoo.Zoo;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class CageTest {
    @Test
    public void OverallTest() {
        Zoo zoo = new Zoo(20,20);
        Cage cage = new Cage(zoo,0,0,20,20);
        cage.addAnimal(new Cat(true),1);
        cage.addAnimal(new Elephant(true),1);
        cage.addAnimal(new Monkey(true),1);
        assertTrue(cage.getCageNumber()==0);
        assertTrue(cage.getNbCage()==1);
        assertTrue(cage.getnAnimal()==3);
        assertEquals(0.39, cage.getFoodWeight(Global.CARN), 0.02);
        assertEquals(500.0, cage.getFoodWeight(Global.HERB), 0.02);
        assertEquals(3.8, cage.getFoodWeight((short) (Global.HERB+Global.CARN)), 0.02);
    }
}