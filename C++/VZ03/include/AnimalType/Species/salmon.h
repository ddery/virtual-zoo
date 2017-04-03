/*
 * author : Dery (13515097)
 */

#ifndef SALMON_H
#define SALMON_H

#include "../water_animal.h"
#include "../pisces.h"

using namespace std;
/** @class Salmon
  * kelas Salmon
  */
class Salmon : public WaterAnimal, public Pisces {
private :
  int length;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  Salmon();
  /** @brief constructor
    * @param _length : nilai dari length
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Salmon(int _length, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Salmon ketika dikunjungi
    * berupa suara Salmon
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Salmon di layar pada virtual zoo
    */
  void render();
};

#endif