package animal.species;

import animal.aves.Aves;
import animal.flyinganimal.FlyingAnimal;
import animal.landanimal.LandAnimal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Flamingo extends Aves implements FlyingAnimal, LandAnimal {

    /**
     * Constructor of Flamingo
     * @param name : name of this Flamingo
     * @param domestic : true if this Flamingo is tamed, false otherwise
     */
    Flamingo(String name, boolean domestic){
        super(1.0);
        this.setBioType((short) (Global.AIR+Global.LAND));
        this.setDietType(Global.CARN);
        this.setWeight(2);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void fly(double speed, double altitude) {

    }

    @Override
    public void interact() {

    }

    @Override
    public void render() {

    }

    @Override
    public void eat(String food) {

    }

    @Override
    public void move(double speed) {

    }
}
