/*
 * author : Dery (13515097)
 */

#include "../../include/CellType/land_habitat.h"

/*
      * @brief Constructor
      * Menciptakan sebuah LandHabitat dengan identifier sebuah string
      * untuk soilType
      * @param soil : patokan untuk soilType
      */
LandHabitat::LandHabitat(string soil){
    Cell::setType('L');
    Cell::setAnimal(NULL);
    soilType = soil;
}
/*
* @brief Destructor
*/
LandHabitat::~LandHabitat(){
    delete Cell::getAnimal();
}
/*
 * @brief fungsi render
* berfungsi menampilkan LandHabitat ke layar
*/
void LandHabitat::render(){
    Color::Modifier land(Color::BG_RED);
    Color::Modifier clear(Color::BG_DEFAULT);

    cout << land << "  " << clear;//Cell::getType();
}