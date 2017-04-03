/*
 * author : Rahman (13515124)
 */

#ifndef GORILA_H
#define GORILA_H

#include <bits/stdc++.h>
#include "monyet.h"

using namespace std;
/** @class Gorila
  * kelas Gorila 
  */
class Gorila : public Monyet{
private:
  int BicepsSize ;
public:
  /** @brief constructor
    * tanpa parameter
    */
  Gorila();
  /** @brief constructor
    * @param _BicepsSize : nilai dari BicepsSize
    * @param tamed : jinak ataut tidaknya hewan
    */
  Gorila(int _BicepsSize, bool tamed);
  /**
    * @brief fungsi interact
    * memberikan respons dari Gorila ketika dikunjungi
    * berupa auman gorila
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Gorila di layar pada virtual zoo
    */
  void render();
};

#endif