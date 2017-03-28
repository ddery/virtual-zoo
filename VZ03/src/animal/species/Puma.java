package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Puma extends Mammal implements LandAnimal {

    /**
     * Constructor of Puma
     * @param name : name of this Puma
     * @param domestic : true if this Puma is tamed, false otherwise
     */
    Puma(String name, boolean domestic){
        super(4,0);
        this.setDietType(Global.CARN);
        this.setWeight(180);
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
