package animal.species;

import animal.landanimal.LandAnimal;
import animal.reptile.Reptile;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Chameleon extends Reptile implements LandAnimal {

    /**
     * Constructor for Chameleon
     * @param name : name of Chameleon
     * @param domestic : true if this chameleon is tamed, false otherwise
     */
    Chameleon(String name, boolean domestic){
        super(0);
        this.setWeight(1.0);
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
        System.out.print("Chameleon eat " + food);
    }

    @Override
    public void move(double speed) {

    }
}
