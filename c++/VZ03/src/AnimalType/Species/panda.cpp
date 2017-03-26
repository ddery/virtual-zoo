/*
 * author : Rahman (13515124)
 */


#include "../../../include/AnimalType/Species/panda.h"

using namespace std;

  /** @brief constructor
    * tanpa parameter
    */
  Panda::Panda(){
    setBioType('L');
    setDietType('O');
    setWeight(100);
    setName("Panda");
    setTamed(true);
    FromChina = true;
  }
  /** @brief constructor
    * @param _FromChina : nilai dari FromChina
    * @param tamed : menentukan hewan jinak atau tidak
    */
  Panda::Panda(bool _FromChina, bool tamed){
    setBioType('L');
    setDietType('O');
    setWeight(100);
    setName("Panda");
    setTamed(tamed);
    FromChina = _FromChina;
  }
  /** @brief fungsi interact
    * memberikan respons dari panda ketika dikunjungi
    * berupa suara panda
    */
  void Panda::interact(){
    cout << "Panda: UuuAaaa" << endl;
  }
  /** @brief fungsi render
    * menampilkan Panda di layar pada virtual zoo
    */
  void Panda::render() {
    Color::Modifier text(Color::FG_GREEN);
    Color::Modifier cleartext(Color::FG_DEFAULT);
    cout << text << "P " << cleartext;
  }