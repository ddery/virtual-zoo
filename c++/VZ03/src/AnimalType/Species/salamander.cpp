/*
 * author : Dery (13515097)
 */

#include "../../../include/AnimalType/Species/salamander.h"


using namespace std;

/** @brief constructor
  * tanpa parameter
  */
Salamander::Salamander(){
    setBioType('z');
    setDietType('H');
    setWeight(1);
    setName("Salamander");
    setTamed(true);
}
/**
  * @brief fungsi interact
  * memberikan respons dari simpanze ketika dikunjungi
  * berupa respons simpanze
  */
void Salamander::interact(){
    cout << "Salamander: Zzzzzzz " << endl;
}
/** @brief fungsi render
  * menampilkan Simpanze di layar pada virtual zoo
  */
void Salamander::render() {
    Color::Modifier text(Color::FG_BLUE);
    Color::Modifier cleartext(Color::FG_DEFAULT);
    cout << text << "Sl" << cleartext;
}