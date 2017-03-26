

#include "../../../include/AnimalType/Species/puma.h"

using namespace std;

  /** @brief constructor
    * tanpa parameter
    */
  Puma::Puma(){
    setBioType('L');
    setDietType('C');
    setWeight(180);
    setTamed(false);
    setName("Puma");
    Flexibility = 5;
  }
  /** @brief constructor
    * @param _Flexibility : nilai dari Flexibility
    * @param tamed : jinak ataut tidaknya hewan
    */
  Puma::Puma(int _Flexibility, bool tamed){
    setBioType('L');
    setDietType('C');
    setWeight(180);
    setTamed(tamed);
    setName("Puma");
    Flexibility = _Flexibility;
  }
  /**
    * @brief fungsi interact
    * memberikan respons dari Puma ketika dikunjungi
    * berupa suara Puma
    */
  void Puma::interact(){
    cout << "Puma: Ghruarrr" << endl;
  }
  /** @brief fungsi render
    * menampilkan Puma di layar pada virtual zoo
    */
  void Puma::render() {
    Color::Modifier text(Color::FG_YELLOW);
    Color::Modifier cleartext(Color::FG_DEFAULT);
    cout << text << "Pm" << cleartext;
  }