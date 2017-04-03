/*
 * author : Ariq (13515112)
 */

#ifndef PINGUIN_H
#define PINGUIN_H

#include "../aves.h"
#include "../flying_animal.h"

using namespace std;
/** @class Pinguin
  * kelas Pinguin
  */
class Pinguin : public FlyingAnimal, public Aves {
private :
  int height;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  Pinguin();
  /** @brief constructor
    * @param _height : nilai dari height
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Pinguin(int _height, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Pinguin ketika dikunjungi
    * berupa suara Pinguin
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Pinguin di layar pada virtual zoo
    */
  void render();
};

#endif