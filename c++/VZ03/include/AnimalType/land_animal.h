/*
 * author : Rahman (13515124)
 */

#ifndef LAND_ANIMAL_H
#define LAND_ANIMAL_H

#include <bits/stdc++.h>
#include "../animal.h"

using namespace std;
/** @class LandAnimal
	* kelas LandAnimal
  * merupakan kelas abstrak turunan dari animal
  * menjadi base class dari animal-animal yang
  * hidup di daratan
	*/
class LandAnimal : public virtual Animal {
private:
  bool on_land = true; // menyatakan hewan hidup di darat
public:
  /** @brief fungsi IsOnLand
    * berfungsi mengembalikan nilai on_land
    */
  bool IsOnLand();
};

#endif
