package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Orangutan extends Mammal implements LandAnimal{

    /**
     * Constructor of Orangutan
     * @param name : name of this Orangutan
     * @param domestic : true if this Orangutan is tamed, false otherwise
     */
    Orangutan(String name, boolean domestic){
        super(2,2);
        this.setWeight(80);
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
