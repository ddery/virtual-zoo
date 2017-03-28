package animal.amphibia;

import animal.Animal;
import util.global.Global;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public abstract class Amphibia extends Animal{
    /* primary Respiratory */
    private short primaryRespiratory;

    /**
     * Constructor for Amphibia
     * Amphibia has default attribute value :
     * bioType : WATER+LAND
     * respiratoryOrgan : LUNG+GILL
     * @param primaryRespiratory : for primary respiratory LUNG or GILL
     */
    public Amphibia(short primaryRespiratory){
        this.setBioType((short) (Global.WATER+Global.LAND));
        this.setRespiratoryOrgan((short) (Global.LUNG+Global.GILL));
        this.primaryRespiratory = primaryRespiratory;
    }

    /**
     * get primary respiratory of amphibian animal
     * @return short int of primary respiratory organ
     */
    short getPrimaryRespiratory(){
        return primaryRespiratory;
    }
    /**
     * get secondary respiratory of amphibian animal
     * @return short int of secondary respiratory organ
     */
    short getSecondaryRespiratory(){
        return (short) (primaryRespiratory ^ this.getRespiratoryOrgan());
    }
}
