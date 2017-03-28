package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Chimpanzee extends Mammal implements LandAnimal{

    /**
     * Constructor of Chimpanzee
     * @param name : name of this Chimpanzee
     * @param domestic : true if this Chimpanzee is tamed, false otherwise
     */
    Chimpanzee(String name, boolean domestic){
        super(2,2);
        this.setWeight(70);
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
