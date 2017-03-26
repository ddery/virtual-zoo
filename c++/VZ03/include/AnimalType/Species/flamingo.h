/*
 * author : Ariq (13515112)
 */

#ifndef FLAMINGO_H
#define FLAMINGO_H

#include "../flying_animal.h"
#include "../aves.h"

using namespace std;
/** @class Flamingo
  * kelas Flamingo
  */
class Flamingo : public FlyingAnimal, public Aves {
private :
  bool pink;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  Flamingo();
  /** @brief constructor
    * @param _pink : nilai dari pink
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Flamingo(bool _pink, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Flamingo ketika dikunjungi
    * berupa suara Flamingo
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Flamingo di layar pada virtual zoo
    */
  void render();
};

#endif