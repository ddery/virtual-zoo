import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author      Faiz Ghifari Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class DriverTest {
    @Test
    public void driverTest() {
        Driver machine = new Driver();
        assertTrue(machine.getnAnimal() == 68);
        assertTrue(machine.getFoodConsum('C') == 1);
        assertTrue(machine.getFoodConsum('H') == 1);
        assertTrue(machine.getFoodConsum('O') == 1);
        assertTrue(machine.getNbCage() == 7);
    }

    @Test
    public void getFoodConsum() throws Exception {
    }

    @Test
    public void getNbCage() throws Exception {
    }

}