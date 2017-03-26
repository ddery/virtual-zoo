/*
 * author : Dery (13515097)
 */

#include "../../include/CellType/air_habitat.h"

/*
      * @brief Constructor
      * Menciptakan sebuah AirHabitat dengan identifier sebuah integer
      * untuk maximumHeight
      * @param maxHeight : patokan untuk maximumHeight
      */
AirHabitat::AirHabitat(int maxHeight){
    Cell::setType('A');
    Cell::setAnimal(NULL);
    maximumHeight = maxHeight;
}
/*
* @brief Destructor
*/
AirHabitat::~AirHabitat(){
    delete Cell::getAnimal();
}
/*
 * @brief fungsi render
* berfungsi menampilkan AirHabitat ke layar
*/
void AirHabitat::render(){
    Color::Modifier air(Color::BG_LIGHT_YELLOW);
    Color::Modifier clear(Color::BG_DEFAULT);
    cout << air << "  " << clear;//Cell::getType();
}