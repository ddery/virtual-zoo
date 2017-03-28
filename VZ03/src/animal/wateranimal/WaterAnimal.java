package animal.wateranimal;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public interface WaterAnimal {
    /**
     * action when water animal is swimming
     * @param speed : speed of animal when swim
     * @param deep : deep of animal relative to water level in m
     */
    void swim(double speed, double deep);
}
