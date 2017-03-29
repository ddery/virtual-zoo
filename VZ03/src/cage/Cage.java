package cage;

import animal.Animal;
import animal.species.Cat;
import cell.Cell;
import cell.habitat.airhabitat.AirHabitat;
import cell.habitat.landhabitat.LandHabitat;
import cell.habitat.waterhabitat.WaterHabitat;
import renderable.Renderable;
import util.Global;
import zoo.Zoo;

import java.util.Random;

/**
 * @author      Faiz Haznitrama <13515010@std.stei.itb.ac.id>
 * @version     1.1
 * @since       1.0
 */
public class Cage {
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
    private int nAnimal = 0;
    /**
     * nbCage define the number of cage in all over the zoo
     */
    private static int nbCage = 0;
    /**
     * cellInside define an array containing all cell
     * inside the cage
     */
    private Cell [] cellInside;
    public Cage(){
        cageNumber = 0;
        size = 0;
    }
    /**
     * Cage constructor
     * <p>
     * Make a Cage, for cell and animal
     */
    public Cage(Zoo zoo, int i, int j, int i1, int j1){
        size = (((j1 - j) + 1) * ((i1 - i) + 1));
        cellInside = new Cell[size];
        cageNumber = nbCage;
        int idx = 0;
        for(int i2 = i;i2 < i1; i2++){
            for(int j2 = j;j2 < j1; j2++){
                zoo.getCell(i2,j2).setCageNumber(idx);
                this.setCell(zoo.getCell(i2,j2));
            }
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
    public boolean isDanger() {
        int i = 0;
        while ((i < size) && !(cellInside[i].isAnimal())){
            i++;
        }
        Animal A = cellInside[i].getAnimal();
        return (A.isDomestic());
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
    public void setCell(Cell C){
        int idx = 0;
        while(this.cellInside[idx] != null){ idx++; }
        if(idx>=size){
            //size++;
        } else {
            if ((C.getType() & Global.WATER) > 0)
                cellInside[idx] = new WaterHabitat();
            else if ((C.getType() & Global.LAND) > 0)
                cellInside[idx] = new LandHabitat();
            if ((C.getType() & Global.AIR) > 0)
                cellInside[idx] = new AirHabitat();
            this.cellInside[idx] = C;
        }
    }
    /**
     * Adding new Animal to the cage
     * <p>
     * Placing an Animal that compatible with the
     * cell inside the cage
     * @param animal = new animal that going to be added
     * @param count = the number of animal A that going to be added
     */
    public void addAnimal(Animal animal, int count) {
        int idx = 0;
        if((nAnimal + count) < 0.3*(this.size)) {
            if(animal.isDomestic() || (!animal.isDomestic() && nAnimal==0)) {
                while (cellInside[idx].isAnimal()) { idx++; }
                nAnimal = nAnimal + count;
                while (count > 0) {
                    if((cellInside[idx].getType() & animal.getBioType()) > 0)
                        cellInside[idx++].setAnimal(animal);
                    count--;
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
    public float getAnimalWeight(short C) {
        float total = 0;
        for(int i = 0;i < size;i++){
            if(cellInside[i].isAnimal() && ((cellInside[i].getAnimal().getDietType() & C) > 0))
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
    public float getFoodWeight(short C) {
        float total = 0;
        for(int i = 0;i < size;i++){
            if(cellInside[i].isAnimal() && ((cellInside[i].getAnimal().getDietType() & C) > 0))
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
    public void printAnimalList() {
        for(int i = 0;i < size;i++){
            if(cellInside[i].isAnimal()) {
                cellInside[i].getAnimal().render();
                System.out.print(cellInside[i].getAnimal().getName() + " | ");
                System.out.print("Berat : " + cellInside[i].getAnimal().getWeight() + " | ");
                System.out.print("Tipe  : ");
                if(cellInside[i].getAnimal().getDietType() == Global.HERB) { System.out.print("Herbivora"); }
                else if(cellInside[i].getAnimal().getDietType() == Global.CARN) { System.out.print("Karnivora"); }
                else if(cellInside[i].getAnimal().getDietType() == (Global.HERB + Global.CARN)) { System.out.print("Omnivora"); }
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
    public void updateOneMinutes(){

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
                if (cellInside[j].cekTypeCell(temp[i].getBioType()))  { sizeHabit++; }
            }
            randomValue = rand.nextInt(size);
            int index = startHabitIdx + randomValue % sizeHabit;
            while (cellInside[index].isAnimal() || cellInside[index].cekTypeCell(temp[i].getBioType())) {
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
}
