/*
 * author : Ariq (13515112)
 */

#ifndef RESTAURANT_H
#define RESTAURANT_H

#include "facility.h"

using namespace std;
/** @class Restaurant
  * Kelas Restaurant dengan restoName
  */
class Restaurant : public Facility {
private :
    string restoName; /*!< member restoName sebagai identifier */

public :
    /*
     * @brief Constructor
     * Menciptakan sebuah Restaurant dengan identifier sebuah string
     * untuk restoName
     * @param name : patokan untuk restoName
     */
    Restaurant(string name);
    /*
      * @brief Destructor
      */
    ~Restaurant();
    /*
     * @brief fungsi render
     * berfungsi menampilkan Restaurant ke layar
     */
    void render();
};

#endif