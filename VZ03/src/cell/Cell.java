package cell;
import animal.*;
/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public abstract class Cell {
    /**
     * type define what kind of cell it is
     */
    private char type;
    /**
     * hewan is a pointer to an Animal object that
     * represent an animal that exist in a cell
     */
    private Animal hewan;
    /**
     * Get type of cell
     * @return return the type of cell
     */
    public char getType() {
        return type;
    }
    /**
     * Get pointer to Animal that exist in the cell
     * @return return the pointer to Animal
     */
    public Animal getAnimal() {
        return hewan;
    }
    /**
     * Set a new type for the cell
     * @param new_type : as new type that is going to be assigned
     */
    protected void setType(char new_type) {
        type = new_type;
    }
    /**
     * Set a new pointer to Animal for the cell
     * @param A : as new pointer to Animal that is going to be assigned
     */
    protected void setAnimal(Animal A) {
        hewan = A;
    }
    /**
     * Validate a Land type cell
     * @return True if cell type is Land, false if not
     */
    public boolean isLH() {
        return (type == 'L');
    }
    /**
     * Validate a Water type cell
     * @return True if cell type is Water, false if not
     */
    public boolean isWH() {
        return (type == 'W');
    }
    /**
     * Validate an Air type cell
     * @return True if cell type is Air, false if not
     */
    public boolean isAH() {
        return (type == 'A');
    }
    /**
     * Validate a Restaurant type cell
     * @return True if cell type is Restaurant, false if not
     */
    public boolean isRestaurant() {
        return (type == 'R');
    }
    /**
     * Validate a Park type cell
     * @return True if cell type is Park, false if not
     */
    public boolean isPark() {
        return (type == 'P');
    }
    /**
     * Validate a Road type cell
     * @return True if cell type is Road, false if not
     */
    public boolean isRoad() {
        return (type == 'r');
    }
    /**
     * Validate an Entrance type cell
     * @return True if cell type is Entrance, false if not
     */
    public boolean isEntrance() {
        return (type == 'E');
    }
    /**
     * Validate an Exit type cell
     * @return True if cell type is Exit, false if not
     */
    public boolean isExit() {
        return (type == 'e');
    }
    /**
     * Validate whether there is an Animal in the cell
     * @return True if Animal exist, false if not
     */
    public boolean isAnimal() {
        return (hewan != null);
    }
}