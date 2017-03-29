package animal.pisces;

import animal.Animal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
public abstract class Pisces extends Animal{
    /* true if pisces is harmful for human */
    private final boolean harmful;

    /**
     * Constructor for pisces
     * Pisces has default attribute value :
     * bioType : WATER
     * respiratoryOrgan : GILL
     * @param harmful : true if pisces is harmful for human, false otherwise
     */
    protected Pisces(boolean harmful){
        this.setBioType(Global.WATER);
        this.setRespiratoryOrgan(Global.GILL);
        this.harmful = harmful;
    }
    /**
     * @return name of pisces's gill
     */
    @SuppressWarnings("unused")
    boolean isHarmful(){ return harmful; }
}
