package animal.species;

import animal.amphibia.Amphibia;
import animal.landanimal.LandAnimal;
import animal.wateranimal.WaterAnimal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Salamander extends Amphibia implements LandAnimal,WaterAnimal{

    /**
     * Constructor of Salamander
     * @param name : name of this Salamander
     * @param domestic : true if this Salamander is tamed, false otherwise
     */
    Salamander(String name, boolean domestic){
        super(Global.LUNG);
        this.setDietType(Global.HERB);
        this.setWeight(1);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {

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
