/*
 * author : Ariq (13515112)
 */

#include "../../include/CellType/entrance.h"

Entrance::Entrance(string _road = "Entrance") : Road(_road) {
    this->setRoadType(_road);
    Cell::setType('E');
}