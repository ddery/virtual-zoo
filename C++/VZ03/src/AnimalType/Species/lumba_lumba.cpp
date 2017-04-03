/*
 * author : Dery (13515097)
 */


#include "../../../include/AnimalType/Species/lumba_lumba.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
LumbaLumba::LumbaLumba() {
  setBioType('W');
  setDietType('C');
  setName("Lumba-lumba");
  setWeight(635);
  setTamed(true);
  sonar_ability = true;
}
/** @brief constructor
  * @param _sonar_ability : nilai dari sonar_ability
  * @param tamed : menentukan hewan jinak atau tidak
  */
LumbaLumba::LumbaLumba(bool _sonar_ability, bool tamed) {
  setBioType('W');
  setDietType('C');
  setName("Lumba-lumba");
  setWeight(635);
  setTamed(tamed);
  sonar_ability = _sonar_ability;
}
/** @brief fungsi interact
  * memberikan respons dari LumbaLumba ketika dikunjungi
  * berupa suara LumbaLumba
  */
void LumbaLumba::interact() {
  cout << "LumbaLumba: *muncul dari permukaan* Cyasss" << endl;
}
/** @brief fungsi render
  * menampilkan LumbaLumba di layar pada virtual zoo
  */
void LumbaLumba::render() {
  Color::Modifier text(Color::FG_BLUE);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Ll" << cleartext;
}