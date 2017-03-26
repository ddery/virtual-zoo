#include "../include/animal.h"
#include <bits/stdc++.h>
#include <string.h>

using namespace std;

/**
  * @brief constructor
  * membuat animal dengan species yang ditentukan
  */
Animal::Animal(string _species){
  name = _species;
  tamed = true;
    
  if(_species == "Bunglon") {
    bioType = 'L';
    dietType = 'C';
    weight = 1;
    expression = "Bunglon : ssshhhh";
    code = 'B';
  }else if(_species == "Burung Unta") {
    bioType = 'A';
    dietType = 'H';
    weight = 145;
    expression = "Burung Unta : walkwakkk";
    code = 'U';
  }else if(_species == "Cendrawasi") {
    bioType = 'A';
    dietType = 'H';
    weight = 0.5;
    expression = "Cendrawasi : weoooo ";
    code = 'C';
  }else if(_species == "Elang") {
    bioType = 'A';
    dietType = 'C';
    weight = 1;
    expression = "Elang : hwaaak";
    code = 'E';
  }else if(_species == "Flamingo") {
    bioType = 'A';
    dietType = 'C';
    weight = 2;
    expression = "Flamingo : kwakk kwakk";
    code = 'F';
  }else if(_species == "Gajah") {
    bioType = 'L';
    dietType = 'H';
    weight = 5000;
    expression = "Gajah : Uuuuu";
    code = 'G';
  }else if(_species == "Goliath Frog") {
    bioType = 'L';
    dietType = 'C';
    weight = 3;
    expression = "Goliath Frog : krok krok";
    code = 'f';
  }else if(_species == "Gorilla") {
    bioType = 'L';
    dietType = 'H';
    weight = 200;
    expression = "Gorilla : Grauuuum";
    code = 'g';
  }else if(_species == "Harimau") {
    bioType = 'L';
    dietType = 'C';
    weight = 210;
    expression = "Harimau : Uuuuuuuum";
    code = 'H';
  }else if(_species == "Komodo") {
    bioType = 'L';
    dietType = 'C';
    weight = 70;
    expression = "Komodo : Tssst";
    code = 'K';
  }else if(_species == "Lumba lumba") {
    bioType = 'W';
    dietType = 'C';
    weight = 635;
    expression = "Lumba lumba : *muncul dari permukaan* cyaas";
    code = 'L';
  }else if(_species == "Merak") {
    bioType = 'A';
    dietType = 'H';
    weight = 8;
    expression = "Merak : kwakk kwakk";
    code = 'M';
  }else if(_species == "Orangutan") {
    bioType = 'L';
    dietType = 'H';
    weight = 80;
    expression = "Orangutan : auoooo";
    code = 'O';
  }else if(_species == "Panda") {
    bioType = 'L';
    dietType = 'H';
    weight = 100;
    expression = "Panda : Uuuaaa";
    code = 'P';
  }else if(_species == "Pari") {
    bioType = 'W';
    dietType = 'C';
    weight = 100;
    expression = "Pari : Krrrrr";
    code = 'p';
  }else if(_species == "Paus Humpback") {
    bioType = 'W';
    dietType = 'C';
    weight = 36000;
    expression = "Paus Humpback : Huuuuum";
    code = 'h';
  }else if(_species == "Pinguin") {
    bioType = 'A';
    dietType = 'H';
    weight = 30;
    expression = "Pinguin : wakkkk";
    code = 'N';
  }else if(_species == "Puma") {
    bioType = 'L';
    dietType = 'C';
    weight = 180;
    expression = "Puma : Ghroaar";
    code = 'm';
  }else if(_species == "Salamander") {
    bioType = 'z';
    dietType = 'H';
    weight = 1;
    expression = "Salamander : Zzzz";
    code = 'S';
  }else if(_species == "Salmon") {
    bioType = 'W';
    dietType = 'C';
    weight = 4;
    expression = "Salmon : Splash";
    code = 's';
  }else if(_species == "Simpanze") {
    bioType = 'L';
    dietType = 'H';
    weight = 70;
    expression = "Simpanze : Uuuaaaa";
    code = 'z';
  }else if(_species == "Singa") {
    bioType = 'L';
    dietType = 'C';
    weight = 200;
    expression = "Singa : Auuuum";
    code = 'X';
  }
}
/**
  * @brief constructor
  * membuat animal dengan species yang ditentukan dan tamed yang ditentukan
  */
