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
     * maximum_height define the max altitude that the Animal
     * can reach at the cell
     */
    private int maximumHeight;
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
        maximumHeight = 100;
    }
    /**
     * Getter for maximumHeight
     * <p>
     * Give the maximum height value that can be reach by an Animal
     * inside the AirHabitat
     * @return integer type maximum height
     */
    public int getMaxHeight() {
        return maximumHeight;
    }
    /**
     * Setter for maximumHeight
     * <p>
     * Give the maximum height value that can be reach by an Animal
     * inside the AirHabitat
     * @param maximumHeight: maximum height that will be assigned
     */
    public void setMaxHeight(int maximumHeight) {
        this.maximumHeight = maximumHeight;
    }
    /**
     * Display AirHabitat into monitor
     * <p>
     * Display AirHabitat based on its characteristics
     */
    public void render() {
        System.out.print(Global.ANSI_RED_BACKGROUND + ' ' + Global.ANSI_RESET);
    }
}