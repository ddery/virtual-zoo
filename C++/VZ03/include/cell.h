/*
 * author : Dery (13515097)
 */

#ifndef CELL_H
#define CELL_H

#include "renderable.h"
#include "animal.h"

/** @class Cell
  * Kelas Cell berfungsi sebagai salah satu child class renderable
  * Cell merupakan sebuah pointer to animal atau pointer to child class nya
  * Jika menjadi pointer to child class nya maka menggunakan efek polymorphism
  */
class Cell : public Renderable {
private :
    char type; /*!< member type sebagai identifier */
    Animal* hewan; /*!< member hewan sbg pointer to animal */

public :
    /*
      * @brief fungsi getType
      * berfungsi mengembalikan type di cell tersebut
      */
    char getType();
    /*
      * @brief fungsi getAnimal
      * berfungsi mengembalikan animal di cell tersebut
      * jika ada
      */
    Animal* getAnimal();
    /*
      * @brief fungsi setType
      * berfungsi mengassign type cell tersebut
      * @param _type : type yg akan di assign
      */
    void setType(char _type);
    /*
      * @brief fungsi setAnimal
      * berfungsi mengassign seekor Animal di cell tersebut
      * @param A : Animal yg akan di assign
      */
    void setAnimal(Animal * A);
    /*
      * @brief fungsi isLH
      * berfungsi mengembalikan apakah cell tersebut adalah
      * LandHabitat atau bukan
      */
    bool isLH();
    /*
      * @brief fungsi isWH
      * berfungsi mengembalikan apakah cell tersebut adalah
      * WaterHabitat atau bukan
      */
    bool isWH();
    /*
      * @brief fungsi isAH
      * berfungsi mengembalikan apakah cell tersebut adalah
      * AirHabitat atau bukan
      */
    bool isAH();
    /*
      * @brief fungsi isRestaurant
      * berfungsi mengembalikan apakah cell tersebut adalah
      * Restaurant atau bukan
      */
    bool isRestaurant();
    /*
      * @brief fungsi isRoad
      * berfungsi mengembalikan apakah cell tersebut adalah
      * Road atau bukan
      */
    bool isRoad();
    /*
      * @brief fungsi isPark
      * berfungsi mengembalikan apakah cell tersebut adalah
      * Park atau bukan
      */
    bool isPark();
    /*
      * @brief fungsi isEntrance
      * berfungsi mengembalikan apakah cell tersebut adalah
      * Entrance atau bukan
      */
    bool isEntrance();
    /*
      * @brief fungsi isExit
      * berfungsi mengembalikan apakah cell tersebut adalah
      * Exit atau bukan
      */
    bool isExit();
    /*
      * @brief fungsi isAnimal
      * berfungsi mengembalikan apakah cell tersebut sedang
      * ditempati oleh seekor animal atau tidak
      */
    bool isAnimal();
    /*
      * @brief fungsi pure virtual render
      * berfungsi menurunkan fungsi render ke seluruh turunannya
      */
    virtual void render() = 0;

};

#endif
