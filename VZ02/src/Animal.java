/**
 * @author      Irfan Ariq <13515112@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Animal {
    private String name;
    private char dietType;
    private char bioType;
    private double weight;
    private boolean tamed;

    Animal(String name){

    }

    Animal(String name, boolean tamed, double weight){

    }

    public void interact() {
    }

    public double foodConsumption() {
        return (weight/10.0);
    }

    public char getDietType() {
        return dietType;
    }

    public void setDietType(char _dietType) {
        dietType = _dietType;
    }
    public char getBioType() {
        return  bioType;
    }

    public void setBioType(char _bioType) {
        bioType = _bioType;
    }
}
