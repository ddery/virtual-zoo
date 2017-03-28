/**
 * @author      Irfan Ariq <13515112@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Animal {
    private String name;
    private String expression;
    private char dietType;
    private char bioType;
    private char code;
    private double weight;
    private boolean tamed;

    Animal(String name){
        this.name = name;
        tamed = true;
        switch (name) {
            case "Bunglon":
                bioType = 'L';
                dietType = 'C';
                weight = 1;
                expression = "Bunglon : ssshhhh";
                code = 'B';
                break;
            case "Burung Unta":
                bioType = 'A';
                dietType = 'H';
                weight = 145;
                expression = "Burung Unta : walkwakkk";
                code = 'U';
                break;
            case "Cendrawasi":
                bioType = 'A';
                dietType = 'H';
                weight = 0.5;
                expression = "Cendrawasi : weoooo ";
                code = 'C';
                break;
            case "Elang":
                bioType = 'A';
                dietType = 'C';
                weight = 1;
                expression = "Elang : hwaaak";
                code = 'E';
                break;
            case "Flamingo":
                bioType = 'A';
                dietType = 'C';
                weight = 2;
                expression = "Flamingo : kwakk kwakk";
                code = 'F';
                break;
            case "Gajah":
                bioType = 'L';
                dietType = 'H';
                weight = 5000;
                expression = "Gajah : Uuuuu";
                code = 'G';
                break;
            case "Goliath Frog":
                bioType = 'L';
                dietType = 'C';
                weight = 3;
                expression = "Goliath Frog : krok krok";
                code = 'f';
                break;
            case "Gorilla":
                bioType = 'L';
                dietType = 'H';
                weight = 200;
                expression = "Gorilla : Grauuuum";
                code = 'g';
                break;
            case "Harimau":
                bioType = 'L';
                dietType = 'C';
                weight = 210;
                expression = "Harimau : Uuuuuuuum";
                code = 'H';
                break;
            case "Komodo":
                bioType = 'L';
                dietType = 'C';
                weight = 70;
                expression = "Komodo : Tssst";
                code = 'K';
                break;
            case "Lumba lumba":
                bioType = 'W';
                dietType = 'C';
                weight = 635;
                expression = "Lumba lumba : *muncul dari permukaan* cyaas";
                code = 'L';
                break;
            case "Merak":
                bioType = 'A';
                dietType = 'H';
                weight = 8;
                expression = "Merak : kwakk kwakk";
                code = 'M';
                break;
            case "Orangutan":
                bioType = 'L';
                dietType = 'H';
                weight = 80;
                expression = "Orangutan : auoooo";
                code = 'O';
                break;
            case "Panda":
                bioType = 'L';
                dietType = 'H';
                weight = 100;
                expression = "Panda : Uuuaaa";
                code = 'P';
                break;
            case "Pari":
                bioType = 'W';
                dietType = 'C';
                weight = 100;
                expression = "Pari : Krrrrr";
                code = 'p';
                break;
            case "Paus Humpback":
                bioType = 'W';
                dietType = 'C';
                weight = 36000;
                expression = "Paus Humpback : Huuuuum";
                code = 'h';
                break;
            case "Pinguin":
                bioType = 'A';
                dietType = 'H';
                weight = 30;
                expression = "Pinguin : wakkkk";
                code = 'N';
                break;
            case "Puma":
                bioType = 'L';
                dietType = 'C';
                weight = 180;
                expression = "Puma : Ghroaar";
                code = 'm';
                break;
            case "Salamander":
                bioType = 'z';
                dietType = 'H';
                weight = 1;
                expression = "Salamander : Zzzz";
                code = 'S';
                break;
            case "Salmon":
                bioType = 'W';
                dietType = 'C';
                weight = 4;
                expression = "Salmon : Splash";
                code = 's';
                break;
            case "Simpanze":
                bioType = 'L';
                dietType = 'H';
                weight = 70;
                expression = "Simpanze : Uuuaaaa";
                code = 'z';
                break;
            case "Singa":
                bioType = 'L';
                dietType = 'C';
                weight = 200;
                expression = "Singa : Auuuum";
                code = 'X';
                break;
        }
    }

    Animal(String name, boolean tamed, double weight){
        this.name = name;
        this.tamed = tamed;
        this.weight = weight;
        switch (name) {
            case "Bunglon":
                bioType = 'L';
                dietType = 'C';
                //weight = 1;
                expression = "Bunglon : ssshhhh";
                code = 'B';
                break;
            case "Burung Unta":
                bioType = 'A';
                dietType = 'H';
                //weight = 145;
                expression = "Burung Unta : walkwakkk";
                code = 'U';
                break;
            case "Cendrawasi":
                bioType = 'A';
                dietType = 'H';
                //weight = 0.5;
                expression = "Cendrawasi : weoooo ";
                code = 'C';
                break;
            case "Elang":
                bioType = 'A';
                dietType = 'C';
                //weight = 1;
                expression = "Elang : hwaaak";
                code = 'E';
                break;
            case "Flamingo":
                bioType = 'A';
                dietType = 'C';
                //weight = 2;
                expression = "Flamingo : kwakk kwakk";
                code = 'F';
                break;
            case "Gajah":
                bioType = 'L';
                dietType = 'H';
                //weight = 5000;
                expression = "Gajah : Uuuuu";
                code = 'G';
                break;
            case "Goliath Frog":
                bioType = 'L';
                dietType = 'C';
                //weight = 3;
                expression = "Goliath Frog : krok krok";
                code = 'f';
                break;
            case "Gorilla":
                bioType = 'L';
                dietType = 'H';
                //weight = 200;
                expression = "Gorilla : Grauuuum";
                code = 'g';
                break;
            case "Harimau":
                bioType = 'L';
                dietType = 'C';
                //weight = 210;
                expression = "Harimau : Uuuuuuuum";
                code = 'H';
                break;
            case "Komodo":
                bioType = 'L';
                dietType = 'C';
                //weight = 70;
                expression = "Komodo : Tssst";
                code = 'K';
                break;
            case "Lumba lumba":
                bioType = 'W';
                dietType = 'C';
                //weight = 635;
                expression = "Lumba lumba : *muncul dari permukaan* cyaas";
                code = 'L';
                break;
            case "Merak":
                bioType = 'A';
                dietType = 'H';
                //weight = 8;
                expression = "Merak : kwakk kwakk";
                code = 'M';
                break;
            case "Orangutan":
                bioType = 'L';
                dietType = 'H';
                //weight = 80;
                expression = "Orangutan : auoooo";
                code = 'O';
                break;
            case "Panda":
                bioType = 'L';
                dietType = 'H';
                //weight = 100;
                expression = "Panda : Uuuaaa";
                code = 'P';
                break;
            case "Pari":
                bioType = 'W';
                dietType = 'C';
                //weight = 100;
                expression = "Pari : Krrrrr";
                code = 'p';
                break;
            case "Paus Humpback":
                bioType = 'W';
                dietType = 'C';
                //weight = 36000;
                expression = "Paus Humpback : Huuuuum";
                code = 'h';
                break;
            case "Pinguin":
                bioType = 'A';
                dietType = 'H';
                //weight = 30;
                expression = "Pinguin : wakkkk";
                code = 'N';
                break;
            case "Puma":
                bioType = 'L';
                dietType = 'C';
                //weight = 180;
                expression = "Puma : Ghroaar";
                code = 'm';
                break;
            case "Salamander":
                bioType = 'z';
                dietType = 'H';
                //weight = 1;
                expression = "Salamander : Zzzz";
                code = 'S';
                break;
            case "Salmon":
                bioType = 'W';
                dietType = 'C';
                //weight = 4;
                expression = "Salmon : Splash";
                code = 's';
                break;
            case "Simpanze":
                bioType = 'L';
                dietType = 'H';
                //weight = 70;
                expression = "Simpanze : Uuuaaaa";
                code = 'z';
                break;
            case "Singa":
                bioType = 'L';
                dietType = 'C';
                //weight = 200;
                expression = "Singa : Auuuum";
                code = 'X';
                break;
        }
    }

    public void interact() {
        System.out.println(expression);
    }

    public double foodConsumption() {
        return (weight/10.0);
    }

    public char getDietType() {
        return dietType;
    }

    public void setDietType(char dietType) {
        this.dietType = dietType;
    }
    public char getBioType() {
        return  bioType;
    }

    public void setBioType(char bioType) {
        this.bioType = bioType;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isTamed() {
        return (tamed);
    }

    public void setTamed(boolean tamed) {
        this.tamed = tamed;
    }

    public void render() {
        System.out.print(code);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
