/*
 * author : Dery (13515097)
 */


#include "../../../include/AnimalType/Species/goliath_frog.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
GoliathFrog::GoliathFrog() {
  setBioType('z');
  setDietType('C');
  setWeight(3);
  setTamed(true);
  setName("Goliath Frog");
  JumpPower = 10;
}
/** @brief constructor
  * @param _JumpPower : nilai dari JumpPower
  * @param tamed : menentukan hewan jinak atau tidak
  */
GoliathFrog::GoliathFrog(int _JumpPower, bool tamed) {
  setBioType('z');
  setDietType('C');
  setWeight(3);
  setName("Goliath Frog");
  setTamed(tamed);
  JumpPower = _JumpPower;  
}
/** @brief fungsi interact
  * memberikan respons dari GoliathFrog ketika dikunjungi
  * berupa suara GoliathFrog
  */
void GoliathFrog::interact() {
  cout << "Goliath Frog: Krok Krok" << endl;
}
/** @brief fungsi render
  * menampilkan GoliathFrog di layar pada virtual zoo
  */
void GoliathFrog::render() {
  Color::Modifier text(Color::FG_GREEN);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Gf" << cleartext;
}