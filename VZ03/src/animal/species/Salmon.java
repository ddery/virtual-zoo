package animal.species;

import animal.pisces.Pisces;
import animal.wateranimal.WaterAnimal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Salmon extends Pisces implements WaterAnimal{

    /**
     * Constructor of Salmon
     * @param name : name of this Salmon
     * @param domestic : true if this Salmon is tamed, false otherwise
     */
    Salmon(String name, boolean domestic){
        super(false);
        this.setDietType(Global.HERB);
        this.setWeight(4);
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
