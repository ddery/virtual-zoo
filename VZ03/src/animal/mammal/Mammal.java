package animal.mammal;

import animal.Animal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public abstract class Mammal extends Animal {

    /* number of legs */
    private int numLegs;
    /* number of hands */
    private int numHands;

    /**
     * Constructor for mammal
     * Mammal has default attribute value :
     * bioType : LAND
     * dietType : OMNIVORE
     * respiratoryOrgan : LUNG
     * @param numLegs : number of leg
     * @param numHands : number of hand
     */
    public Mammal(int numLegs, int numHands){
        this.setBioType(Global.LAND);
        this.setDietType((short) (Global.HERB+Global.CARN));
        this.setRespiratoryOrgan(Global.LUNG);
        this.numLegs = numLegs;
        this.numHands = numHands;
    }

    /**
     * get number of legs
     * @return number of legs of animal
     */
    public int numberOfLegs(){ return numLegs; }

    /**
     * get number of hands
     * @return number of hands of animal
     */
    public int numberOfHands(){ return numHands;}
}
