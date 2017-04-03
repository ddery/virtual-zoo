/*
 * author : Rahman (13515124)
 */


#include "../../../include/AnimalType/Species/gorila.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Gorila::Gorila(){
  setBioType('L');
  setDietType('O');
  setName("Gorila");
  setWeight(200);
  setTamed(false);
  BicepsSize = 10;
}
/** @brief constructor
  * @param _BicepsSize : nilai dari BicepsSize
  * @param tamed : jinak ataut tidaknya hewan
  */
Gorila::Gorila(int _BicepsSize, bool tamed){
  setBioType('L');
  setDietType('O');
  setName("Gorila");
  setWeight(200);
  setTamed(tamed);
  BicepsSize = _BicepsSize;
}
/**
  * @brief fungsi interact
  * memberikan respons dari Gorila ketika dikunjungi
  * berupa auman gorila
  */
void Gorila::interact(){
  cout << "Gorila: Grauuuum" << endl;
/** @brief fungsi render
  * menampilkan Gorila di layar pada virtual zoo
  */
}
void Gorila::render() {
  Color::Modifier text(Color::FG_YELLOW);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Gr" << cleartext;
}