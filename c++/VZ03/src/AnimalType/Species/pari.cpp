/*
 * author : Dery (13515097)
 */


#include "../../../include/AnimalType/Species/pari.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Pari::Pari() {
  setBioType('W');
  setDietType('C');
  setWeight(100);
  setName("Pari");
  setTamed(true);
  width = 3;
}
/** @brief constructor
  * @param _width : nilai dari width
  * @param tamed : menentukan hewan jinak atau tidak
  */
Pari::Pari(int _width, bool tamed) {
  setBioType('W');
  setDietType('C');
  setWeight(100);
  setName("Pari");
  setTamed(tamed);
  width = _width;
}
/** @brief fungsi interact
  * memberikan respons dari Pari ketika dikunjungi
  * berupa suara Pari
  */
void Pari::interact() {
  cout << "Pari: Krrrrrr" << endl;
}
/** @brief fungsi render
  * menampilkan Pari di layar pada virtual zoo
  */
void Pari::render() {
  Color::Modifier text(Color::FG_BLUE);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Pr" << cleartext;
}