/*
 * author : Rahman (13515124)
 */

#ifndef ORANGUTAN_H
#define ORANGUTAN_H

#include "monyet.h"

using namespace std;
/** @class Orangutan
  * kelas Orangutan
  */
class Orangutan : public Monyet{
private:
  int aggressiveness ;
public:
  /** @brief constructor
    * tanpa parameter
    */
  Orangutan();
  /** @brief constructor
    * @param _aggressiveness : nilai dari aggressiveness
    * @param tamed : jinak atau tidaknya hewan
    */
  Orangutan(int _aggressiveness, bool tamed);
  /**
    * @brief fungsi interact
    * memberikan respons dari Orangutan ketika dikunjungi
    * berupa respons Orangutan
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Orangutan di layar pada virtual zoo
    */
  void render();
};

#endif