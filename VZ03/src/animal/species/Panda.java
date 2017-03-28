package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Panda extends Mammal implements LandAnimal {

    /**
     * Constructor of Panda
     * @param name : name of this Panda
     * @param domestic : true if this Panda is tamed, false otherwise
     */
    Panda(String name, boolean domestic){
        super(4,0);
        this.setWeight(100);
        this.setName(name);
        this.setDomestic(domestic);
    }

    @Override
    public void move(double speed) {

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
}
