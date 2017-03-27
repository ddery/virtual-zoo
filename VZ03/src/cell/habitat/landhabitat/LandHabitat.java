package cell.habitat.landhabitat;
import cell.habitat.*;
import renderable.Renderable;
/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

public class LandHabitat extends Habitat implements Renderable {
    /**
     * soil_type define the type of the soil in the cell
     */
    private String soilType;
    /**
     * LandHabitat constructor
     * <p>
     * Make a LandHabitat type cell, for LandAnimal
     * @param soil : type of soil that will be assigned
     */
    public LandHabitat(String soil) {
        super.setType('L');
        super.setAnimal(null);
        soilType = soil;
    }
    /**
     * Getter for soilType
     * <p>
     * Give the soil type that used inside the cell
     * @return string for soilType
     */
    public String getSoilType() {
        return soilType;
    }
    /**
     * Display LandHabitat into monitor
     * <p>
     * Display LandHabitat based on its characteristics
     */
    public void render() {
        System.out.print(" ");
    }
}