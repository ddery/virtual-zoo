package animal.species;

import animal.pisces.Pisces;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Stingray extends Pisces implements WaterAnimal{

    /**
     * Constructor of Stingray
     * @param name : name of this Stingray
     * @param domestic : true if this Stingray is tamed, false otherwise
     */
    Stingray(String name, boolean domestic){
        super(false);
        this.setDietType(Global.CARN);
        this.setWeight(100);
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
