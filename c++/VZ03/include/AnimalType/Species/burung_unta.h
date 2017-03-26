/*
 * author : Ariq (13515112)
 */
#ifndef BURUNG_UNTA_H
#define BURUNG_UNTA_H

#include "../aves.h"
#include "../flying_animal.h"

using namespace std;
/** @class BurungUnta
  * kelas BurungUnta
  */
class BurungUnta : public FlyingAnimal, public Aves {
private :
  int leg_length;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  BurungUnta();
  /** @brief constructor
    * @param _leg_length : nilai dari leg_length
    * @param tamed : menentukan hewan jinak atau tidak
    */
  BurungUnta(int _leg_length, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari BurungUnta ketika dikunjungi
    * berupa suara BurungUnta
    */
  void interact();
  /** @brief fungsi render
    * menampilkan BurungUnta di layar pada virtual zoo
    */
  void render();
};

#endif