package cage;

import cell.Cell;
import renderable.Renderable;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Cage implements Renderable {
    /**
     * cageNumber define the cage number
     */
    private int cageNumber;
    /**
     * size define the number of cell inside the cage
     */
    private int size;
    /**
     * nAnimal define the number of animal inside the cage
     */
    private int nAnimal;
    /**
     * nbCage define the number of cage in all over the zoo
     */
    private static int nbCage;
    /**
     * cellInside define an array containing all cell
     * inside the cage
     */
    private Cell [] cellInside;
    /**
     * Display Cage into monitor
     * <p>
     * Display Cage based on its characteristics
     */
    public void render(){}
}
