package animal.species;

import animal.landanimal.LandAnimal;
import animal.reptile.Reptile;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class KomodoDragon extends Reptile implements LandAnimal{

    /**
     * Constructor of KomodoDragon
     * @param name : name of this KomodoDragon
     * @param domestic : true if this KomodoDragon is tamed, false otherwise
     */
    KomodoDragon(String name, boolean domestic){
        super(4);
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
