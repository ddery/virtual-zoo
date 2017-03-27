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
    private int oxygen_rate;
    /**
     * WaterHabitat constructor
     * <p>
     * Make a WaterHabitat type cell, for WaterAnimal
     * @param oxy_rate : the number of oxygen rate that will be assigned
     */
    public WaterHabitat(int oxy_rate) {
        super.SetType('W');
        super.SetAnimal(null);
        oxygen_rate = oxy_rate;
    }
    /**
     * Getter for oxygen_rate
     * <p>
     * Give the number of oxygen rate in the water at the cell
     * @return integer type oxygen rate
     */
    public int GetOxyRate() {
        return oxygen_rate;
    }
    /**
     * Display WaterHabitat into monitor
     * <p>
     * Display WaterHabitat based on its characteristics
     */
    public void Render() {
        System.out.print(" ");
    }
}