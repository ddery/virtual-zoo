/*
 * author : Dery (13515097)
 */

#include "../../include/CellType/water_habitat.h"

/*
      * @brief Constructor
      * Menciptakan sebuah WaterHabitat dengan identifier sebuah integer
      * untuk oxygenRate
      * @param oxygen : patokan untuk oxygenRate
      */
WaterHabitat::WaterHabitat(int oxygen){
    Cell::setType('W');
    Cell::setAnimal(NULL);
    oxygenRate = oxygen;
}
/*
* @brief Destructor
*/
WaterHabitat::~WaterHabitat(){
    delete Cell::getAnimal();
}
/*
 * @brief fungsi render
* berfungsi menampilkan WaterHabitat ke layar
*/
void WaterHabitat::render(){
    Color::Modifier water(Color::BG_BLUE);
    Color::Modifier clear(Color::BG_DEFAULT);

    cout << water << "  " << clear;//Cell::getType();
}