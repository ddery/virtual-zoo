/*
 * author : Rahman (13515124)
 */

#ifndef ANIMAL_H
#define ANIMAL_H

#include "renderable.h"

/** @class Animal
	* Abstract Base Class
	*/
class Animal : public Renderable {
	public:
		/** @brief interact
			* Mencetak ke layar suara yang dihasilkan oleh hewan
			* Pure virtual
			*/
		virtual void interact()= 0;
		/** @brief foodConsumption
			* memberikan keluaran jumlah makanan yang dibutuhkan
			* @return weight div 10
			*/
		float foodConsumption();
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
		float getWeight();
		/** @brief setWeight
			* mengatur nilai weight
			* @param _weight : nilai weight
			*/
		void setWeight(float _weight);
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
		virtual void render()=0;
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
		string name; // nama spesies
		char dietType; // tipe makan hewan.
		char bioType; // habitat hewan.
		float weight; // berat hewan.
		bool tamed; // kondisi hewan. bernilai true jika kondisi hewan sudah dijinakkan
};

#endif
