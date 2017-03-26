/*
 * author : Ariq (13515112)
 */


#include "../../../include/AnimalType/Species/flamingo.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Flamingo::Flamingo() {
  setBioType('A');
  setDietType('C');
  setWeight(2);
  setName("Flamingo");
  setTamed(true);
  pink = true;
}
/** @brief constructor
  * @param _pink : nilai dari pink
  * @param tamed : menentukan hewan jinak atau tidak
  */
Flamingo::Flamingo(bool _pink, bool tamed) {
  setBioType('A');
  setDietType('C');
  setName("Flamingo");
  setWeight(2);
  setTamed(tamed);
  pink = _pink;
}
/** @brief fungsi interact
  * memberikan respons dari Flamingo ketika dikunjungi
  * berupa suara Flamingo
  */
void Flamingo::interact() {
  cout << "Flamingo: Kwakk Kwakk" << endl;
}
/** @brief fungsi render
  * menampilkan Flamingo di layar pada virtual zoo
  */
void Flamingo::render(){
  Color::Modifier text(Color::FG_YELLOW);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Fl" << cleartext;
}