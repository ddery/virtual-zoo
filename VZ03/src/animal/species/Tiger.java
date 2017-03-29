package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Tiger extends Mammal implements LandAnimal {

    /**
     * Constructor of Tiger
     * @param name : name of this Tiger
     * @param domestic : true if this Tiger is tamed, false otherwise
     */
    public Tiger(String name, boolean domestic){
        super(4,0);
        this.setDietType(Global.CARN);
        this.setWeight(210);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void interact() {System.out.println("Roar");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Ti" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
