/*
 * author : Dery (13515097)
 */

#ifndef HABITAT_H
#define HABITAT_H

#include "../renderable.h"
#include "../cell.h"

using namespace std;
/** @class Habitat
  * Kelas Habitat dengan forAnimal
  */
class Habitat : public Cell{
private:
    bool forAnimal = true; /*!< member forAnimal sebagai identifier */
};

#endif