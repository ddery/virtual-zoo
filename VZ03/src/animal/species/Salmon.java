package animal.species;

import animal.pisces.Pisces;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Salmon extends Pisces implements WaterAnimal{

    /**
     * Constructor of Salmon
     * @param name : name of this Salmon
     * @param domestic : true if this Salmon is tamed, false otherwise
     */
    public Salmon(String name, boolean domestic){
        super(false);
        this.setDietType(Global.HERB);
        this.setWeight(4);
        this.setName(name);
        this.setDomestic(domestic);
    }

    @Override
    public void swim(double speed, double deep) {
        System.out.println(getName() + " is swimming with speed " + speed + " m/s " + " and " + deep + " m deep");
    }

    @Override
    public void interact() {System.out.println("Kyur kyur");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Sm" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
