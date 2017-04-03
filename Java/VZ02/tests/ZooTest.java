import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author      Faiz Ghifari Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class ZooTest {
    @Test
    public void zooTestEntrance() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'E');
        assertTrue(vzoo.getCell(0,0).isEntrance());
    }

    @Test
    public void zooTestExit() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'e');
        assertTrue(vzoo.getCell(0,0).isExit());
    }

    @Test
    public void zooTestRestaurant() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'R');
        assertTrue(vzoo.getCell(0,0).isRestaurant());
    }

    @Test
    public void zooTestRoad() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'r');
        assertTrue(vzoo.getCell(0,0).isRoad());
    }

    @Test
    public void zooTestPark() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'P');
        assertTrue(vzoo.getCell(0,0).isPark());
    }

    @Test
    public void zooTestLH() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'L');
        assertTrue(vzoo.getCell(0,0).isLH());
    }

    @Test
    public void zooTestWH() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'W');
        assertTrue(vzoo.getCell(0,0).isWH());
    }

    @Test
    public void zooTestAH() {
        Zoo vzoo = new Zoo(1,1);
        vzoo.setCell(0,0,'A');
        assertTrue(vzoo.getCell(0,0).isAH());
    }
}