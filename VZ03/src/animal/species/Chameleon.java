package animal.species;

import animal.landanimal.LandAnimal;
import animal.reptile.Reptile;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Chameleon extends Reptile implements LandAnimal {

    /**
     * Constructor for Chameleon
     * @param name : name of Chameleon
     * @param domestic : true if this chameleon is tamed, false otherwise
     */
    public Chameleon(String name, boolean domestic){
        super(0);
        this.setWeight(1.0);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void interact() {System.out.println("Cham Cham");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Cm" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }
}
