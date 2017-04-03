/*
 * author : Dery (13515097)
 */

#ifndef PAUS_HUMPBACK_H
#define PAUS_HUMPBACK_H

#include "../mamalia.h"
#include "../water_animal.h"

using namespace std;
/** @class PausHumpback
  * kelas PausHumpback
  */
class PausHumpback : public WaterAnimal, public Mamalia {
private :
  bool humpback_ability;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  PausHumpback();
  /** @brief constructor
    * @param _humpback_ability : nilai dari humpback_ability
    * @param tamed : menentukan hewan jinak atau tidak
    */
  PausHumpback(bool _humpback_ability, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari PausHumpback ketika dikunjungi
    * berupa suara PausHumpback
    */
  void interact();
  /** @brief fungsi render
    * menampilkan PausHumpback di layar pada virtual zoo
    */
  void render();
};

#endif