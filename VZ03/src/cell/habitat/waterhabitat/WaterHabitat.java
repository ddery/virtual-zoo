package cell.habitat.waterhabitat;
import cell.habitat.*;
import renderable.Renderable;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class WaterHabitat extends Habitat implements Renderable {
    /**
     * oxygen_rate define the oxygen rate contained
     * in the water at the cell
     */
    private int oxygenRate;
    /**
     * WaterHabitat constructor
     * <p>
     * Make a WaterHabitat type cell, for WaterAnimal
     * @param oxyRate : the number of oxygen rate that will be assigned
     */
    public WaterHabitat(int oxyRate) {
        super.setType('W');
        super.setAnimal(null);
        oxygenRate = oxyRate;
    }
    /**
     * Getter for oxygenRate
     * <p>
     * Give the number of oxygen rate in the water at the cell
     * @return integer type oxygen rate
     */
    public int getOxyRate() {
        return oxygenRate;
    }
    /**
     * Display WaterHabitat into monitor
     * <p>
     * Display WaterHabitat based on its characteristics
     */
    public void render() {
        System.out.print(" ");
    }
}