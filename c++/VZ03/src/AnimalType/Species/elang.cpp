/*
 * author : Ariq (13515112)
 */


#include "../../../include/AnimalType/Species/elang.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Elang::Elang() {
  setBioType('A');
  setDietType('C');
  setWeight(1);
  setName("Elang");
  setTamed(true);
  wing_span = 170;
}
/** @brief constructor
  * @param _wing_span : nilai dari wing_span
  * @param tamed : menentukan hewan jinak atau tidak
  */
Elang::Elang(int _wing_span, bool tamed) {
  setBioType('A');
  setDietType('C');
  setWeight(1);
  setName("Elang");
  setTamed(tamed);
  wing_span = _wing_span;
}
/** @brief fungsi interact
  * memberikan respons dari Elang ketika dikunjungi
  * berupa suara Elang
  */
void Elang::interact() {
  cout << "Elang: Hwaaaaaakk" << endl;
}
/** @brief fungsi render
  * menampilkan Elang di layar pada virtual zoo
  */
void Elang::render(){
  Color::Modifier text(Color::FG_BLUE);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "El" << cleartext;
}