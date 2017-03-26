/*
 * author : Rahman (13515124)
 */

#ifndef MAMALIA_H
#define MAMALIA_H

#include <bits/stdc++.h>
#include "../animal.h"

using namespace std;
/**	@class Mamalia
	* Kelas Mamalia
  * Menyatakan kelas abstrak mamalia turunan dari animal
  * menjadi base class dari hewan-hewan yang melahirkan
  * dan menyusui
	*/
class Mamalia: public virtual Animal {
private:
	bool menyusui = true; // menyatakan hewan menyusui
public:
  /** @brief IsMenyusui
    * Mengembalikan apakah hewan tersebut menyusui atau tidak
    */
  bool IsMenyusui();
};

#endif
