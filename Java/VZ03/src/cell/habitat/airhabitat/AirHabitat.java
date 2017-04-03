package cell.habitat.airhabitat;
import cell.habitat.*;
import renderable.Renderable;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.1
 * @since       1.0
 */

public class AirHabitat extends Habitat implements Renderable {
    /**
     * AirHabitat constructor
     * <p>
     * Default attribute value in AirHabitat
     * maximumHeight = 100
     * Make a AirHabitat type cell, for FlyingAnimal
     */
    public AirHabitat() {
        super.setType(Global.AIR);
        super.setAnimal(null);
    }

    /**
     * Display AirHabitat into monitor
     * <p>
     * Display AirHabitat based on its characteristics
     */
    public void render() {
        if(isAnimal()){
            getAnimal().render();
        } else {
            System.out.print(Global.ANSI_RED_BACKGROUND + "  " + Global.ANSI_RESET);
        }
    }
}