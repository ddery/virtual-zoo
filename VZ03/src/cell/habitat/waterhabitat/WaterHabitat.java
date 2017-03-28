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
     * oxygen_rate define the oxygen rate contained
     * in the water at the cell
     */
    private int oxygenRate;
    /**
     * WaterHabitat constructor
     * Default attribute for WaterHabitat :
     * oxygenRate : 10
     * Make a WaterHabitat type cell, for WaterAnimal
     */
    public WaterHabitat() {
        super.setType(Global.WATER);
        super.setAnimal(null);
        oxygenRate = 10;
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
     * Setter for oxygenRate
     * <p>
     * Give the number of oxygen rate in the water at the cell
     * @param oxygenRate : an oxygen rate in water habitat
     */
    public void setOxyRate(int oxygenRate) {
        this.oxygenRate = oxygenRate;
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