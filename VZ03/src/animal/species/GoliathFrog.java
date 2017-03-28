package animal.species;

import animal.amphibia.Amphibia;
import animal.landanimal.LandAnimal;
import animal.wateranimal.WaterAnimal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class GoliathFrog extends Amphibia implements LandAnimal,WaterAnimal {

    /**
     * Constructor of GoliathFrog
     * @param name : name of this GoliathFrog
     * @param domestic : true if this GoliathFrog is tamed, false otherwise
     */
    GoliathFrog(String name, boolean domestic){
        super(Global.LUNG);
        this.setDietType(Global.CARN);
        this.setWeight(5000);
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
