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
    public Salamander(String name, boolean domestic){
        super(Global.LUNG);
        this.setDietType(Global.HERB);
        this.setWeight(1);
        this.setName(name);
        this.setDomestic(domestic);
    }
    @Override
    public void move(double speed) {
        System.out.println(getName() + " move in " + speed + "m/s");
    }

    @Override
    public void swim(double speed, double deep) {
        System.out.println(getName() + " is swimming with speed " + speed + " m/s " + " and " + deep + " m deep");
    }

    @Override
    public void interact() {System.out.println("Ssss");
    }

    @Override
    public void render() {
        System.out.print(Global.ANSI_BLUE + "Sl" + Global.ANSI_RESET);
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
