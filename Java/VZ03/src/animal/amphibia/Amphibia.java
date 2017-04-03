package animal.amphibia;

import animal.Animal;
import util.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
public abstract class Amphibia extends Animal{
    /* primary Respiratory */
    private final short primaryRespiratory;

    /**
     * Constructor for Amphibia
     * Amphibia has default attribute value :
     * bioType : WATER+LAND
     * respiratoryOrgan : LUNG+GILL
     */
    protected Amphibia(){
        this.setBioType((short) (Global.WATER+Global.LAND));
        this.setRespiratoryOrgan((short) (Global.LUNG+Global.GILL));
        this.primaryRespiratory = Global.LUNG;
    }

    /**
     * get primary respiratory of amphibian animal
     * @return short int of primary respiratory organ
     */
    @SuppressWarnings("unused")
    short getPrimaryRespiratory(){
        return primaryRespiratory;
    }
    /**
     * get secondary respiratory of amphibian animal
     * @return short int of secondary respiratory organ
     */
    @SuppressWarnings("unused")
    short getSecondaryRespiratory(){
        return (short) (primaryRespiratory ^ this.getRespiratoryOrgan());
    }
}
