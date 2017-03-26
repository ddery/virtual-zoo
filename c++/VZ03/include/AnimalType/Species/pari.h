/*
 * author : Dery (13515097)
 */

#ifndef PARI_H
#define PARI_H

#include "../pisces.h"
#include "../water_animal.h"

using namespace std;
/** @class Pari
  * kelas Pari
  */
class Pari : public WaterAnimal, public Pisces {
private :
  int width;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  Pari();
  /** @brief constructor
    * @param _width : nilai dari width
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Pari(int _width, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Pari ketika dikunjungi
    * berupa suara Pari
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Pari di layar pada virtual zoo
    */
  void render();
};

#endif