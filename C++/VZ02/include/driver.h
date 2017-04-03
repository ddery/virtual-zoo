/*
 * author : Dery (13515097), Ariq (13515112)
 */

#ifndef DRIVER_H
#define DRIVER_H

#include "cell.h"
#include "cage.h"
#include "animal.h"
#include "zoo.h"
#include "all.h"

using namespace std;

class Driver{
public:
	Zoo Wow;
	Cage ** kdg;
public:
	/*	@brief constructor
		*	membuat zoo beserta cage
		*/
	Driver();

	/*	@brief destructor
		*	mendealokasi cage
		*/
	~Driver();
	/*	@brief logo
		*	menampilkan logo dan menu ke layar
		*/
	void Logo();
	/*	@brief displayMap
		*	menampilkan bentuk zoo ke layar
		*/
	void DisplayMap();
	/*	@brief Zooinfo
		*	menampilkan ke layar info makanan yang dibutuhkan dalam sehari dan 
		* list animal yang ada
		*/
	void ZooInfo();
	/*	@brief Tourzoo
		*	melakukan tour dengan cara memanggil prosedur Tour ada kelas zoo
		*/
	void TourZoo();
	/*	@brief animalmove
		* membuat animal pindah secara acak 
		*/
	void AnimalMove();

	/**	@brief getNAnimal
		* total Animal dalam Zoo
		*/
	int getNAnimal();

	/**	@brief getFoodConsum
		* total berat makanan Animal dalam Zoo dari tipe hewannya
	 	* Carnivora/Herbivora/Omnifora
	 	* @param type : tipe hewan
		*/
	float getFoodConsum(char type);
	
	/**	@brief getNbCage
	 	* mengembalikan nilai banyaknya Cage yang dibuat dalam kebun binatang
		*/
	int getNbCage();
};

#endif
