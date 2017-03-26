/*
 * author : Dery (13515097)
 */

#ifndef AMPHIBIA_H
#define AMPHIBIA_H

using namespace std;

#include <bits/stdc++.h>
#include "../animal.h"
/** @class Amphibia
	* kelas Amphibia
  * kelas abstrak turunan dari animal
  * merupakan base dari animal yang hidup di
  * darat dan di air
	*/
class Amphibia: public virtual Animal {
private:
	bool dual_respiratory = true; // menyatakan hewan amphibi dengan 2 respirasi
public:
  /** @brief fungsi GetRespiratory
    * berfungsi mengembalikan nilai dual_respiratory
    */
  bool GetRespiratory();
};

#endif
