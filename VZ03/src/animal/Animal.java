package animal;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
abstract public class Animal {
    private String name;
    private char dietType;
    private char bioType;
    private double weight;
    private boolean tamed;

    abstract public void interact();
    abstract public double foodConsumption();
    abstract public char getDietType();
    abstract public void setDietType(char dietType);
    abstract public char getBioType();
    abstract public void setBioType(char bioType);

}
