package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Panda extends Mammal implements LandAnimal {

    /**
     * Constructor of Panda
     * @param domestic : true if this Panda is tamed, false otherwise
     */
    public Panda(boolean domestic){
        super(4,0);
        this.setWeight(100);
        this.setName("Panda");
        this.setDomestic(domestic);
    }

    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void interact() {System.out.println("Ki ki");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Pd" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
