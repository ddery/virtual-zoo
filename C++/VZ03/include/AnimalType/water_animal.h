/*
 * author : Dery (13515097)
 */

#ifndef WATER_ANIMAL_H
#define WATER_ANIMAL_H

#include <bits/stdc++.h>
#include "../animal.h"

using namespace std;
/** @class WaterAnimal
	* kelas WaterAnimal
  * kelas abstrak turunan dari animal
  * base dari hewan-hewan yang hidup di air
	*/
class WaterAnimal : public virtual Animal {
private:
  bool in_water = true; // menyatakan hewan hidup di air
public:
  /** @brief fungsi IsInWater
    * mengetahui apakah hewan tersebut hidup di air atau tidak
    */
  bool IsInWater();
};

#endif
