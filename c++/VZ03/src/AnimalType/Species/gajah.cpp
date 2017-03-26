/*
 * author : Rahman (13515124)
 */


#include "../../../include/AnimalType/Species/gajah.h"

using namespace std;
  /** @brief constructor tanpa parameter
    * override method dan atribut asli dari kelas animal
  	* set tuskLength= 2
  	*/
  Gajah::Gajah(){
    setBioType('L');
    setDietType('H');
    setWeight(5000);
    setName("Gajah");
    setTamed(true);
    tuskLength = 2;
  }
	
	/** @brief constructor dengan parameter
	  * @param tuskLength= _tuskLength
    * @param tamed : jinak ataut tidaknya hewan
	  * override method dan atribut asli dari kelas animal
	  */
	Gajah::Gajah(int _tuskLength, bool tamed){
    setBioType('L');
    setDietType('H');
    setWeight(80);
      setName("Gajah");
    setTamed(tamed);
    tuskLength = _tuskLength;
  }

	/** @brief ekspresi yang diberikan oleh kelas ini
	  * menuliskan "uuuu" ke layar
	  */
	void Gajah::interact(){
    cout << "Gajah: Uuuuuuu" << endl;
  }
  /** @brief fungsi render
    * menampilkan Gajah di layar pada virtual zoo
    */
  void Gajah::render(){
    Color::Modifier text(Color::FG_RED);
    Color::Modifier cleartext(Color::FG_DEFAULT);
    cout << text << "G " << cleartext;
  }