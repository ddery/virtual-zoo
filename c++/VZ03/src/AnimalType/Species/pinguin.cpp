
#include "../../../include/AnimalType/Species/pinguin.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Pinguin::Pinguin() {
  setBioType('A');
  setDietType('H');
  setWeight(30);
  setName("Pinguin");
  setTamed(true);
  height = 1;
}
/** @brief constructor
  * @param _height : nilai dari height
  * @param tamed : menentukan hewan jinak atau tidak
  */
Pinguin::Pinguin(int _height, bool tamed) {
  setBioType('A');
  setDietType('H');
  setWeight(30);
  setName("Pinguin");
  setTamed(tamed);
  height = _height;
}
/** @brief fungsi interact
  * memberikan respons dari Pinguin ketika dikunjungi
  * berupa suara Pinguin
  */
void Pinguin::interact() {
  cout << "Pinguin: Wakkkk" << endl;
}
/** @brief fungsi render
  * menampilkan Pinguin di layar pada virtual zoo
  */
void Pinguin::render() {
  Color::Modifier text(Color::FG_YELLOW);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Pg" << cleartext;
}