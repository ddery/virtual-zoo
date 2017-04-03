/*
 * author : Dery (13515097)
 */

#ifndef GOLIATH_FROG_H
#define GOLIATH_FROG_H

#include "../land_animal.h"
#include "../amphibia.h"

using namespace std;
/** @class GoliathFrog
  * kelas GoliathFrog
  */
class GoliathFrog : public LandAnimal, public Amphibia {
private:
  int JumpPower ; 
public:
  /** @brief constructor
    * tanpa parameter
    */
  GoliathFrog();
  /** @brief constructor
    * @param _JumpPower : nilai dari JumpPower
    * @param tamed : menentukan hewan jinak atau tidak
    */
  GoliathFrog(int _JumpPower, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari GoliathFrog ketika dikunjungi
    * berupa suara GoliathFrog
    */
  void interact();
  /** @brief fungsi render
    * menampilkan GoliathFrog di layar pada virtual zoo
    */
  void render();
};

#endif
