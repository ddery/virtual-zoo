/*
 * author : Ariq (13515112)
 */

#include "../../include/CellType/exit.h"

Exit::Exit(string _road = "Exit") : Road(_road) {
    this->setRoadType(_road);
    Cell::setType('e');
}