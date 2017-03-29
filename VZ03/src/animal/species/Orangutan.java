package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Orangutan extends Mammal implements LandAnimal{

    /**
     * Constructor of Orangutan
     * @param name : name of this Orangutan
     * @param domestic : true if this Orangutan is tamed, false otherwise
     */
    public Orangutan(String name, boolean domestic){
        super(2,2);
        this.setWeight(80);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void interact() {System.out.println("HOAAAM");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Ou" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
