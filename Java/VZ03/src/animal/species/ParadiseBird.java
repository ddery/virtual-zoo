package animal.species;

import animal.aves.Aves;
import animal.flyinganimal.FlyingAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class ParadiseBird extends Aves implements FlyingAnimal {


    /**
     * Constructor of Ostrich
     * @param domestic : true if this eagle is tamed, false otherwise
     */
    public ParadiseBird(boolean domestic){
        super(0.3);
        this.setDietType((short) (Global.CARN+Global.HERB));
        this.setWeight(0.5);
        this.setName("ParadiseBird");
        this.setDomestic(domestic);
    }
    @Override
    public void interact() {System.out.println("Coku coku");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Pb" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    @Override
    public void fly(double speed, double altitude) {
        System.out.println(getName() + " is flying with speed " + speed + " m/s " + " and " + altitude + " m high");
    }
}