Animal::Animal(string _species, bool _tamed){
  name = _species;
  tamed = _tamed;
    
  if(_species == "Bunglon") {
    bioType = 'L';
    dietType = 'C';
    weight = 1;
    expression = "Bunglon : ssshhhh";
    code = 'B';
  }else if(_species == "Burung Unta") {
    bioType = 'A';
    dietType = 'H';
    weight = 145;
    expression = "Burung Unta : walkwakkk";
    code = 'U';
  }else if(_species == "Cendrawasi") {
    bioType = 'A';
    dietType = 'H';
    weight = 0.5;
    expression = "Cendrawasi : weoooo ";
    code = 'C';
  }else if(_species == "Elang") {
    bioType = 'A';
    dietType = 'C';
    weight = 1;
    expression = "Elang : hwaaak";
    code = 'E';
  }else if(_species == "Flamingo") {
    bioType = 'A';
    dietType = 'C';
    weight = 2;
    expression = "Flamingo : kwakk kwakk";
    code = 'F';
  }else if(_species == "Gajah") {
    bioType = 'L';
    dietType = 'H';
    weight = 5000;
    expression = "Gajah : Uuuuu";
    code = 'G';
  }else if(_species == "Goliath Frog") {
    bioType = 'L';
    dietType = 'C';
    weight = 3;
    expression = "Goliath Frog : krok krok";
    code = 'f';
  }else if(_species == "Gorilla") {
    bioType = 'L';
    dietType = 'H';
    weight = 200;
    expression = "Gorilla : Grauuuum";
    code = 'g';
  }else if(_species == "Harimau") {
    bioType = 'L';
    dietType = 'C';
    weight = 210;
    expression = "Harimau : Uuuuuuuum";
    code = 'H';
  }else if(_species == "Komodo") {
    bioType = 'L';
    dietType = 'C';
    weight = 70;
    expression = "Komodo : Tssst";
    code = 'K';
  }else if(_species == "Lumba lumba") {
    bioType = 'W';
    dietType = 'C';
    weight = 635;
    expression = "Lumba lumba : *muncul dari permukaan* cyaas";
    code = 'L';
  }else if(_species == "Merak") {
    bioType = 'A';
    dietType = 'H';
    weight = 8;
    expression = "Merak : kwakk kwakk";
    code = 'M';
  }else if(_species == "Orangutan") {
    bioType = 'L';
    dietType = 'H';
    weight = 80;
    expression = "Orangutan : auoooo";
    code = 'O';
  }else if(_species == "Panda") {
    bioType = 'L';
    dietType = 'H';
    weight = 100;
    expression = "Panda : Uuuaaa";
    code = 'P';
  }else if(_species == "Pari") {
    bioType = 'W';
    dietType = 'C';
    weight = 100;
    expression = "Pari : Krrrrr";
    code = 'p';
  }else if(_species == "Paus Humpback") {
    bioType = 'W';
    dietType = 'C';
    weight = 36000;
    expression = "Paus Humpback : Huuuuum";
    code = 'h';
  }else if(_species == "Pinguin") {
    bioType = 'A';
    dietType = 'H';
    weight = 30;
    expression = "Pinguin : wakkkk";
    code = 'N';
  }else if(_species == "Puma") {
    bioType = 'L';
    dietType = 'C';
    weight = 180;
    expression = "Puma : Ghroaar";
    code = 'm';
  }else if(_species == "Salamander") {
    bioType = 'Z';
    dietType = 'H';
    weight = 1;
    expression = "Salamander : Zzzz";
    code = 'S';
  }else if(_species == "Salmon") {
    bioType = 'W';
    dietType = 'C';
    weight = 4;
    expression = "Salmon : Splash";
    code = 's';
  }else if(_species == "Simpanze") {
    bioType = 'L';
    dietType = 'H';
    weight = 70;
    expression = "Simpanze : Uuuaaaa";
    code = 'z';
  }else if(_species == "Singa") {
    bioType = 'L';
    dietType = 'C';
    weight = 200;
    expression = "Singa : Auuuum";
    code = 'X';
  }
}
/** @brief interact
  * Mencetak ke layar suara yang dihasilkan oleh hewan
  * Pure virtual
  */
void Animal::interact(){
  cout << expression << endl;
}
/** @brief foodConsumption
  * memberikan keluaran jumlah makanan yang dibutuhkan
  * @return weight div 10
  */
int Animal::foodConsumption() {
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
int Animal::getWeight() {
	return weight;
}
/** @brief setWeight
  * mengatur nilai weight
  * @param _weight : nilai weight
  */
void Animal::setWeight(int _weight) {
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
/** @brief render
  * berfungsi merepresentasikan perilaku  setiap objek untuk kemudian ditampilkan di layar
  */
void Animal::render() {
	cout << code << code;
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
