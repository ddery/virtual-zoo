package animal.species;

import animal.aves.Aves;
import animal.flyinganimal.FlyingAnimal;
import animal.landanimal.LandAnimal;
import com.sun.org.apache.bcel.internal.generic.LAND;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Ostrich extends Aves implements LandAnimal{

    /**
     * Constructor of Ostrich
     * @param name : name of this Ostrich
     * @param domestic : true if this Ostrich is tamed, false otherwise
     */
    Ostrich(String name, boolean domestic){
        super(2.0);
        this.setBioType(Global.LAND);
        this.setDietType((short) (Global.CARN+Global.HERB));
        this.setWeight(145);
        this.setName(name);
        this.setDomestic(domestic);
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
    public void move(double speed) {

    }
}
