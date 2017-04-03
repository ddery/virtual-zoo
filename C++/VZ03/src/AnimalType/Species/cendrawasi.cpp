
#include "../../../include/AnimalType/Species/cendrawasi.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Cendrawasi::Cendrawasi() {
  setBioType('A');
  setDietType('H');
  setWeight(0.5);
  setName("Cendrawasi");
  setTamed(true);
  beauty_score = 10;
}
/** @brief constructor
  * @param _beauty_score : nilai dari beauty_score
  * @param tamed : menentukan hewan jinak atau tidak
  */
Cendrawasi::Cendrawasi(int _beauty_score, bool tamed) {
  setBioType('A');
  setDietType('H');
  setWeight(0.5);
  setName("Cendrawasi");
  setTamed(tamed);
  beauty_score = _beauty_score;
}
/** @brief fungsi interact
  * memberikan respons dari Cendrawasi ketika dikunjungi
  * berupa suara Cendrawasi
  */
void Cendrawasi::interact() {
  cout << "Cendrawasi: Weooooo" << endl;
}
/** @brief fungsi render
  * menampilkan Cendrawasi di layar pada virtual zoo
  */
void Cendrawasi::render(){
  Color::Modifier text(Color::FG_YELLOW);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Cn" << cleartext;
}