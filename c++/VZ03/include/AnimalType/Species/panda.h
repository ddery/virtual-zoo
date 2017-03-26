/*
 * author : Rahman (13515124)
 */

#ifndef PANDA_H
#define PANDA_H

#include "../mamalia.h"
#include "../land_animal.h"

using namespace std;
/** @class Panda
  * kelas Panda
  */
class Panda : public LandAnimal, public Mamalia{
private:
  bool FromChina ; // = true;
public:
  /** @brief constructor
    * tanpa parameter
    */
  Panda();
  /** @brief constructor
    * @param _FromChina : nilai dari FromChina
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Panda(bool _FromChina, bool tamed);
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
