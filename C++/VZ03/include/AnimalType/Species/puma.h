/*
 * author : Rahman (13515124)
 */

#ifndef PUMA_H
#define PUMA_H

#include "kucing.h"

using namespace std;
/** @class Puma
  * kelas Puma
  */
class Puma : public Kucing{
private:
  int Flexibility ; // = true;
public:
  /** @brief constructor
    * tanpa parameter
    */
  Puma();
  /** @brief constructor
    * @param _Flexibility : nilai dari Flexibility
    * @param tamed : jinak ataut tidaknya hewan
    */
  Puma(int _Flexibility, bool tamed);
  /**
    * @brief fungsi interact
    * memberikan respons dari Puma ketika dikunjungi
    * berupa suara Puma
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Puma di layar pada virtual zoo
    */
  void render();
};

#endif
