
#include "../../../include/AnimalType/Species/komodo.h"

using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Komodo::Komodo(){
  setBioType('L');
  setDietType('C');
  setWeight(70);
  setName("Komodo");
  setTamed(true);
  cannibals = true;
}
/** @brief constructor
  * @param _cannibals : nilai dari cannibals
  * @param tamed : menentukan hewan jinak atau tidak
  */
Komodo::Komodo(bool _cannibals, bool tamed){
  setBioType('L');
  setDietType('C');
  setName("Komodo");
  setWeight(70);
  setTamed(tamed);
  cannibals = _cannibals;
}
/** @brief fungsi interact
  * memberikan respons dari komodo ketika dikunjungi
  * berupa suara komodo
  */
void Komodo::interact(){
  cout << "Komodo: Psssst" << endl;
}
/** @brief fungsi render
  * menampilkan komodo di layar pada virtual zoo
  */
void Komodo::render() {
  Color::Modifier text(Color::FG_GREEN);
  Color::Modifier cleartext(Color::FG_DEFAULT);
  cout << text << "Ko" << cleartext;
}