/*
 * author : Rahman (13515124)
 */
#ifndef BUNGLON_H
#define BUNGLON_H

#include "../reptil.h"
#include "../land_animal.h"

using namespace std;
/** @class Bunglon
  * kelas Bunglon
  * merupakan kelas riil dari hewan bunglon
  * Bunglon dapat dimunculkan ke layar dan juga
  * dapat berinteraksi dengan pengunjung di dekatnya
  */
class Bunglon : public LandAnimal, public Reptil {
private:
  int mimic_skill ;
public:
  /** @brief constructor
    * tanpa parameter
    */
  Bunglon();
  /** @brief constructor
    * @param _mimic_skill : nilai dari mimic_skill
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Bunglon(int _mimic_skill, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Bunglon ketika dikunjungi
    * berupa suara Bunglon
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Bunglon di layar pada virtual zoo
    */
  void render();
};

#endif