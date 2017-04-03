#include "../include/cell.h"
#include "../include/animal.h"


/*
  * @brief constructor
  * membuat cell sesuai dengan _type
  */
Cell::Cell(char _type){
  type = _type;
  hewan = NULL;
}
/*
  * @brief fungsi getType
  * berfungsi mengembalikan type di cell tersebut
  */
char Cell::getType(){
    return type;
}
/*
  * @brief fungsi getAnimal
  * berfungsi mengembalikan animal di cell tersebut
  * jika ada
  */
Animal* Cell::getAnimal(){
    return hewan;
}
/*
  * @brief fungsi setType
  * berfungsi mengassign type cell tersebut
  * @param _type : type yg akan di assign
  */
void Cell::setType(char _type){
    type = _type;
}
/*
  * @brief fungsi setAnimal
  * berfungsi mengassign seekor Animal di cell tersebut
  * @param A : Animal yg akan di assign
  */
void Cell::setAnimal(Animal * A){
    hewan = A;

}
/*
  * @brief fungsi isLH
  * berfungsi mengembalikan apakah cell tersebut adalah
  * LandHabitat atau bukan
  */
bool Cell::isLH(){
    return (type == 'L');
}
/*
  * @brief fungsi isWH
  * berfungsi mengembalikan apakah cell tersebut adalah
  * WaterHabitat atau bukan
  */
bool Cell::isWH(){
    return (type == 'W');
}
/*
  * @brief fungsi isAH
  * berfungsi mengembalikan apakah cell tersebut adalah
  * AirHabitat atau bukan
  */
bool Cell::isAH(){
    return (type == 'A');
}
/*
  * @brief fungsi isRestaurant
  * berfungsi mengembalikan apakah cell tersebut adalah
  * Restaurant atau bukan
  */
bool Cell::isRestaurant(){
    return (type == 'R');
}
/*
  * @brief fungsi isRoad
  * berfungsi mengembalikan apakah cell tersebut adalah
  * Road atau bukan
  */
bool Cell::isRoad(){
    return (type == 'r');
}
/*
  * @brief fungsi isPark
  * berfungsi mengembalikan apakah cell tersebut adalah
  * Park atau bukan
  */
bool Cell::isPark(){
    return (type == 'P');
}
/*
  * @brief fungsi isEntrance
  * berfungsi mengembalikan apakah cell tersebut adalah
  * Entrance atau bukan
  */
bool Cell::isEntrance(){
    return (type == 'E');
}
/*
  * @brief fungsi isExit
  * berfungsi mengembalikan apakah cell tersebut adalah
  * Exit atau bukan
  */
bool Cell::isExit(){
    return (type == 'e');
}
/*
  * @brief fungsi isAnimal
  * berfungsi mengembalikan apakah cell tersebut sedang
  * ditempati oleh seekor animal atau tidak
  */
bool Cell::isAnimal(){
    return (hewan != NULL);
}
/*
  * @brief fungsi pure virtual render
  * berfungsi menurunkan fungsi render ke seluruh turunannya
  */
void Cell::render() {
  Color::Modifier land(Color::BG_RED);
  Color::Modifier air(Color::BG_LIGHT_YELLOW);
  Color::Modifier park(Color::BG_GREEN);
  Color::Modifier road(Color::BG_DARK_GRAY);
  Color::Modifier rest(Color::BG_MAGENTA);
  Color::Modifier water(Color::BG_BLUE);
  Color::Modifier clear(Color::BG_DEFAULT);

  if(getType() == 'r')
    cout << road << "  " << clear;//Cell::getType();
  else if(getType() == 'E')
    cout << road << "  " << clear;//Cell::getType();
  else if(getType() == 'e')
    cout << road << "  " << clear;//Cell::getType();
  else if(getType() == 'R')
    cout << rest << "  " << clear;//Cell::getType();
  else if(getType() == 'W')
    cout << water << "  " << clear;//Cell::getType();
  else if(getType() == 'L')
    cout << land << "  " << clear;//Cell::getType();
  else if(getType() == 'A')
    cout << air << "  " << clear;//Cell::getType();
  else if(getType() == 'P')
    cout << park << "  " << clear;//Cell::getType();
}
