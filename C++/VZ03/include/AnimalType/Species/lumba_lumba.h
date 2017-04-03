/*
 * author : Dery (13515097)
 */

#ifndef LUMBA_LUMBA_H
#define LUMBA_LUMBA_H

#include "../mamalia.h"
#include "../water_animal.h"

using namespace std;
/** @class LumbaLumba
  * kelas LumbaLumba
  */
class LumbaLumba : public WaterAnimal, public Mamalia {
private :
  bool sonar_ability;
public  :
  /** @brief constructor
    * tanpa parameter
    */
  LumbaLumba();
  /** @brief constructor
    * @param _sonar_ability : nilai dari sonar_ability
    * @param tamed : menentukan hewan jinak atau tidak
    */
  LumbaLumba(bool _sonar_ability, bool tamed);
  /** @brief fungsi interact
    * memberikan respons dari LumbaLumba ketika dikunjungi
    * berupa suara LumbaLumba
    */
  void interact();
  /** @brief fungsi render
    * menampilkan LumbaLumba di layar pada virtual zoo
    */
  void render();
};

#endif