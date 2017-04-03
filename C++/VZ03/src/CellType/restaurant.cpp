/*
 * author : Ariq (13515112)
 */

#include "../../include/CellType/restaurant.h"

/*
      * @brief Constructor
      * Menciptakan sebuah Restaurant dengan identifier sebuah string
      * untuk restoName
      * @param name : patokan untuk restoName
      */
Restaurant::Restaurant(string name){
    Cell::setType('R');
    //Cell::setAnimal(NULL);
    restoName = name;
}
/*
  * @brief Destructor
  */
Restaurant::~Restaurant(){
    delete Cell::getAnimal();
}
/*
 * @brief fungsi render
 * berfungsi menampilkan Restaurant ke layar
 */
void Restaurant::render(){
    Color::Modifier rest(Color::BG_MAGENTA);
    Color::Modifier clear(Color::BG_DEFAULT);

    cout << rest << "  " << clear;//Cell::getType();
}