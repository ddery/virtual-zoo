/*
 * author : Ariq (13515112)
 */

#ifndef MERAK_H
#define MERAK_H

#include "../flying_animal.h"
#include "../aves.h"

using namespace std;
/** @class Merak
  * kelas Merak
  */
class Merak : public FlyingAnimal, public Aves {
private :
  string feather_color;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  Merak();
  /** @brief constructor
    * @param _feather_color : nilai dari feather_color
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Merak(string _feather_color, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Merak ketika dikunjungi
    * berupa suara Merak
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Merak di layar pada virtual zoo
    */
  void render();
};

#endif