/*
 * author : Dery (13515097)
 */

#ifndef AIR_HABITAT_H
#define AIR_HABITAT_H

#include "habitat.h"

using namespace std;
/** @class AirHabitat
  * Kelas AirHabitat dengan maximumHeight
  */
class AirHabitat : public Habitat{
private:
    int maximumHeight; /*!< member maximumHeight sebagai identifier */

public:
    /*
    * @brief Constructor
    * Menciptakan sebuah AirHabitat dengan identifier sebuah integer
    * untuk maximumHeight
    * @param maxHeight : patokan untuk maximumHeight
    */
    AirHabitat(int maxHeight);
    /*
    * @brief Destructor
    */
    ~AirHabitat();
    /*
     * @brief fungsi render
   * berfungsi menampilkan AirHabitat ke layar
   */
    void render();
};

#endif