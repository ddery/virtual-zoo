package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Cat extends Mammal implements LandAnimal {

    /**
     * Constructor of Cat
     * @param name : name of this Cat
     * @param domestic : true if this Cat is tamed, false otherwise
     */
    public Cat(String name, boolean domestic){
        super(4,0);
        this.setDietType(Global.CARN);
        this.setWeight(3.9);
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
