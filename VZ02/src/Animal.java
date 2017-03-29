/**
 * @author      Irfan Ariq <13515112@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
public class Animal {
    /**
     * name define the name of an animal
     */
    private String name;
    /**
     * expression define the interact of an animal
     */
    private String expression;
    /**
     * dietType define the diet of an animal
     */
    private char dietType;
    /**
     * bioType define the habitat of an animal
     */
    private char bioType;
    /**
     * code define the code of an animal in monitor
     */
    private char code;
    /**
     * weight define the weight of an animal
     */
    private double weight;
    /**
     * tamed define the condition of an animal
     */
    private boolean tamed;

    /**
     * Constructor animal
     * <p>
     * @param name = define the name
     */
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
    /**
     * Constructor animal
     * <p>
     * @param name = define the name
     * @param tamed = define tamed condition
     * @param weight = define the weight
     */
    @SuppressWarnings("unused")
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
    /**
     * Display to the monitor expression of the animal
     * <p>
     */
    public void interact() {
        System.out.println(expression);
    }
    /**
     * Get the value of food needed by an animal
     * <p>
     * Return the value of food needed
     */
    public double foodConsumption() {
        return (weight/10.0);
    }
    /**
     * Getter for a dietType of an animal
     * <p>
     * Return the char of the dietType
     */
    public char getDietType() {
        return dietType;
    }
    /**
     * Set a new value for dietType
     * @param dietType : as new value that is going to be assigned
     */
    @SuppressWarnings("unused")
    public void setDietType(char dietType) {
        this.dietType = dietType;
    }
    /**
     * Getter for a bioType of an animal
     * <p>
     * Return the char of bioType
     */
    public char getBioType() {
        return  bioType;
    }
    /**
     * Set a new value for bioType
     * @param bioType : as new value that is going to be assigned
     */
    @SuppressWarnings("unused")
    public void setBioType(char bioType) {
        this.bioType = bioType;
    }
    /**
     * Getter for a weight of an animal
     * <p>
     * Return the value of weught
     */
    public double getWeight(){
        return weight;
    }
    /**
     * Set a new value for weight
     * @param weight : as new value that is going to be assigned
     */
    @SuppressWarnings("unused")
    public void setWeight(double weight) {
        this.weight = weight;
    }
    /**
     * Getter for an attribute named tamed
     * <p>
     * Return the value of tamed
     */
    public boolean isTamed() {
        return (tamed);
    }
    /**
     * Setter for a bioType of an animal
     * @param tamed = define the tamed condtion
     */
    @SuppressWarnings("unused")
    public void setTamed(boolean tamed) {
        this.tamed = tamed;
    }
    /**
     * Display Animal into monitor
     * <p>
     * Display animal based on its species
     */
    public void render() {
        System.out.print(code);
        System.out.print(code);
    }
    /**
     * Set a new pointer to String for the name
     * @param name : as new pointer to String that is going to be assigned
     */
    @SuppressWarnings("unused")
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Getter for a name of an animal
     * <p>
     * Return the String of name
     */
    public String getName() {
        return name;
    }
    /**
     * Getter for a code of an animal
     * <p>
     * Return the char of code
     */
    public char getCode() {
        return code;
    }
}
