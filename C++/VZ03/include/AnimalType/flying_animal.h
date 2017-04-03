/*
 * author : Ariq (13515112)
 */

#ifndef FLYING_ANIMAL_H
#define FLYING_ANIMAL_H

#include <bits/stdc++.h>
#include "../animal.h"

using namespace std;
/** @class FlyingAnimal
	* kelas FlyingAnimal
  * merupakan kelas abstrak turunan dari animal
  * yang merupakan base dari animal-animal
  * yang dapat terbang atau sejenis burung
	*/

class FlyingAnimal : public virtual Animal {
private:
	bool fly = true; // menyatakan hewan bisa terbang
public:
  /** @brief fungsi IsFly
    * berfungsi mengembalikan nilai dari IsFly
    */
  bool IsFly();
};

#endif
