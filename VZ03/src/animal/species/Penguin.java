package animal.species;

import animal.aves.Aves;
import animal.landanimal.LandAnimal;
import animal.wateranimal.WaterAnimal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Penguin extends Aves implements LandAnimal, WaterAnimal{

    /**
     * Constructor of Penguin
     * @param name : name of this Penguin
     * @param domestic : true if this Penguin is tamed, false otherwise
     */
    Penguin(String name, boolean domestic){
        super(0.7);
        this.setBioType((short) (Global.LAND+Global.WATER));
        this.setDietType(Global.CARN);
        this.setWeight(30);
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

    @Override
    public void swim(double speed, double deep) {

    }
}
