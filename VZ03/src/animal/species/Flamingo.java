package animal.species;

import animal.aves.Aves;
import animal.flyinganimal.FlyingAnimal;
import animal.landanimal.LandAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Flamingo extends Aves implements FlyingAnimal, LandAnimal {

    /**
     * Constructor of Flamingo
     * @param domestic : true if this Flamingo is tamed, false otherwise
     */
    public Flamingo(boolean domestic){
        super(1.0);
        this.setBioType((short) (Global.AIR+Global.LAND));
        this.setDietType(Global.CARN);
        this.setWeight(2);
        this.setName("Flamingo");
        this.setDomestic(domestic);
    }
    @Override
    public void fly(double speed, double altitude) {
        System.out.println(getName() + " is flying with speed " + speed + " m/s " + " and " + altitude + " m high");
    }

    @Override
    public void interact() {System.out.println("Flam flam");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Fl" + Global.ANSI_RESET);
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
