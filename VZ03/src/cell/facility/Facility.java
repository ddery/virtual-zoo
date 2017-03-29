package cell.facility;
import cell.*;
/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public abstract class Facility extends Cell {
    /**
     * method render to display objects
     * <p>
     * Display object for the user to be determined what kind of
     * object it is.
     */
    public abstract void render();
}