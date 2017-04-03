package animal.species;

import animal.landanimal.LandAnimal;
import animal.mammal.Mammal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Gorilla extends Mammal implements LandAnimal{

    /**
     * Constructor of Gorilla
     * @param domestic : true if this Gorilla is tamed, false otherwise
     */
    public Gorilla(boolean domestic){
        super(2,2);
        this.setWeight(200);
        this.setName("Gorilla");
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void interact() {System.out.println("HUOOO HUOOO");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Gr" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
