/*
 * author : Ariq (13515112)
 */

#ifndef ELANG_H
#define ELANG_H


#include "../flying_animal.h"
#include "../aves.h"

using namespace std;
/** @class Elang
  * kelas Elang
  */
class Elang : public FlyingAnimal, public Aves {
private :
  int wing_span;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  Elang();
  /** @brief constructor
    * @param _wing_span : nilai dari wing_span
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Elang(int _wing_span, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Elang ketika dikunjungi
    * berupa suara Elang
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Elang di layar pada virtual zoo
    */
  void render();
};

#endif