/*
 * author : Dery (13515097)
 */

#ifndef LAND_HABITAT_H
#define LAND_HABITAT_H

#include "habitat.h"

using namespace std;
/** @class LandHabitat
  * Kelas LandHabitat dengan soilType
  */
class LandHabitat : public Habitat{
private:
    string soilType; /*!< member soilType sebagai identifier */

public:
    /*
    * @brief Constructor
    * Menciptakan sebuah LandHabitat dengan identifier sebuah string
    * untuk soilType
    * @param soil : patokan untuk soilType
    */
    LandHabitat(string soil);
    /*
    * @brief Destructor
    */
    ~LandHabitat();
    /*
     * @brief fungsi render
   * berfungsi menampilkan LandHabitat ke layar
   */
    void render();
};

#endif