package cell;
import animal.*;
import util.Global;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.1
 * @since       1.0
 */
public abstract class Cell {
    /**
     * type define what kind of cell it is
     */
    private short type;
    /**
     * hewan is a pointer to an Animal object that
     * represent an animal that exist in a cell
     */
    private Animal hewan;
    /**
     * Get type of cell
     * @return return the type of cell
     */
    public short getType() {
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
     * @param newType : as new type that is going to be assigned
     */
    protected void setType(short newType) {
        type = newType;
    }
    /**
     * Set a new pointer to Animal for the cell
     * @param A : as new pointer to Animal that is going to be assigned
     */
    protected void setAnimal(Animal A) {
        hewan = A;
    }
    /**
     * Validate a current cell
     * @param type : type cell to compare with current cell
     * @return True if current cell type is type, false if not
     */
    public boolean cekTypeCell(short type) {
        return (type & this.type) > 0;
    }
    /**
     * Validate whether there is an Animal in the cell
     * @return True if Animal exist, false if not
     */
    public boolean isAnimal() {
        return (hewan != null);
    }
}