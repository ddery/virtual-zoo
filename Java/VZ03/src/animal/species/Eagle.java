package animal.species;

import animal.aves.Aves;
import animal.flyinganimal.FlyingAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Eagle extends Aves implements FlyingAnimal{

    /**
     * Constructor of Eagle
     * @param domestic : true if this eagle is tamed, false otherwise
     */
    public Eagle(boolean domestic){
        super(2.3);
        this.setDietType(Global.CARN);
        this.setWeight(4.1);
        this.setName("Eagle");
        this.setDomestic(domestic);
    }

    @Override
    public void fly(double speed, double altitude) {
        System.out.println(getName() + " is flying with speed " + speed + " m/s " + " and " + altitude + " m high");
    }

    @Override
    public void interact() {System.out.println("Eaaakk Eaaak");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Eg" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
