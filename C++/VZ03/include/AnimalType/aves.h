/*
 * author : Ariq (13515112)
 */

#ifndef AVES_H
#define AVES_H

#include <bits/stdc++.h>
#include "../animal.h"

using namespace std;
/** @class Aves
	* kelas Aves
  * kelas abstrak turunan dari animal
  * base class dari animal yang merupakan kelas Aves
	*/
class Aves: public virtual Animal {
private:
	int max_altitude = 1000; // maksimum ketinggian hewan, 1000 meter
	int max_speed = 100; // maksimum kecepatan hewan, 100 km/h
public:
  /** @brief fungsi GetAltitude
    * berfungsi mengembalikan nilai max_altitude
    */
  int GetAltitude();
  /** @brief fungsi GetSpeed
    * berfungsi mengembalikan nilai max_speed
    */
  int GetSpeed();
};

#endif
