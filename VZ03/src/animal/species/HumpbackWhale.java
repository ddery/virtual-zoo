package animal.species;

import animal.mammal.Mammal;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class HumpbackWhale extends Mammal implements WaterAnimal {

    /**
     * Constructor of HumpbackWhale
     * @param name : name of this HumpbackWhale
     * @param domestic : true if this HumpbackWhale is tamed, false otherwise
     */
    HumpbackWhale(String name, boolean domestic){
        super(0,0);
        this.setBioType(Global.WATER);
        this.setDietType(Global.CARN);
        this.setWeight(36000);
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
