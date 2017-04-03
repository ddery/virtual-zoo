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
     * @param domestic : true if this HumpbackWhale is tamed, false otherwise
     */
    public HumpbackWhale(boolean domestic){
        super(0,0);
        this.setBioType(Global.WATER);
        this.setDietType(Global.CARN);
        this.setWeight(36000);
        this.setName("HumpbackWhale");
        this.setDomestic(domestic);
    }

    @Override
    public void swim(double speed, double deep) {
        System.out.println(getName() + " is swimming with speed " + speed + " m/s " + " and " + deep + " m deep");
    }

    @Override
    public void interact() {System.out.println("Hum hum");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Hw" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
