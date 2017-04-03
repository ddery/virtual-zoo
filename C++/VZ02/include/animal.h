#ifndef ANIMAL_H
#define ANIMAL_H

#include <bits/stdc++.h>

using namespace std;

/** @class Animal
	* Abstract Base Class
	*/
class Animal {
	public:
		/**@brief constructor
			* membuat animal dengan species yang ditentukan
			*/
		Animal(string _species);
		/** @brief constructor
			* membuat animal dengan species yang ditentukan dan tamed yang ditentukan
			*/
		Animal(string _species, bool _tamed);
		/** @brief interact
			* Mencetak ke layar suara yang dihasilkan oleh hewan
			* Pure virtual
			*/
		void interact();
		/** @brief foodConsumption
			* memberikan keluaran jumlah makanan yang dibutuhkan
			* @return weight div 10
			*/
		int foodConsumption();
		/** @brief getDietType
			* memberikan type diet
			* @return dietType
			*/
		char getDietType();
		/** @brief setDietType
			* mengatur nilai dari dietType
			* @param _dietType : nilai dietType
			*/
		void setDietType(char _dietType);
		/** @brief getBioType
			* memberikan nilai biotype
			* @return biotype
			*/
		char getBioType();
		/** @brief setBioType
			* mengatur nilai biotype
			* @param _bioType: nilai biotype
			*/
		void setBioType(char _bioType);
		/** @brief getWeight
			* memberikan nilai weight
			* @return weight
			*/
		int getWeight();
		/** @brief setWeight
			* mengatur nilai weight
			* @param _weight : nilai weight
			*/
		void setWeight(int _weight);
		/** @brief isTamed
			* memberikan nilai dari tamed
			* @return tamed
			*/
		bool isTamed();
		/** @brief setTamed
			* mengatur nilai tamed
			* @param _tamed : nilai tamed
			*/
		void setTamed(bool _tamed);
		/** @brief render
		 	* berfungsi merepresentasikan perilaku  setiap objek untuk kemudian ditampilkan di layar
			*/
		void render();
		/**
		 * @brief getName
		 * mengembalikan nilai nama dari animal
		 */
		string getName();
		/**
		 * @brief setName
		 * mengeset nama spesies pada hewan
		 * @param _name : nama spesies
		 */
		void setName(string _name);
	private:
		char dietType; // tipe makan hewan.
		char bioType; // habitat hewan.
		float weight; // berat hewan.
		bool tamed; // kondisi hewan. bernilai true jika kondisi hewan sudah dijinakkan
		string expression; // hal yang dapat diamati dari hewan
		string name;	// nama species animal
		char code; // identitas masing masing animal saat render
};

#endif
