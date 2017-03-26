/*
 * author : Dery (13515097)
 */


#include "../../../include/AnimalType/Species/salmon.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Salmon::Salmon() {
  setBioType('W');
  setDietType('C');
  setWeight(4);
  setTamed(true);
  setName("Salmon");
  length = 1;
}
/** @brief constructor
  * @param _length : nilai dari length
  * @param tamed : menentukan hewan jinak atau tidak
  */
Salmon::Salmon(int _length, bool tamed) {
  setBioType('W');
  setDietType('C');
  setWeight(4);
  setName("Salmon");
  setTamed(tamed);
  length = _length;
}
/** @brief fungsi interact
  * memberikan respons dari Salmon ketika dikunjungi
  * berupa suara Salmon
  */
void Salmon::interact() {
  cout << "Salmon: splashhh" << endl;
}
/** @brief fungsi render
  * menampilkan Salmon di layar pada virtual zoo
  */
void Salmon::render() {
  Color::Modifier text(Color::FG_GREEN);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "So" << cleartext;
}