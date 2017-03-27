package cage;

import animal.Animal;
import cell.Cell;
import renderable.Renderable;

import java.util.Random;

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
    private static int nbCage = 0;
    /**
     * cellInside define an array containing all cell
     * inside the cage
     */
    private Cell [] cellInside;
    /**
     * Cage constructor
     * <p>
     * Make a Cage, for cell and animal
     * @param jumlahAnimal = number of animal inside the cage
     * @param jumlahCell = number of cell inside the cage
     */
    public Cage(int jumlahCell, int jumlahAnimal){
        size = jumlahCell;
        nAnimal = jumlahAnimal;
        cellInside = new Cell[size];
        cageNumber = nbCage;
        for(int i = 0;i < size;i++){
            cellInside[i] = null;
        }
        nbCage += 1;
    }
    /**
     * Getter for cage number
     * <p>
     * Return integer as the cage number
     */
    public int getCageNumber(){
        return cageNumber;
    }
    /**
     * Getter for a cell inside the cage
     * <p>
     * Return the cell in i-position at array
     * @param i = define the cell position
     */
    public Cell getCell(int i){
        return cellInside[i];
    }
    /**
     * Validate the capacity of animal inside the cage
     * <p>
     * The maximum capacity for animal inside a cage is
     * 30% from the number of cell inside the cage
     */
    public boolean isFull() {
        return ((float)nAnimal >= 0.3*size);
    }
    /**
     * Validate whether animal inside the cage is tamed or not
     * <p>
     * Validation using cell that placed by animal and
     * use Animal class method
     */
    public boolean isIsiBuas() {
        int i = 0;
        while ((i < size) && !(cellInside[i].isAnimal())){
            i++;
        }
        Animal A = cellInside[i].getAnimal();
        return (A.isTamed());
    }
    /**
     * Getter for nbcage
     * <p>
     * Return integer as the number of all cage
     */
    public int getNbCage(){
        return nbCage;
    }
    /**
     * Setter for cellInside
     * <p>
     * Set cell C into cellInside array at idx position
     */
    public void setCell(int idx, Cell C){
        idx = 0;
        while(this.cellInside[idx] != null){ idx++; }
        this.cellInside[idx] = C;
    }
    /**
     * Adding new Animal to the cage
     * <p>
     * Placing an Animal that compatible with the
     * cell inside the cage
     * @param A = new animal that going to be added
     * @param count = the number of animal A that going to be added
     */
    public void addAnimal(Animal A, int count) {
        int idx = 0;
        if((nAnimal + count) < 0.3*(this.size)) {
            if(A.isTamed() || (!A.isTamed() && nAnimal==0)) {
                while (cellInside[idx].isAnimal()) { idx++; }
                while (count > 0) {
                    count--;
                    if(A.getBioType() == 'z'){
                        while ((cellInside[idx].isAH()) && idx < size-1) { idx++; }
                    } else {
                        if (cellInside[idx].getType() != A.getBioType()) {
                            while ((cellInside[idx].getType() != A.getBioType()) && (idx < size - 1)) { idx++; }
                        }
                    }
                    if(idx < size-1) {
                        this.cellInside[idx++].setAnimal(A);
                        nAnimal++;
                    }
                }
            }
        }
    }
    /**
     * Getter for nAnimal
     * <p>
     * Return integer as the number of animal inside
     */
    public int getnAnimal() {
        return nAnimal;
    }
    /**
     * Getter for size
     * <p>
     * Return integer as the number of cell inside
     */
    public int getSize() {
        return size;
    }
    /**
     * Get weight of an animal inside
     * <p>
     * Return float as the number of weight of an animal
     * @param C  = char variable to identify diet of the animal
     */
    public float getAnimalWeight(char C) {
        float total = 0;
        for(int i = 0;i < size;i++){
            if(cellInside[i].isAnimal() && cellInside[i].getAnimal().getDietType() == C)
                total +=cellInside[i].getAnimal().getWeight();
        }
        return total;
    }
    /**
     * Get food weight of an animal inside
     * <p>
     * Return float as the number of food weight of an animal
     * @param C  = char variable to identify diet of the animal
     */
    public float getFoodWeight(char C) {
        float total = 0;
        for(int i = 0;i < size;i++){
            if(cellInside[i].isAnimal() && cellInside[i].getAnimal().getDietType() == C)
                total += cellInside[i].getAnimal().foodConsumption();
        }
        return total;
    }
    /**
     * Display list of animal inside the cage
     * <p>
     * Display not only the animal but also some information like
     * weight and type
     */
    public void listAnimal() {
        for(int i = 0;i < size;i++){
            if(cellInside[i].isAnimal()) {
                cellInside[i].getAnimal().render();
                System.out.print(cellInside[i].getAnimal().getName() + " | ");
                System.out.print("Berat : " + cellInside[i].getAnimal().getWeight() + " | ");
                System.out.print("Tipe  : ");
                if(cellInside[i].getAnimal().getDietType()=='H') { System.out.print("Herbivora"); }
                else if(cellInside[i].getAnimal().getDietType()=='C') { System.out.print("Karnivora"); }
                else if(cellInside[i].getAnimal().getDietType()=='O') { System.out.print("Omnivora"); }
                System.out.println();
            }
        }
    }
    /**
     * Move an animal to another cell inside
     * <p>
     * Destination cell will be generated randomly but only
     * cell inside the cage and available to be placed
     */
    public void moveAnimal(){
        Animal [] temp;
        temp = new Animal[nAnimal];
        int count = 0;
        /* memindahkan seluruh kepemilikan animal ke array temporary */
        for (int i = 0; i < size; i++) {
            if (cellInside[i].isAnimal()) {
                if (count < nAnimal) {
                    temp[count++] = cellInside[i].getAnimal();
                    cellInside[i].setAnimal(null);
                }
            }
        }
        /* untuk setiap animal, akan diberikan cell baru */
        Random rand = new Random();
        int randomValue = rand.nextInt(size);
        for (int i = 0;i < count;i++) {
            int sizeHabit = 0, startHabitIdx = 0;
            for(int j = 0;j < size;j++) {
                if(sizeHabit == 0) { startHabitIdx = j; }
                if ((cellInside[j].getType() == temp[i].getBioType()) ||
                   ((temp[i].getBioType() == 'z') && (cellInside[j].isWH() ||
                   cellInside[j].isLH())))  { sizeHabit++; }
            }
            int index = startHabitIdx + randomValue % sizeHabit;
            while (cellInside[index].isAnimal() ||
                  ((cellInside[index].getType() != temp[i].getBioType()) &&
                  (temp[i].getBioType() == 'z' && !(cellInside[index].isWH() ||
                  cellInside[index].isLH())))) {
                if (index>=startHabitIdx+sizeHabit-1) {
                    index= 0;
                } else {
                    index++;
                }
            }
            cellInside[index].setAnimal(temp[i]);
            temp[i] = null;
        }
    }
    /**
     * Display Cage into monitor
     * <p>
     * Display Cage based on its characteristics
     */
    public void render(){
        for(int i = 0; i < size; i++){
            cellInside[i].render();
        }
    }
}
