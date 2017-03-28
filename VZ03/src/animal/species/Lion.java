package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Lion extends Mammal implements LandAnimal {

    /**
     * Constructor of Lion
     * @param name : name of this Lion
     * @param domestic : true if this Lion is tamed, false otherwise
     */
    Lion(String name, boolean domestic){
        super(4,0);
        this.setDietType(Global.HERB);
        this.setWeight(200);
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
