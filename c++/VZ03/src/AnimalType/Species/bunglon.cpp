/*
 * author : Rahman (13515124)
 */


#include "../../../include/AnimalType/Species/bunglon.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Bunglon::Bunglon(){
  setBioType('L');
  setDietType('C');
  setWeight(1);
  setTamed(true);
  setName("Bunglon");
  mimic_skill = 10;
}
/** @brief constructor
  * @param _mimic_skill : nilai dari mimic_skill
  * @param tamed : menentukan hewan jinak atau tidak
  */
Bunglon::Bunglon(int _mimic_skill, bool tamed){
  setBioType('L');
  setDietType('C');
  setName("Bunglon");
  setWeight(1);
  setTamed(tamed);
  mimic_skill = _mimic_skill;
}
/** @brief fungsi interact
  * memberikan respons dari Bunglon ketika dikunjungi
  * berupa suara Bunglon
  */
void Bunglon::interact(){
  cout << "Bunglon: Ssshhhh" << endl;
}
/** @brief fungsi render
  * menampilkan Bunglon di layar pada virtual zoo
  */
void Bunglon::render() {
  Color::Modifier text(Color::FG_GREEN);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "B " << cleartext;
}