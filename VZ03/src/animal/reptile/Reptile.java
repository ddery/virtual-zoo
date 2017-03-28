package animal.reptile;

import animal.Animal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public abstract class Reptile extends Animal {
    /* poisonous relative, 0-5 */
    private int poisonousRelative;

    /**
     * Constructor for reptile
     * Reptile has a default attribute value :
     * bioType : LAND
     * dietType : CARN
     * respiratoryOrgan LUNG
     * @param poisonousRelative : poisonous relative 0-5
     */
    public Reptile(int poisonousRelative){
        this.setBioType(Global.LAND);
        this.setDietType(Global.CARN);
        this.setRespiratoryOrgan(Global.LUNG);
        this.poisonousRelative = poisonousRelative;
    }
    /**
     * get poisonous relative of reptile
     * 5 is very dangerous, 0 with no poison
     * @return relative poisonous
     */
    int getPoisonousRelative(){ return poisonousRelative; }
}
