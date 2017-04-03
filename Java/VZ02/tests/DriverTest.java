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
        assertTrue(machine.getFoodConsum('C') + (0.5*machine.getFoodConsum('O'))==(float)21834.50);
        assertTrue(machine.getFoodConsum('H') + (0.5*machine.getFoodConsum('O'))==(float)1215.30);
        assertTrue(machine.getNbCage() == 7);
    }
}