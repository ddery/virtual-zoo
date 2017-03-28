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
     * @param name : name of this ostrich
     * @param domestic : true if this eagle is tamed, false otherwise
     */
    ParadiseBird(String name, boolean domestic){
        super(0.3);
        this.setDietType((short) (Global.CARN+Global.HERB));
        this.setWeight(0.5);
        this.setName(name);
        this.setDomestic(domestic);
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
    public void fly(double speed, double altitude) {

    }
}
