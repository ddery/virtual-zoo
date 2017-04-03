import org.junit.*;
import static org.junit.Assert.*;

/**
 * @author      Abdurrahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
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