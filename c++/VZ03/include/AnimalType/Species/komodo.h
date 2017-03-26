/*
 * author : Rahman (13515124)
 */

#ifndef KOMODO_H
#define KOMODO_H


#include "../land_animal.h"
#include "../reptil.h"

using namespace std;
/** @class Komodo
  * kelas Komodo
  */
class Komodo : public LandAnimal, public Reptil {
private:
  bool cannibals ; // = true;
public:
  /** @brief constructor
    * tanpa parameter
    */
  Komodo();
  /** @brief constructor
    * @param _cannibals : nilai dari cannibals
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Komodo(bool _cannibals, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari komodo ketika dikunjungi
    * berupa suara komodo
    */
  void  interact();
  /** @brief fungsi render
    * menampilkan komodo di layar pada virtual zoo
    */
  void render();
};

#endif
