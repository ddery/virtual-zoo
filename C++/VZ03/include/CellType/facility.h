/*
 * author : Ariq (13515112)
 */

#ifndef FACILITY_H
#define FACILITY_H

#include "../cell.h"
#include "../renderable.h"

using namespace std;
/** @class Facility
  * Kelas Facility dengan forPeople
  */
class Facility : public Cell{
private:
    bool forPeople = true; /*!< member forPeople sebagai identifier */
};

#endif
