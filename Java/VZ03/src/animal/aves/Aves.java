package animal.aves;

import animal.Animal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
public abstract class Aves extends Animal{
    private final double wingSpan;

    /**
     * Constructor for Aves
     * Aves has default attribute values :
     * bioType : AIR
     * respiratoryOrgan LUNG
     * @param wingSpan : size of animal's wing in m
     */
    protected Aves(double wingSpan){
        this.setBioType(Global.AIR);
        this.setRespiratoryOrgan(Global.LUNG);
        this.wingSpan = wingSpan;
    }
    /**
     * get wing span of aves
     * @return wing span of aves in m
     */
    @SuppressWarnings("unused")
    double getWingSpan(){
        return wingSpan;
    }
}
