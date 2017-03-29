import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by nim_13515024 on 29/03/17.
 */
@SuppressWarnings("ALL")
public class CageTest {
    @Test
    public void OverallTest() {
        Cage cage = new Cage(10,3);
        assertTrue(cage.getSize()==10);
        assertTrue(cage.getnAnimal()==3);
        assertTrue(cage.isFull());
        //assertTrue(cage.getCageNumber()==1);
        //assertTrue(cage.getNbCage()==2);
    }
    @Test
    public void AssignTest() {
        Cage cage = new Cage(3,0);
        cage.setCell(new Cell('L'));
        assertTrue(cage.getCell(0).isLH());
        cage.setCell(new Cell('W'));
        assertTrue(cage.getCell(1).isWH());
        cage.setCell(new Cell('A'));
        assertTrue(cage.getCell(2).isAH());
        assertFalse(cage.isFull());
    }
}