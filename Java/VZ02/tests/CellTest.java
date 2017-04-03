import org.junit.*;
import static org.junit.Assert.*;

/**
 * @author      Abdurrahman <13515024@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
public class CellTest {
    @Test
    public void LandHabitatTest() {
        Cell habitat= new Cell('L');
        assertTrue(habitat.getType()=='L');
        assertTrue(habitat.isLH());
        assertFalse(habitat.isAH());
        assertFalse(habitat.isWH());
        assertFalse(habitat.isRestaurant());
        assertFalse(habitat.isPark());
        assertFalse(habitat.isRoad());
        assertFalse(habitat.isEntrance());
        assertFalse(habitat.isExit());
    }
    @Test
    public void WaterHabitatTest() {
        Cell habitat= new Cell('W');
        assertTrue(habitat.getType()=='W');
        assertFalse(habitat.isLH());
        assertFalse(habitat.isAH());
        assertTrue(habitat.isWH());
        assertFalse(habitat.isRestaurant());
        assertFalse(habitat.isPark());
        assertFalse(habitat.isRoad());
        assertFalse(habitat.isEntrance());
        assertFalse(habitat.isExit());
    }
    @Test
    public void AirHabitatTest() {
        Cell habitat= new Cell('A');
        assertTrue(habitat.getType()=='A');
        assertFalse(habitat.isLH());
        assertTrue(habitat.isAH());
        assertFalse(habitat.isWH());
        assertFalse(habitat.isRestaurant());
        assertFalse(habitat.isPark());
        assertFalse(habitat.isRoad());
        assertFalse(habitat.isEntrance());
        assertFalse(habitat.isExit());
    }
    @Test
    public void RestaurantTest() {
        Cell facility= new Cell('R');
        assertTrue(facility.getType()=='R');
        assertFalse(facility.isLH());
        assertFalse(facility.isAH());
        assertFalse(facility.isWH());
        assertTrue(facility.isRestaurant());
        assertFalse(facility.isPark());
        assertFalse(facility.isRoad());
        assertFalse(facility.isEntrance());
        assertFalse(facility.isExit());
    }
    @Test
    public void ParkTest() {
        Cell facility= new Cell('P');
        assertTrue(facility.getType()=='P');
        assertFalse(facility.isLH());
        assertFalse(facility.isAH());
        assertFalse(facility.isWH());
        assertFalse(facility.isRestaurant());
        assertTrue(facility.isPark());
        assertFalse(facility.isRoad());
        assertFalse(facility.isEntrance());
        assertFalse(facility.isExit());
    }
    @Test
    public void RoadTest() {
        Cell facility= new Cell('r');
        assertTrue(facility.getType()=='r');
        assertFalse(facility.isLH());
        assertFalse(facility.isAH());
        assertFalse(facility.isWH());
        assertFalse(facility.isRestaurant());
        assertFalse(facility.isPark());
        assertTrue(facility.isRoad());
        assertFalse(facility.isEntrance());
        assertFalse(facility.isExit());
    }
    @Test
    public void EntranceTest() {
        Cell facility= new Cell('E');
        assertTrue(facility.getType()=='E');
        assertFalse(facility.isLH());
        assertFalse(facility.isAH());
        assertFalse(facility.isWH());
        assertFalse(facility.isRestaurant());
        assertFalse(facility.isPark());
        assertTrue(facility.isRoad());
        assertTrue(facility.isEntrance());
        assertFalse(facility.isExit());
    }
    @Test
    public void ExitTest() {
        Cell facility= new Cell('e');
        assertTrue(facility.getType()=='e');
        assertFalse(facility.isLH());
        assertFalse(facility.isAH());
        assertFalse(facility.isWH());
        assertFalse(facility.isRestaurant());
        assertFalse(facility.isPark());
        assertTrue(facility.isRoad());
        assertFalse(facility.isEntrance());
        assertTrue(facility.isExit());
    }
}