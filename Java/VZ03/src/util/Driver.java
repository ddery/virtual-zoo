package util;

import animal.species.*;
import cage.Cage;
import zoo.Zoo;


/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Driver {

    /* zoo type */
    private final Zoo zoo;
    /* cage array */
    private final Cage[] cage;

    /**
     * Driver constructor
     */
    public Driver(){
        zoo = new Zoo(15, 40, "test.txt");
        cage = new Cage[100];
        int idx = 0;
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 40; j++){
                if(zoo.getCell(i,j).cekTypeCell(Global.HABITAT) && (zoo.getCell(i,j).getCageNumber()==-1)){
                    int i1 = i;
                    int j1 = j;
                    while(i1 < 15 && zoo.getCell(i1,j1).cekTypeCell(Global.HABITAT)){ i1++;}
                    while(j1 < 40 && zoo.getCell(i1-1,j1).cekTypeCell(Global.HABITAT)){ j1++;}
                    cage[idx] = new Cage(zoo,i,j,i1,j1);
                    idx++;
                }
            }
        }
    }

    /**
     * Display logo in terminal
     */
    public void displayMap(){
        zoo.render();
    }
    /**
     * Display logo in terminal
     */
    public void displayMap(int height, int width){
        zoo.render(height, width);
    }
    /**
     * Display logo in terminal
     */
    @SuppressWarnings("SameParameterValue")
    public void displayMap(boolean showNum){
        zoo.render(showNum);
    }
    public void logo(){
        System.out.print(" _|          _|    _|_|    _|          _|      _|_|_|_|_|    _|_|      _|_|    \n");
        System.out.print(" _|          _|  _|    _|  _|          _|            _|    _|    _|  _|    _|  \n");
        System.out.print(" _|    _|    _|  _|    _|  _|    _|    _|          _|      _|    _|  _|    _|  \n");
        System.out.print("   _|  _|  _|    _|    _|    _|  _|  _|          _|        _|    _|  _|    _|  \n");
        System.out.print("     _|  _|        _|_|        _|  _|          _|_|_|_|_|    _|_|      _|_|    \n");
    }

    /**
     * print zoo information
     */
    public void zooInfo(){
        for (int i = 0; i < getNbCage(); i++) {
            if(cage[i].getnAnimal()>0) {
                System.out.println(cage[i].getCageNumber());
                cage[i].printAnimalList();
            }
        }
    }

    /**
     * update zoo for 1 minutes
     */
    public void update(){
        for (int i = 0; i < getNbCage(); i++){
            cage[i].updateOneMinutes();
        }
    }

    /** get animal total
     * @return number of animal
     */
    public int getNAnimal(){
        int total = 0;
        for (int i = 0; i < getNbCage(); i++) {
            total+=cage[i].getnAnimal();
        }
        return total;
    }

    /**	total food weight
     * @param type : animal type
     * @return weight food consumption in specific type
     */
    public double getFoodConsum(short type){
        float total = 0;
        for (int i = 0; i < getNbCage(); i++) {
            total+=cage[i].getFoodWeight(type);
        }
        return total;
    }

    /**	get number of cage
     * @return number of cage
     */
    public int getNbCage(){
        return cage[0].getNbCage();
    }

    /**
     * Create animal in specific cage
     * @param animalName name of animal
     * @param isDomestic true if animal is domestic, false otherwise
     * @param count count of that animals
     * @param cageNumber which cage belong to that animal
     */
    public void createAnimal(String animalName, boolean isDomestic, int count, int cageNumber) {
        switch (animalName) {
            case "Cat":
                cage[cageNumber].addAnimal(new Cat(isDomestic), count);
                break;
            case "Chameleon":
                cage[cageNumber].addAnimal(new Chameleon(isDomestic), count);
                break;
            case "Chimpanzee":
                cage[cageNumber].addAnimal(new Chimpanzee(isDomestic), count);
                break;
            case "Dolphin":
                cage[cageNumber].addAnimal(new Dolphin(isDomestic), count);
                break;
            case "Eagle":
                cage[cageNumber].addAnimal(new Eagle(isDomestic), count);
                break;
            case "Elephant":
                cage[cageNumber].addAnimal(new Elephant(isDomestic), count);
                break;
            case "Flamingo":
                cage[cageNumber].addAnimal(new Flamingo(isDomestic), count);
                break;
            case "GoliathFrog":
                cage[cageNumber].addAnimal(new GoliathFrog(isDomestic), count);
                break;
            case "Gorilla":
                cage[cageNumber].addAnimal(new Gorilla(isDomestic), count);
                break;
            case "HumpbackWhale":
                cage[cageNumber].addAnimal(new HumpbackWhale(isDomestic), count);
                break;
            case "KomodoDragon":
                cage[cageNumber].addAnimal(new KomodoDragon(isDomestic), count);
                break;
            case "Lion":
                cage[cageNumber].addAnimal(new Lion(isDomestic), count);
                break;
            case "Monkey":
                cage[cageNumber].addAnimal(new Monkey(isDomestic), count);
                break;
            case "Orangutan":
                cage[cageNumber].addAnimal(new Orangutan(isDomestic), count);
                break;
            case "Ostrich":
                cage[cageNumber].addAnimal(new Ostrich(isDomestic), count);
                break;
            case "Panda":
                cage[cageNumber].addAnimal(new Panda(isDomestic), count);
                break;
            case "ParadiseBird":
                cage[cageNumber].addAnimal(new ParadiseBird(isDomestic), count);
                break;
            case "Peacock":
                cage[cageNumber].addAnimal(new Peacock(isDomestic), count);
                break;
            case "Penguin":
                cage[cageNumber].addAnimal(new Penguin(isDomestic), count);
                break;
            case "Puma":
                cage[cageNumber].addAnimal(new Puma(isDomestic), count);
                break;
            case "Salamander":
                cage[cageNumber].addAnimal(new Salamander(isDomestic), count);
                break;
            case "Salmon":
                cage[cageNumber].addAnimal(new Salmon(isDomestic), count);
                break;
            case "Shark":
                cage[cageNumber].addAnimal(new Shark(isDomestic), count);
                break;
            case "Stingray":
                cage[cageNumber].addAnimal(new Stingray(isDomestic), count);
                break;
            case "Tiger":
                cage[cageNumber].addAnimal(new Tiger(isDomestic), count);
                break;
            default:
                System.out.println("Hewan yang dimasukan salah");
                break;
        }
    }

    /**
     * print all available animal in this zoo
     */
    public void printAvailableAnimal() {
        System.out.println("Cat");
        System.out.println("Chameleon");
        System.out.println("Chimpanzee");
        System.out.println("Dolphin");
        System.out.println("Eagle");
        System.out.println("Elephant");
        System.out.println("Flamingo");
        System.out.println("GoliathFrog");
        System.out.println("Gorilla");
        System.out.println("HumpbackWhale");
        System.out.println("KomodoDragon");
        System.out.println("Lion");
        System.out.println("Monkey");
        System.out.println("Orangutan");
        System.out.println("Ostrich");
        System.out.println("Panda");
        System.out.println("ParadiseBird");
        System.out.println("Peacock");
        System.out.println("Penguin");
        System.out.println("Puma");
        System.out.println("Slamander");
        System.out.println("Salmon");
        System.out.println("Shark");
        System.out.println("Stingray");
        System.out.println("Tiger");
    }

    /**
     * clear screen
     */
    public void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * generate path zoo tour
     */
    public void tourZoo() {
        zoo.tour();
    }
}
