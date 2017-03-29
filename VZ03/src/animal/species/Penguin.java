package animal.species;

import animal.aves.Aves;
import animal.landanimal.LandAnimal;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Penguin extends Aves implements LandAnimal, WaterAnimal{

    /**
     * Constructor of Penguin
     * @param name : name of this Penguin
     * @param domestic : true if this Penguin is tamed, false otherwise
     */
    public Penguin(String name, boolean domestic){
        super(0.7);
        this.setBioType((short) (Global.LAND+Global.WATER));
        this.setDietType(Global.CARN);
        this.setWeight(30);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void interact() {System.out.println("Ii Iii");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Pe" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    @Override
    public void swim(double speed, double deep) {
        System.out.println(getName() + " is swimming with speed " + speed + " m/s " + " and " + deep + " m deep");
    }
}
