/*
 * author : Rahman (13515124)
 */


#include "../../../include/AnimalType/Species/orangutan.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Orangutan::Orangutan(){
  setBioType('L');
  setDietType('O');
  setWeight(80);
  setTamed(true);
  setName("Orang Utan");
  aggressiveness = 10;
}
/** @brief constructor
  * @param _aggressiveness : nilai dari aggressiveness
  * @param tamed : jinak atau tidaknya hewan
  */
Orangutan::Orangutan(int _aggressiveness, bool tamed){
  setBioType('L');
  setDietType('O');
  setWeight(80);
  setName("Orang Utan");
  setTamed(tamed);
  aggressiveness = _aggressiveness;
}
/**
  * @brief fungsi interact
  * memberikan respons dari Orangutan ketika dikunjungi
  * berupa respons Orangutan
  */
void Orangutan::interact(){
  cout << "Orangutan: Auwoooooo" << endl;
}
/** @brief fungsi render
  * menampilkan Orangutan di layar pada virtual zoo
  */
void Orangutan::render() {
  Color::Modifier text(Color::FG_RED);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Ou" << cleartext;
}