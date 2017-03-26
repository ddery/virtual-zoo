/*
 * author : Rahman (13515124)
 */

#include "../include/animal.h"

/** @brief foodConsumption
  * memberikan keluaran jumlah makanan yang dibutuhkan
  * @return weight div 10
  */
float Animal::foodConsumption() {
	return weight/10;
}
/** @brief getDietType
  * memberikan type diet
  * @return dietType
  */
char Animal::getDietType() {
	return dietType;
}
/** @brief setDietType
  * mengatur nilai dari dietType
  * @param _dietType : nilai dietType
  */
void Animal::setDietType(char _dietType) {
	dietType= _dietType;
}
/** @brief getBioType
  * memberikan nilai biotype
  * @return biotype
  */
char Animal::getBioType() {
	return bioType;
}
/** @brief setBioType
  * mengatur nilai biotype
  * @param _bioType: nilai biotype
  */
void Animal::setBioType(char _bioType) {
	bioType= _bioType;
}
/** @brief getWeight
  * memberikan nilai weight
  * @return weight
  */
float Animal::getWeight() {
	return weight;
}
/** @brief setWeight
  * mengatur nilai weight
  * @param _weight : nilai weight
  */
void Animal::setWeight(float _weight) {
	weight= _weight;
}
/** @brief isTamed
  * memberikan nilai dari tamed
  * @return tamed
  */
bool Animal::isTamed() {
	return tamed==true;
}
/** @brief setTamed
  * mengatur nilai tamed
  * @param _tamed : nilai tamed
  */
void Animal::setTamed(bool _tamed) {
	tamed= _tamed;
}
/**
 * @brief getName
 * mengembalikan nilai nama dari animal
 */
string Animal::getName(){
	return name;
}
/**
 * @brief setName
 * mengeset nama spesies pada hewan
 * @param _name : nama spesies
 */
void Animal::setName(string _name){
	this->name = _name;
}