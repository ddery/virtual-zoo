package cell.facility.restaurant;

import org.junit.Test;
import util.Global;

import static org.junit.Assert.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class RestaurantTest {

    @Test
    public void OverallTest() {
        Restaurant restaurant = new Restaurant();
        assertTrue(restaurant.cekTypeCell(Global.RESTAURANT));
    }

}