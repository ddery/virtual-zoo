package animal;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
abstract public class Animal {

    /* variable declaration for bioType */
    protected final static short W = 1;
    protected final static short L = 2;
    protected final static short A = 4;

    /* name of Animal */
    private String name = new String(" ");
    /**
     *  dietType of Animal
     *  'H' for herbivore, 'C' for carnivore
     *  'O' for omnivore
     *  */
    private char dietType = 'O';
    /**
     *  bioType of Animal
     *  W for WaterAnimal, L for LandAnimal, A for AirAnimal
     *  if an Animal is an Amphibian, bioType is W+L
     *  W+L is equal to 0011 in bytes
     *  */
    private short bioType = 'L';
    /* weight of Animal */
    private double weight = 0;
    /**
     * if Animal is domestic then domestic is true
     * else domestic is false
     * */
    private boolean domestic = true;

    /**
     * Animal interaction with human.
     * It happen when human and animal are close enough
     */
    abstract public void interact();

    /**
     * Get animal's weight of food consumption per day in kilograms
     * weight/10
     * @return animal's weight of food consumption per day in kilograms
     */
    public double foodConsumption() {
        return weight/10;
    }

    /**
     * get dietType of Animal
     * @return dietType of Animal
     */
    public char getDietType(){
        return dietType;
    }

    /**
     * set dietType of Animal
     * @param dietType
     */
    public void setDietType(char dietType){
        this.dietType = dietType;
    }

    /**
     * get bioType of Animal
     * @return bioType of Animal
     */
    public short getBioType(){
        return bioType;
    }

    /**
     * set bioType of Animal
     * @param bioType
     */
    public void setBioType(short bioType){
        this.bioType = bioType;
    }

    /**
     * get weight of Animal
     * @return weight of Animal
     */
    public double getWeight(){
        return weight;
    }

    /**
     * set weight of Animal
     * @param weight
     */
    public void setWeight(double weight){
        this.weight = weight;
    }

    /**
     * @return true if Animal is domestic, false otherwise
     */
    public boolean isDomestic(){
        return domestic;
    }

    /**
     * set domestication status of Animal
     * @param domestic
     */
    public void setDomestic(boolean domestic){
        this.domestic = domestic;
    }

    /**
     * method render to display objects
     * <p>
     * Display object for the user to be determined what kind of
     * object it is.
     */
    abstract public void render();

    /**
     * get name of Animal
     * @return string name of Animal
     */
    public String getName(){
        return name;
    }

    /**
     * set name of Animal
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * action when Animal eat food
     * @param food
     */
    abstract public void eat(String food);
}
