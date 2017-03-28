package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Gorilla extends Mammal implements LandAnimal{

    /**
     * Constructor of Gorilla
     * @param name : name of this Gorilla
     * @param domestic : true if this Gorilla is tamed, false otherwise
     */
    Gorilla(String name, boolean domestic){
        super(2,2);
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
