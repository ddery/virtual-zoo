/*
 * author : Rahman (13515124)
 */

#ifndef KUCING_H
#define KUCING_H

#include <bits/stdc++.h>
#include "../mamalia.h"
#include "../land_animal.h"

using namespace std;
/** @class Kucing
  * kelas Kucing
  */
class Kucing : public LandAnimal, public Mamalia{
private:
  string eye_color = "Yellow" ; // = true;
public:
  /** @brief fungsi GetEyeColor
    * berfungsi mengembalikan warna mata dari kucing
    */
  string GetEyeColor();
};

#endif
