package cell.habitat.airhabitat;
import cell.habitat.*;
import renderable.Renderable;
/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
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
     * Make a AirHabitat type cell, for FlyingAnimal
     * @param maxHeight : maximum height that will be assigned
     */
    public AirHabitat(int maxHeight) {
        super.setType('A');
        super.setAnimal(null);
        maximumHeight = maxHeight;
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
     * Display AirHabitat into monitor
     * <p>
     * Display AirHabitat based on its characteristics
     */
    public void render() {
        System.out.print(" ");
    }
}