package animal.aves;

import animal.Animal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public abstract class Aves extends Animal{
    private double wingSpan;

    /**
     * Constructor for Aves
     * Aves has default attribute values :
     * bioType : AIR
     * respiratoryOrgan LUNG
     * @param wingSpan : size of animal's wing in m
     */
    public Aves(double wingSpan){
        this.setBioType(Global.AIR);
        this.setRespiratoryOrgan(Global.LUNG);
        this.wingSpan = wingSpan;
    }
    /**
     * get wing span of aves
     * @return wing span of aves in m
     */
    double getWingSpan(){
        return wingSpan;
    }
}
