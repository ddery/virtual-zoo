package animal.species;

import animal.landanimal.LandAnimal;
import animal.reptile.Reptile;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class KomodoDragon extends Reptile implements LandAnimal{

    /**
     * Constructor of KomodoDragon
     * @param domestic : true if this KomodoDragon is tamed, false otherwise
     */
    public KomodoDragon(boolean domestic){
        super(4);
        this.setWeight(70);
        this.setName("KomodoDragon");
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void interact() {System.out.println("Zz...");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Km" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
