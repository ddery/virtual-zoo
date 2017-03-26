/*
 * author : Rahman (13515124)
 */

#ifndef SINGA_H
#define SINGA_H

#include <bits/stdc++.h>
#include "kucing.h"

using namespace std;
/** @class Singa
  * kelas Singa
  */
class Singa : public Kucing{
public:
  int MaxStrength ;
  /** @brief constructor
    * tanpa parameter
    */
  Singa();
  /** @brief constructor
    * @param _MaxStrength : nilai dari MaxStrength
    * @param tamed : jinak ataut tidaknya hewan
    */
  Singa(int _MaxStrength, bool tamed);
  /**
    * @brief fungsi interact
    * memberikan respons dari singa ketika dikunjungi
    * berupa auman singa
    */
  void interact();
  /** @brief fungsi render
    * menampilkan singa di layar pada virtual zoo
    */
  void render();
};

#endif
