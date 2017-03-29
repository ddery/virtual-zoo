package util;

import animal.species.*;
import cage.Cage;
import renderable.Renderable;
import zoo.Zoo;

/**
 * Created by dery on 3/28/17.
 */
public class Driver {

    private Zoo zoo;
    private Cage[] cage;

    public Driver(int height, int width, String filename){
        zoo = new Zoo(height,width,filename);
        cage = new Cage[100];
        int idx = 0;
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(zoo.getCell(i,j).cekTypeCell(Global.HABITAT) && (zoo.getCell(i,j).getCageNumber()==-1)){
                    int i1 = i;
                    int j1 = j;
                    while(i1 < height && zoo.getCell(i1,j1).cekTypeCell(Global.HABITAT)){ i1++;}
                    while(j1 < width && zoo.getCell(i1-1,j1).cekTypeCell(Global.HABITAT)){ j1++;}
                    cage[idx] = new Cage(zoo,i,j,i1,j1);
                    idx++;
                }
            }
        }
    }

    /*	@brief displayMap
        *	menampilkan bentuk zoo ke layar
        */
    public void displayMap(){
        zoo.render();
    }
    public void logo(){
        System.out.print(" _|          _|    _|_|    _|          _|      _|_|_|_|_|    _|_|      _|_|    \n");
        System.out.print(" _|          _|  _|    _|  _|          _|            _|    _|    _|  _|    _|  \n");
        System.out.print(" _|    _|    _|  _|    _|  _|    _|    _|          _|      _|    _|  _|    _|  \n");
        System.out.print("   _|  _|  _|    _|    _|    _|  _|  _|          _|        _|    _|  _|    _|  \n");
        System.out.print("     _|  _|        _|_|        _|  _|          _|_|_|_|_|    _|_|      _|_|    \n");
    }
    /*	@brief Zooinfo
        *	menampilkan ke layar info makanan yang dibutuhkan dalam sehari dan
        * list animal yang ada
        */
    public void zooInfo(){
        for (int i = 0; i < getNbCage(); i++) {
            if(cage[i].getnAnimal()>0) {
                System.out.println("CAGE " + i+1);
                cage[i].printAnimalList();
            }
        }
    }
    /*	@brief animalmove
        * membuat animal pindah secara acak
        */
    public void update(){
        for (int i = 0; i < getNbCage(); i++){
            cage[i].updateOneMinutes();
        }
    }

    /**	@brief getNAnimal
     * total Animal dalam Zoo
     */
    public int getNAnimal(){
        int total = 0;
        for (int i = 0; i < getNbCage(); i++) {
            total+=cage[i].getnAnimal();
        }
        return total;
    }

    /**	@brief getFoodConsum
     * total berat makanan Animal dalam Zoo dari tipe hewannya
     * Carnivora/Herbivora/Omnifora
     * @param type : tipe hewan
     */
    public double getFoodConsum(short type){
        float total = 0;
        for (int i = 0; i < getNbCage(); i++) {
            total+=cage[i].getFoodWeight(type);
        }
        return total;
    }

    /**	@brief getNbCage
     * mengembalikan nilai banyaknya Cage yang dibuat dalam kebun binatang
     */
    public int getNbCage(){
        return cage[0].getNbCage();
    }

    public void createAnimal(String animalName, boolean isDomestic, int count, int cageNumber) {
        if(animalName.equals("Cat")){
            cage[cageNumber].addAnimal(new Cat("Cat",isDomestic),count);
        } else if(animalName.equals("Chameleon")){
            cage[cageNumber].addAnimal(new Chameleon("Chameleon",isDomestic),count);
        } else if(animalName.equals("Chimpanzee")){
            cage[cageNumber].addAnimal(new Chimpanzee("Chimpanzee",isDomestic),count);
        } else if(animalName.equals("Dolphin")) {
            cage[cageNumber].addAnimal(new Dolphin("Dolphin", isDomestic), count);
        } else if(animalName.equals("Eagle")) {
            cage[cageNumber].addAnimal(new Eagle("Eagle", isDomestic), count);
        } else if(animalName.equals("Elephant")) {
            cage[cageNumber].addAnimal(new Elephant("Elephant", isDomestic), count);
        } else if(animalName.equals("Flamingo")) {
            cage[cageNumber].addAnimal(new Flamingo("Flamingo", isDomestic), count);
        } else if(animalName.equals("GoliathFrog")) {
            cage[cageNumber].addAnimal(new GoliathFrog("GoliathFrog", isDomestic), count);
        } else if(animalName.equals("Gorilla")) {
            cage[cageNumber].addAnimal(new Gorilla("Gorilla", isDomestic), count);
        } else if(animalName.equals("HumpbackWhale")) {
            cage[cageNumber].addAnimal(new HumpbackWhale("HumpbackWhale", isDomestic), count);
        } else if(animalName.equals("KomodoDragon")) {
            cage[cageNumber].addAnimal(new KomodoDragon("KomodoDragon", isDomestic), count);
        } else if(animalName.equals("Lion")) {
            cage[cageNumber].addAnimal(new Lion("Lion", isDomestic), count);
        } else if(animalName.equals("Monkey")) {
            cage[cageNumber].addAnimal(new Monkey("Monkey", isDomestic), count);
        } else if(animalName.equals("Orangutan")) {
            cage[cageNumber].addAnimal(new Orangutan("Orangutan", isDomestic), count);
        } else if(animalName.equals("Ostrich")) {
            cage[cageNumber].addAnimal(new Ostrich("Ostrich", isDomestic), count);
        } else if(animalName.equals("Panda")) {
            cage[cageNumber].addAnimal(new Panda("Panda", isDomestic), count);
        } else if(animalName.equals("ParadiseBird")) {
            cage[cageNumber].addAnimal(new ParadiseBird("ParadiseBird", isDomestic), count);
        } else if(animalName.equals("Peacock")) {
            cage[cageNumber].addAnimal(new Peacock("Peacock", isDomestic), count);
        } else if(animalName.equals("Penguin")) {
            cage[cageNumber].addAnimal(new Penguin("Penguin", isDomestic), count);
        } else if(animalName.equals("Puma")) {
            cage[cageNumber].addAnimal(new Puma("Puma", isDomestic), count);
        } else if(animalName.equals("Salamander")) {
            cage[cageNumber].addAnimal(new Salamander("Salamander", isDomestic), count);
        } else if(animalName.equals("Salmon")) {
            cage[cageNumber].addAnimal(new Salmon("Salmon", isDomestic), count);
        } else if(animalName.equals("Shark")) {
            cage[cageNumber].addAnimal(new Shark("Shark", isDomestic), count);
        } else if(animalName.equals("Stingray")) {
            cage[cageNumber].addAnimal(new Stingray("Stingray", isDomestic), count);
        } else if(animalName.equals("Tiger")) {
            cage[cageNumber].addAnimal(new Tiger("Tiger", isDomestic), count);
        } else {
            System.out.println("Hewan yang dimasukan salah");
        }
    }

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

    public void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /*	@brief Tourzoo
        *	melakukan tour dengan cara memanggil prosedur Tour ada kelas zoo
        */
    public void tourZoo() {
        zoo.tour();
    }
}
