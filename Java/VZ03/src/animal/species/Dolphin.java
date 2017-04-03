package animal.species;

import animal.mammal.Mammal;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Dolphin extends Mammal implements WaterAnimal {

    /**
     * Constructor of Dolphin
     * @param domestic : true if this Dolphin is tamed, false otherwise
     */
    public Dolphin(boolean domestic){
        super(4,0);
        this.setBioType(Global.WATER);
        this.setDietType(Global.CARN);
        this.setWeight(635);
        this.setName("Dolphin");
        this.setDomestic(domestic);
    }
    @Override
    public void swim(double speed, double deep) {
        System.out.println(getName() + " is swimming with speed " + speed + " m/s " + " and " + deep + " m deep");
    }

    @Override
    public void interact() {System.out.println("Ckikikik");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Dl" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
