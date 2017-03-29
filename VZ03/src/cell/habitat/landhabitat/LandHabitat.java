package cell.habitat.landhabitat;
import cell.habitat.*;
import renderable.Renderable;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.1
 * @since       1.0
 */

public class LandHabitat extends Habitat implements Renderable {
    /**
     * soil_type define the type of the soil in the cell
     */
    private String soilType;
    /**
     * LandHabitat constructor
     * Default attribute of LandHabitat :
     * soilType : Grass
     * Make a LandHabitat type cell, for LandAnimal
     */
    public LandHabitat() {
        super.setType(Global.LAND);
        super.setAnimal(null);
        soilType = "Grass";
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
     * Setter for soilType
     * <p>
     * Give the soil type that used inside the cell
     * @param soilType : type of soil that will be assigned
     */
    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }
    /**
     * Display LandHabitat into monitor
     * <p>
     * Display LandHabitat based on its characteristics
     */
    public void render() {
        if(isAnimal()){
            getAnimal().render();
        } else {
            System.out.print(Global.ANSI_YELLOW_BACKGROUND + "  " + Global.ANSI_RESET);
        }
    }
}