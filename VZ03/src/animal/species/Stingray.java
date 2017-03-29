package animal.species;

import animal.pisces.Pisces;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Stingray extends Pisces implements WaterAnimal{

    /**
     * Constructor of Stingray
     * @param name : name of this Stingray
     * @param domestic : true if this Stingray is tamed, false otherwise
     */
    public Stingray(String name, boolean domestic){
        super(false);
        this.setDietType(Global.CARN);
        this.setWeight(100);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void swim(double speed, double deep) {
        System.out.println(getName() + " is swimming with speed " + speed + " m/s " + " and " + deep + " m deep");
    }

    @Override
    public void interact() {System.out.println("Sting");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "St" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
