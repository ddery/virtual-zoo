/*
 * author : Rahman (13515124)
 */
#ifndef GAJAH_H
#define GAJAH_H

#include "../land_animal.h"
#include "../mamalia.h"

using namespace std;
/** @brief Kelas Riil Gajah
  * Kelas gajah merupakan kelas dari hewan gajah
  * kelas riil dan turunan dari land_animal serta mamalia
	*/
class Gajah: public LandAnimal, public Mamalia {
public:
	/** @brief constructor tanpa parameter
	  * override method dan atribut asli dari kelas animal
	  * set tuskLength = 2
	  */
	Gajah();
	/** @brief constructor dengan parameter
	  * @param tuskLength = _tuskLength
    * @param tamed : jinak ataut tidaknya hewan
	  * override method dan atribut asli dari kelas animal
	  */
	Gajah(int _tuskLength, bool tamed);
	/** @brief ekspresi yang diberikan oleh kelas ini
	  * menuliskan "uuuu" ke layar
	  */
	void interact();
  /** @brief fungsi render
    * menampilkan Gajah di layar pada virtual zoo
    */
  void render();
private:
	int tuskLength; // menyatakan panjang gading
};

#endif