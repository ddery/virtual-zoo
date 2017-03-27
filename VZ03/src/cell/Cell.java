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
    public char GetType() {
        return type;
    }
    /**
     * Get pointer to Animal that exist in the cell
     * @return return the pointer to Animal
     */
    public Animal GetAnimal() {
        return hewan;
    }
    /**
     * Set a new type for the cell
     * @param new_type : as new type that is going to be assigned
     */
    public void SetType(char new_type) {
        type = new_type;
    }
    /**
     * Set a new pointer to Animal for the cell
     * @param A : as new pointer to Animal that is going to be assigned
     */
    public void SetAnimal(Animal A) {
        hewan = A;
    }
    /**
     * Validate a Land type cell
     * @return True if cell type is Land, false if not
     */
    public boolean IsLH() {
        return (type == 'L');
    }
    /**
     * Validate a Water type cell
     * @return True if cell type is Water, false if not
     */
    public boolean IsWH() {
        return (type == 'W');
    }
    /**
     * Validate an Air type cell
     * @return True if cell type is Air, false if not
     */
    public boolean IsAH() {
        return (type == 'A');
    }
    /**
     * Validate a Restaurant type cell
     * @return True if cell type is Restaurant, false if not
     */
    public boolean IsRestaurant() {
        return (type == 'R');
    }
    /**
     * Validate a Park type cell
     * @return True if cell type is Park, false if not
     */
    public boolean IsPark() {
        return (type == 'P');
    }
    /**
     * Validate a Road type cell
     * @return True if cell type is Road, false if not
     */
    public boolean IsRoad() {
        return (type == 'r');
    }
    /**
     * Validate an Entrance type cell
     * @return True if cell type is Entrance, false if not
     */
    public boolean IsEntrance() {
        return (type == 'E');
    }
    /**
     * Validate an Exit type cell
     * @return True if cell type is Exit, false if not
     */
    public boolean IsExit() {
        return (type == 'e');
    }
    /**
     * Validate whether there is an Animal in the cell
     * @return True if Animal exist, false if not
     */
    public boolean IsAnimal() {
        return (hewan != null);
    }
}