/*
 * author : Ariq (13515112)
 */


#include "../../../include/AnimalType/Species/merak.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Merak::Merak() {
  setBioType('A');
  setDietType('H');
  setWeight(8);
  setName("Merak");
  setTamed(true);
  feather_color = "Rainbow";
}
/** @brief constructor
  * @param _feather_color : nilai dari feather_color
  * @param tamed : menentukan hewan jinak atau tidak
  */
Merak::Merak(string _feather_color, bool tamed) {
  setBioType('A');
  setDietType('H');
  setName("Merak");
  setWeight(8);
  setTamed(tamed);
  feather_color = _feather_color;
}
/** @brief fungsi interact
  * memberikan respons dari Merak ketika dikunjungi
  * berupa suara Merak
  */
void Merak::interact() {
  cout << "Merak: Kwakk Kwakk" << endl;
}
/** @brief fungsi render
  * menampilkan merak di layar pada virtual zoo
  */
void Merak::render() {
  Color::Modifier text(Color::FG_YELLOW);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Mr" << cleartext;
}