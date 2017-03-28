package animal.species;

import animal.aves.Aves;
import animal.flyinganimal.FlyingAnimal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Peacock extends Aves implements FlyingAnimal{
    
    /**
     * Constructor of Peacock
     * @param name : name of this Peacock
     * @param domestic : true if this Peacock is tamed, false otherwise
     */
    Peacock(String name, boolean domestic){
        super(1.7);
        this.setDietType(Global.HERB);
        this.setWeight(8);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void fly(double speed, double altitude) {
        
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
