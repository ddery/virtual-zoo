/*
 * author : Ariq (13515112)
 */

#ifndef PARK_H
#define PARK_H

#include "facility.h"

using namespace std;
/** @class Park
  * Kelas Park dengan parkName
  */
class Park : public Facility {
private :
    string parkName; /*!< member parkName sebagai identifier */

public :
    /*
     * @brief Constructor
     * Menciptakan sebuah Park dengan identifier sebuah string
     * untuk parkName
     * @param name : patokan untuk parkName
     */
    Park(string name);
    /*
      * @brief Destructor
      */
    ~Park();
    /*
     * @brief fungsi render
     * berfungsi menampilkan Park ke layar
     */
    void render();
};

#endif