/*
 * author : Ariq (13515112)
 */

#include "../../include/CellType/road.h"

/*
      * @brief Constructor
      * Menciptakan sebuah Road dengan identifier sebuah string
      * untuk roadType
      * @param _road : patokan untuk roadType
      */
Road::Road(string _road = "defaultRoad"){
    roadType = _road;
    //Cell::setAnimal(NULL);
    //if (roadType == "Entrance"){ Cell::setType('E'); } else
    //if (roadType == "Exit"){ Cell::setType('e'); } else
    Cell::setType('r');
}
/*
  * @brief Destructor
  */
Road::~Road(){
    delete Cell::getAnimal();
}
/**
 * @brief getRoadType
 * mengambil nilai tipe jalan
 */
string Road::getRoadType(){
    return roadType;
}
 /**
  * @brief setRoadType
  * memberikan nilai tipe jalan
  * @param type : tipe jalan
  */
void Road::setRoadType(string type){
     roadType = type;
 }
/*
 * @brief fungsi render
 * berfungsi menampilkan Road ke layar
 */
void Road::render(){
    Color::Modifier road(Color::BG_DARK_GRAY);
    Color::Modifier clear(Color::BG_DEFAULT);

    cout << road << "  " << clear;//Cell::getType();
}