package cage;

import animal.Animal;
import cell.Cell;
import cell.habitat.airhabitat.AirHabitat;
import cell.habitat.landhabitat.LandHabitat;
import cell.habitat.waterhabitat.WaterHabitat;
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
    private final int cageNumber;
    /**
     * size define the number of cell inside the cage
     */
    private final int size;
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
    private final Cell [] cellInside;
    /**
     * Cage constructor
     * <p>
     * Make a Cage, for cell and animal
     */
    public Cage(Zoo zoo, int i, int j, int i1, int j1){
        size = ((j1 - j) * (i1 - i));
        cellInside = new Cell[size];
        cageNumber = nbCage;
        int idx = nbCage;
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
     * Return integer as the number of cage
     */
    public int getCageNumber(){
        return cageNumber;
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
    private void setCell(Cell C){
        int idx = 0;
        while(this.cellInside[idx] != null){ idx++; }
        if(idx<size){
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
                    if((cellInside[idx].getType() & animal.getBioType()) > 0) {
                        cellInside[idx].setAnimal(animal);
                        idx++;
                    }
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
     * Get food weight of an animal inside
     * <p>
     * Return float as the number of food weight of an animal
     * @param C  = char variable to identify diet of the animal
     */
    public float getFoodWeight(short C) {
        float total = 0;
        for(int i = 0;i < size;i++){
            if(cellInside[i].isAnimal() && (cellInside[i].getAnimal().getDietType()==C))
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
        for(int i = 0; i < count; i++){
            System.out.println(temp[i].getClass());
        }

        /* untuk setiap animal, akan diberikan cell baru */

        for(int i = 0; i < count; i++) {
            Random rand = new Random();
            int randomValue = rand.nextInt(size);
            while (cellInside[randomValue].isAnimal() || !cellInside[randomValue].cekTypeCell(temp[i].getBioType())) {
                randomValue = (randomValue + 2 < size) ? randomValue + 2 : 0;
            }
            cellInside[randomValue].setAnimal(temp[i]);
        }
    }
}
