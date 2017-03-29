/**
 * Created by irfan on 29/03/17.
 */
public class Driver {
    public Zoo wow;
    public Cage[] kdg;

    public Driver() {
        wow = new Zoo(20,20);
        kdg = new Cage[7];
        //set Jalan
        wow.buildCell(1,0,1,1,'E');
        wow.buildCell(1,1,1,7,'r');
        wow.buildCell(1,7,19,1,'r');
        wow.buildCell(4,7,1,13,'r');
        wow.buildCell(4,19,1,1,'E');
        wow.buildCell(4,12,7,1,'r');
        wow.buildCell(19,7,1,1,'e');
        wow.buildCell(7,2,1,5,'r');
        wow.buildCell(5,2,15,1,'r');
        wow.buildCell(5,0,1,3,'r');
        wow.buildCell(9,0,1,3,'r');
        wow.buildCell(10,2,1,5,'r');
        wow.buildCell(11,7,1,13,'r');
        wow.buildCell(12,16,8,1,'r');
        wow.buildCell(19,16,1,1,'e');
        wow.buildCell(15,11,1,7,'r');
        //set restoran
        wow.buildCell(8,3,2,4,'R');
        wow.buildCell(5,8,6,2,'R');
        //set park
        wow.buildCell(6,0,3,2,'P');
        wow.buildCell(5,10,6,2,'P');
        //set Kandang 0
        kdg[0] = new Cage(56,0);
        wow.buildCell(0,0,1,8,'L',kdg[0]);
        wow.buildCell(0,8,4,12,'L',kdg[0]);
        //set Kandang 1
        kdg[1] = new Cage(29,0);
        wow.buildCell(2,0,3,3,'A',kdg[1]);
        wow.buildCell(2,3,5,4,'A',kdg[1]);
        //set Kandang 2
        kdg[2] = new Cage(20,0);
        wow.buildCell(10,0,10,2,'W',kdg[2]);
        //set Kandang 3
        kdg[3] = new Cage(36,0);
        wow.buildCell(11,3,9,4,'L',kdg[3]);
        //set Kandang 4
        kdg[4] = new Cage(59,0);
        wow.buildCell(12,8,3,5,'W',kdg[4]);
        wow.buildCell(15,8,5,3,'W',kdg[4]);
        wow.buildCell(16,11,4,3,'A',kdg[4]);
        wow.buildCell(12,13,3,3,'L',kdg[4]);
        wow.buildCell(16,14,4,2,'L',kdg[4]);
        //set Kandang 5
        kdg[5] = new Cage(42,0);
        wow.buildCell(5,13,6,7,'W',kdg[5]);
        //set Kandang 6
        kdg[6] = new Cage(24,0);
        wow.buildCell(12,17,8,3,'A',kdg[6]);
        kdg[0].addAnimal(new Animal("Panda"),5);
        kdg[0].addAnimal(new Animal("Harimau"),2);
        kdg[0].addAnimal(new Animal("Bunglon"),2);
        kdg[0].addAnimal(new Animal("Gajah"),2);
        kdg[0].addAnimal(new Animal("Orangutan"),1);
        kdg[0].addAnimal(new Animal("Gorilla"),1);
        kdg[0].addAnimal(new Animal("Komodo"),2);
        kdg[0].addAnimal(new Animal("Simpanze"),2);
        kdg[1].addAnimal(new Animal("Burung Unta"),2);
        kdg[1].addAnimal(new Animal("Cendrawasi"),1);
        kdg[1].addAnimal(new Animal("Merak"),2);
        kdg[1].addAnimal(new Animal("Elang"),2);
        kdg[1].addAnimal(new Animal("Flamingo"),1);

        kdg[2].addAnimal(new Animal("Lumba lumba"),2);
        kdg[2].addAnimal(new Animal("Pari"),2);
        kdg[2].addAnimal(new Animal("Salmon"),2);

        kdg[3].addAnimal(new Animal("Panda"),10);
        kdg[4].addAnimal(new Animal("Goliath Frog"),3);
        kdg[4].addAnimal(new Animal("Salamander"),3);
        kdg[4].addAnimal(new Animal("Pinguin"),3);
        kdg[4].addAnimal(new Animal("Cendrawasi"),2);
        kdg[4].addAnimal(new Animal("Bunglon"),2);
        kdg[4].addAnimal(new Animal("Merak"),2);
        kdg[5].addAnimal(new Animal("Paus Humpback"),6);
        kdg[5].addAnimal(new Animal("Lumba Lumba"),5);
        kdg[5].addAnimal(new Animal("Pari"),3);
        kdg[6].addAnimal(new Animal("Cendrawasi"),3);
        kdg[6].addAnimal(new Animal("Merak"),2);
        kdg[6].addAnimal(new Animal("Flamingo"),2);

    }

    public void logo() {
        System.out.print("_|          _|  _|_|  _|          _|  _|_|_|_|_|  _|_|    _|_|  \n");
        System.out.print("_|          _|_|    _|_|          _|        _|  _|    _|_|    _|\n");
        System.out.print("_|    _|    _|_|    _|_|    _|    _|      _|    _|    _|_|    _|\n");
        System.out.print("  _|  _|  _|  _|    _|  _|  _|  _|      _|      _|    _|_|    _|\n");
        System.out.print("    _|  _|      _|_|      _|  _|      _|_|_|_|_|  _|_|    _|_|  \n");
    }

    public void displayMap() {
        wow.render();
    }

    public void zooInfo() {
        for (int i = 0; i < kdg[0].getNbCage();i++) {
            if(kdg[i].getnAnimal() > 0) {
                System.out.println("Cage " + (i + 1));
                kdg[i].listAnimal();
            }
        }
        System.out.print("\n");
    }

    public void tourZoo() {
        animalMove();
        wow.tour();
    }

    public void animalMove() {
        for (int i = 0; i < kdg[0].getNbCage(); i++) {
            kdg[i].moveAnimal();
        }
    }

    public int getnAnimal() {
        int total = 0;
        for (int i = 0; i < kdg[0].getNbCage(); i++) {
            total += kdg[i].getnAnimal();
        }
        return total;
    }

    public float getFoodConsum (char type) {
        double total = 0;
        for (int i = 0; i < kdg[0].getNbCage(); i++) {
            total += kdg[i].getFoodWeight(type);
        }
        return (float) total;
    }

    public int getNbCage() {
        return kdg[0].getNbCage();
    }
}
