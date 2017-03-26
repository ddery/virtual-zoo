/*
 * author : Ariq (13515112)
 */

#ifndef ROAD_H
#define ROAD_H

#include "facility.h"

using namespace std;
/** @class Road
  * Kelas Road dengan roadType
  */
class Road : public Facility {
private :
    string roadType; /*!< member roadType sebagai identifier */

public :
    /*
     * @brief Constructor
     * Menciptakan sebuah Road dengan identifier sebuah string
     * untuk roadType
     * @param _road : patokan untuk roadType
     */
    Road(string _road);
    /*
      * @brief Destructor
      */
    ~Road();
    /*
     * @brief fungsi render
     * berfungsi menampilkan Road ke layar
     */
/**
 * @brief getRoadType
 * mengambil nilai tipe jalan
 */
    string getRoadType();
    /**
     * @brief setRoadType
     * memberikan nilai tipe jalan
     * @param type : tipe jalan
     */
    void setRoadType(string type);
    void render();
};

#endif