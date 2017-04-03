/*
 * author : Dery (13515097)
 */

#ifndef WATER_HABITAT_H
#define WATER_HABITAT_H

#include "habitat.h"

using namespace std;
/** @class WaterHabitat
  * Kelas WaterHabitat dengan oxygenRate
  */
class WaterHabitat : public Habitat{
private:
    int oxygenRate; /*!< member oxygenRate sebagai identifier */

public:
    /*
    * @brief Constructor
    * Menciptakan sebuah WaterHabitat dengan identifier sebuah integer
    * untuk oxygenRate
    * @param oxygen : patokan untuk oxygenRate
    */
    WaterHabitat(int oxygen);
    /*
    * @brief Destructor
    */
    ~WaterHabitat();
    /*
     * @brief fungsi render
   * berfungsi menampilkan WaterHabitat ke layar
   */
    void render();
};

#endif