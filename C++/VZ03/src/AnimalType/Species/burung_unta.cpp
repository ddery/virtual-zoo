
#include "../../../include/AnimalType/Species/burung_unta.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
BurungUnta::BurungUnta() {
  setBioType('A');
  setDietType('H');
  setWeight(145);
  setTamed(true);
  setName("Burung Unta");
  leg_length = 1;
}
/** @brief constructor
  * @param _leg_length : nilai dari leg_length
  * @param tamed : menentukan hewan jinak atau tidak
  */
BurungUnta::BurungUnta(int _leg_length, bool tamed) {
  setBioType('A');
  setDietType('H');
  setWeight(145);
  setTamed(tamed);
  setName("Burung Unta");
  leg_length = _leg_length;
}
/** @brief fungsi interact
  * memberikan respons dari BurungUnta ketika dikunjungi
  * berupa suara BurungUnta
  */
void BurungUnta::interact() {
  cout << "BurungUnta: Wakkk Wakkkk" << endl;
/** @brief fungsi render
  * menampilkan BurungUnta di layar pada virtual zoo
  */
}
void BurungUnta::render(){
  Color::Modifier text(Color::FG_BLUE);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Bu" << cleartext;
}