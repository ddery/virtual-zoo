package animal.flyinganimal;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public interface FlyingAnimal {
    /**
     * action when flying animal is flying
     * @param speed : speed when animal is flying in m/s
     * @param altitude : altitude of flying animal in m
     */
    void fly(double speed, double altitude);
}
