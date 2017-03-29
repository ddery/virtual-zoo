package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Lion extends Mammal implements LandAnimal {

    /**
     * Constructor of Lion
     * @param domestic : true if this Lion is tamed, false otherwise
     */
    public Lion(boolean domestic){
        super(4,0);
        this.setDietType(Global.HERB);
        this.setWeight(200);
        this.setName("Lion");
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void interact() {System.out.println("Auumm");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Li" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
