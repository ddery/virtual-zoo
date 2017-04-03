/*
 * author : Rahman (13515124)
 */

#ifndef MONYET_H
#define MONYET_H

#include "../mamalia.h"
#include "../land_animal.h"

using namespace std;

/** @brief Kelas Abstrak Monyet
  * merupakan kelas turunan dari land animal dan mamalia
  * base class dari hewan-hewan pada kelas monyet
	*/
class Monyet: public LandAnimal, public Mamalia {
private:
	int intelligence = 100; // menyatakan kepintaran hewan
public:
  /** @brief GetIntelligence
    * berfungsi mengembalikan kepintaran dari monyet tersebut
    */
  int GetIntelligence();
};

#endif
