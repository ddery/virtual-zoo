package animal.pisces;

import animal.Animal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public abstract class Pisces extends Animal{
    /* true if pisces is harmful for human */
    private boolean harmful;

    /**
     * Constructor for pisces
     * Pisces has default attribute value :
     * bioType : WATER
     * respiratoryOrgan : GILL
     * @param harmful : true if pisces is harmful for human, false otherwise
     */
    public Pisces(boolean harmful){
        this.setBioType(Global.WATER);
        this.setRespiratoryOrgan(Global.GILL);
        this.harmful = harmful;
    }
    /**
     * @return name of pisces's gill
     */
    boolean isHarmful(){ return harmful; }
}
