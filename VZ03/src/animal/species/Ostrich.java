package animal.species;

import animal.aves.Aves;
import animal.landanimal.LandAnimal;
import util.Global;

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
    public Ostrich(String name, boolean domestic){
        super(2.0);
        this.setBioType(Global.LAND);
        this.setDietType((short) (Global.CARN+Global.HERB));
        this.setWeight(145);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void interact() {System.out.println("Os Os");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Os" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }

    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }
}
