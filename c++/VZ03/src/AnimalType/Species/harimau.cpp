/*
 * author : Rahman (13515124)
 */


#include "../../../include/AnimalType/Species/harimau.h"

using namespace std;

  /** @brief constructor
    * tanpa parameter
    */
  Harimau::Harimau(){
    setBioType('L');
    setDietType('C');
    setWeight(210);
    setTamed(false);
    setName("Harimau");
    striped = true;
  }
  /** @brief constructor
    * @param _striped : nilai dari striped
    * @param tamed : jinak ataut tidaknya hewan
    */
  Harimau::Harimau(bool _striped, bool tamed){
    setBioType('L');
    setDietType('C');
    setName("Harimau");
    setWeight(210);
    setTamed(tamed);
    striped = _striped;
  }
  /** @brief fungsi interact
    * memberikan respons dari harimau ketika dikunjungi
    * berupa suara harimau
    */
  void Harimau::interact(){
    cout << "Harimau: Uuuuuumm" << endl;
  }
  /** @brief fungsi render
    * menampilkan harimau di layar pada virtual zoo
    */
  void Harimau::render() {
    Color::Modifier text(Color::FG_RED);
    Color::Modifier cleartext(Color::FG_DEFAULT);
    cout << text << "Hr" << cleartext;
  }