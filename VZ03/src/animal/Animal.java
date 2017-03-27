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
    private String name;
    /**
     *  dietType of Animal
     *  'H' for herbivore, 'C' for carnivore
     *  'O' for omnivore
     *  */
    private char dietType;
    /**
     *  bioType of Animal
     *  W for WaterAnimal, L for LandAnimal, A for AirAnimal
     *  if an Animal is an Amphibian, bioType is W+L
     *  W+L is equal to 0011 in bytes
     *  */
    private short bioType;
    /* weight of Animal */
    private double weight;
    /**
     * if Animal is tamed then tamed is true
     * else tamed is false
     * */
    private boolean tamed;

    /**
     * Animal interaction with human.
     * It happen when human and animal are close enough
     */
    abstract public void interact();

    /**
     *
     * @return
     */
    abstract public double foodConsumption();
    abstract public char getDietType();
    abstract public void setDietType(char dietType);
    abstract public short getBioType();
    abstract public void setBioType(short bioType);
    abstract public double getWeight();
    abstract public void setWeight(double weight);
    abstract public boolean isTamed();
    abstract public void setTamed(boolean tamed);
    abstract public void render();
    abstract public String getName();
    abstract public void setName(String name);

}
