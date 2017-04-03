/*
 * author : Ariq (13515112)
 */
#ifndef CENDRAWASI_H
#define CENDRAWASI_H


#include "../aves.h"
#include "../flying_animal.h"

using namespace std;
/** @class Cendrawasi
  * kelas Cendrawasi
  */
class Cendrawasi : public FlyingAnimal, public Aves {
private :
  int beauty_score;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  Cendrawasi();
  /** @brief constructor
    * @param _beauty_score : nilai dari beauty_score
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Cendrawasi(int _beauty_score, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari Cendrawasi ketika dikunjungi
    * berupa suara Cendrawasi
    */
  void interact();
  /** @brief fungsi render
    * menampilkan Cendrawasi di layar pada virtual zoo
    */
  void render();
};

#endif