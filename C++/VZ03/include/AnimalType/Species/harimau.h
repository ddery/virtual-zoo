/*
 * author : Rahman (13515124)
 */

#ifndef HARIMAU_H
#define HARIMAU_H

#include <bits/stdc++.h>
#include "kucing.h"

using namespace std;
/** @class Harimau
  * kelas Harimau
  */
class Harimau : public Kucing{
private:
  bool striped ; 
public:
  /** @brief constructor
    * tanpa parameter
    */
  Harimau();
  /** @brief constructor
    * @param _striped : nilai dari striped
    * @param tamed : jinak ataut tidaknya hewan
    */
  Harimau(bool _striped, bool tamed);
  /*
    * @brief fungsi interact
    * memberikan respons dari harimau ketika dikunjungi
    * berupa suara harimau
    */
  void interact();
  /** @brief fungsi render
    * menampilkan harimau di layar pada virtual zoo
    */
  void render();
};

#endif
