/*
 * author : Rahman (13515124)
 */

#ifndef SIMPANZE_H
#define SIMPANZE_H

#include <bits/stdc++.h>
#include "monyet.h"

using namespace std;
/** @class Simpanze
  * kelas Simpanze
  */
class Simpanze : public Monyet{
private:
  int ClimbingSkill ;
public:
  /** @brief constructor
    * tanpa parameter
    */
  Simpanze();
  /** @brief constructor
    * @param _ClimbingSkill : nilai dari ClimbingSkill
    * @param tamed : jinak atau tidaknya hewan
    */
  Simpanze(int _ClimbingSkill, bool tamed);
  /**
    * @brief fungsi interact
    * memberikan respons dari simpanze ketika dikunjungi
    * berupa respons simpanze
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Simpanze di layar pada virtual zoo
    */
  void render();
};

#endif