package cell.habitat.waterhabitat;
import cell.habitat.*;
import renderable.Renderable;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.1
 * @since       1.0
 */

public class WaterHabitat extends Habitat implements Renderable {
    /**
     * WaterHabitat constructor
     * Default attribute for WaterHabitat :
     * oxygenRate : 10
     * Make a WaterHabitat type cell, for WaterAnimal
     */
    public WaterHabitat() {
        super.setType(Global.WATER);
        super.setAnimal(null);
    }

    /**
     * Display WaterHabitat into monitor
     * <p>
     * Display WaterHabitat based on its characteristics
     */
    public void render() {
        if(isAnimal()){
            getAnimal().render();
        } else {
            System.out.print(Global.ANSI_BLUE_BACKGROUND + "  " + Global.ANSI_RESET);
        }
    }
}