package animal.species;

import animal.pisces.Pisces;
import animal.wateranimal.WaterAnimal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Shark extends Pisces implements WaterAnimal {

    /**
     * Constructor of Shark
     * @param name : name of this Shark
     * @param domestic : true if this Shark is tamed, false otherwise
     */
    Shark(String name, boolean domestic){
        super(true);
        this.setDietType(Global.CARN);
        this.setWeight(907.1);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void swim(double speed, double deep) {
        
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
