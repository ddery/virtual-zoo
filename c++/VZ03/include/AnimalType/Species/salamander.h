/*
 * author : Dery (13515097)
 */

#ifndef SALAMANDER_H
#define SALAMANDER_H

#include "../amphibia.h"
#include "../land_animal.h"
#include "../water_animal.h"

using namespace std;
/** @class Salamander
  * kelas Salamander
  */
class Salamander : public LandAnimal, public WaterAnimal, public Amphibia{
public:
    /** @brief constructor
      * tanpa parameter
      */
    Salamander();
    /** @brief fungsi interact
      * memberikan respons dari panda ketika dikunjungi
      * berupa suara panda
      */
    void interact();
    /** @brief fungsi render
      * menampilkan Panda di layar pada virtual zoo
      */
    void render();
};

#endif
