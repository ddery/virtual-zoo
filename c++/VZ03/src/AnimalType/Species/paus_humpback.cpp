/*
 * author : Dery (13515097)
 */


#include "../../../include/AnimalType/Species/paus_humpback.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
PausHumpback::PausHumpback() {
  setBioType('W');
  setDietType('C');
  setWeight(36000);
  setName("Paus Humback");
  setTamed(true);
  humpback_ability = true;  
}
/** @brief constructor
  * @param _humpback_ability : nilai dari humpback_ability
  * @param tamed : menentukan hewan jinak atau tidak
  */
PausHumpback::PausHumpback(bool _humpback_ability, bool tamed) {
  setBioType('W');
  setDietType('C');
  setWeight(36000);
  setName("Paus Humback");
  setTamed(tamed);
  humpback_ability = _humpback_ability;
}
/** @brief fungsi interact
  * memberikan respons dari PausHumpback ketika dikunjungi
  * berupa suara PausHumpback
  */
void PausHumpback::interact() {
  cout << "PausHumpback: Huuuummmmm" << endl; 
}
/** @brief fungsi render
  * menampilkan PausHumpback di layar pada virtual zoo
  */
void PausHumpback::render() {
  Color::Modifier text(Color::FG_BLUE);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Ph" << cleartext;
}