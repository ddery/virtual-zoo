/*
 * author : Dery (13515097)
 */

#ifndef PISCES_H
#define PISCES_H

#include <bits/stdc++.h>
#include "../animal.h"

using namespace std;
/**	@class Pisces
	* kelas Pisces
  * Merupakan kelas abstrak turunan dari animal
  * menjadi base class dari animal-animal yang
  * hidup di air dan memiliki insang sebagai
  * alat pernafasan
	*/
class Pisces: public virtual Animal {
private:
	bool insang = true; // menyatakan hewan mempunyai insang
public:
  /** @brief GetInsang
    * mengembalikan apakah hewan tersebut memiliki insang
    * sebagai alat pernafasan atau tidak
    */
  bool GetInsang();
};

#endif
