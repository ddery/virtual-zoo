package animal;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
abstract public class Animal {

    /* name of Animal */
    private String name;
    /**
     *  dietType of Animal
     *  Global.HERB for herbivore, Global.CARN for carnivore
     *  Omnivore is Global.HERB+Global.CARN
     *  */
    private short dietType;
    /**
     *  bioType of Animal
     *  Global.WATER for WaterAnimal, Global.LAND for LandAnimal, Global.AIR for Animal
     *  if an Animal is an Amphibian, bioType is WATER+LAND
     *  WATER+LAND is equal to 0011 in bytes
     *  */
    private short bioType;
    /* weight of Animal */
    private double weight;
    /**
     * if Animal is domestic then domestic is true
     * else domestic is false
     * */
    private boolean domestic = true;
    /**
     * respiratory organ of Animal
     * LUNG, GILL. LUNG as default
     */
    private short respiratoryOrgan;

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
    public short getDietType(){
        return dietType;
    }

    /**
     * set dietType of Animal
     * @param dietType of an Animal
     */
    public void setDietType(short dietType){
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
     * @param bioType of an Animal
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
     * @param weight in kg
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
     * @param domestic is true when animal is a domestic animal, false ortherwise
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
     * set name of animal
     * @param name : name of animal
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * get respiratory organ of animal
     * @return short int respiratory organ
     */
    public short getRespiratoryOrgan() { return respiratoryOrgan; }
    public void setRespiratoryOrgan(short respiratoryOrgan){
        this.respiratoryOrgan = respiratoryOrgan;
    }
    /**
     * action when Animal eat food
     * @param food of animal when eating
     */
    abstract public void eat(String food);
}
