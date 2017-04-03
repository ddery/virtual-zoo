/*
 * author : Rahman (13515124)
 */


#include "../../../include/AnimalType/Species/simpanze.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Simpanze::Simpanze(){
  setBioType('L');
  setDietType('O');
  setWeight(70);
  setTamed(true);
  setName("Simpanze");
  ClimbingSkill = 10;
}
/** @brief constructor
  * @param _ClimbingSkill : nilai dari ClimbingSkill
  * @param tamed : jinak atau tidaknya hewan
  */
Simpanze::Simpanze(int _ClimbingSkill, bool tamed){
  setBioType('L');
  setDietType('O');
  setWeight(70);
  setName("Simpanze");
  setTamed(tamed);
  ClimbingSkill = _ClimbingSkill;
}
/**
  * @brief fungsi interact
  * memberikan respons dari simpanze ketika dikunjungi
  * berupa respons simpanze
  */
void Simpanze::interact(){
  cout << "Simpanze: 'UuA'A" << endl;
}
/** @brief fungsi render
  * menampilkan Simpanze di layar pada virtual zoo
  */
void Simpanze::render() {
  Color::Modifier text(Color::FG_YELLOW);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Sz" << cleartext;
}