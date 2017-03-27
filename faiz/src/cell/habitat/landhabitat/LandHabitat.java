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
    private String soil_type;
    /**
     * LandHabitat constructor
     * <p>
     * Make a LandHabitat type cell, for LandAnimal
     * @param soil : type of soil that will be assigned
     */
    public LandHabitat(String soil) {
        super.SetType('L');
        super.SetAnimal(null);
        soil_type = soil;
    }
    /**
     * Getter for soil_type
     * <p>
     * Give the soil type that used inside the cell
     * @return string for soil_type
     */
    public String GetSoilType() {
        return soil_type;
    }
    /**
     * Display LandHabitat into monitor
     * <p>
     * Display LandHabitat based on its characteristics
     */
    public void Render() {
        System.out.print(" ");
    }
}