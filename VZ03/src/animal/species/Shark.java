package animal.species;

import animal.pisces.Pisces;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Shark extends Pisces implements WaterAnimal {

    /**
     * Constructor of Shark
     * @param domestic : true if this Shark is tamed, false otherwise
     */
    public Shark(boolean domestic){
        super(true);
        this.setDietType(Global.CARN);
        this.setWeight(907.1);
        this.setName("Shark");
        this.setDomestic(domestic);
    }
    @Override
    public void swim(double speed, double deep) {
        System.out.println(getName() + " is swimming with speed " + speed + " m/s " + " and " + deep + " m deep");
    }

    @Override
    public void interact() {System.out.println("Shaaaaaark");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Sh" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
