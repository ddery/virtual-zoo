/*
 * author : Rahman (13515124)
 */



#include "../../../include/AnimalType/Species/singa.h"

using namespace std;
  /** @brief constructor
    * tanpa parameter
    */
  Singa::Singa(){
    setBioType('L');
    setDietType('C');
    setWeight(200);
    setTamed(false);
    setName("Singa");
    MaxStrength = 10;
  }
  /** @brief constructor
    * @param _MaxStrength : nilai dari MaxStrength
    * @param tamed : jinak ataut tidaknya hewan
    */
  Singa::Singa(int _MaxStrength, bool tamed){
    setBioType('L');
    setDietType('C');
    setWeight(200);
    setName("Singa");
    setTamed(tamed);
    MaxStrength = _MaxStrength;
  }
  /**
    * @brief fungsi interact
    * memberikan respons dari singa ketika dikunjungi
    * berupa auman singa
    */
  void Singa::interact(){
    cout << "Singa: Auuuuum" << endl;
  }
  /** @brief fungsi render
    * menampilkan singa di layar pada virtual zoo
    */
  void Singa::render() {
    Color::Modifier text(Color::FG_RED);
    Color::Modifier cleartext(Color::FG_DEFAULT);
    cout << text << "Sg" << cleartext;
  }
