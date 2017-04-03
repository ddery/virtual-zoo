/*
 * author : Rahman (13515024)
 */

#ifndef REPTIL_H
#define REPTIL_H

#include <bits/stdc++.h>
#include "../animal.h"

using namespace std;
/** @class Reptil
	* Kelas Reptil
  * Merupakan kelas abstrak turunan dari animal
  * menjadi base class bagi animal-animal yang
  * bersisik dan mayoritas ovipar
	*/
class Reptil: public virtual Animal {
private:
	bool poisonous_relative = true; // menyatakan hewan beracun
public:
  /** @brief fungsi IsPoisonous
    * berfungsi untuk mengetahui apakah hewan tersebut
    * beracun atau tidak
    */
  bool IsPoisonous();
};

#endif
