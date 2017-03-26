/*
 * author : Ariq (13515112)
 */

#include "../../include/CellType/park.h"

/*
      * @brief Constructor
      * Menciptakan sebuah Park dengan identifier sebuah string
      * untuk parkName
      * @param name : patokan untuk parkName
      */
Park::Park(string name){
    Cell::setType('P');
    //Cell::setAnimal(NULL);
    parkName = name;
}
/*
  * @brief Destructor
  */
Park::~Park(){
    delete Cell::getAnimal();
}
/*
 * @brief fungsi render
 * berfungsi menampilkan Park ke layar
 */
void Park::render(){
    Color::Modifier park(Color::BG_GREEN);
    Color::Modifier clear(Color::BG_DEFAULT);

    cout << park << "  " << clear;//Cell::getType();
}