/*
 * author : Faiz (13515010)
 */

#ifndef CAGE_H
#define CAGE_H

#include "cell.h"
#include "animal.h"

using namespace std;
/** @class Cage
  * Kelas Cage berfungsi sebagai salah satu child class renderable
  * Cage merupakan pembatas antara habitat-habitat
  */

class Cage {
private:
    /*static Cage *arCage; !< member static berisi seluruh cage yang ada pada zoo */
    static int NbCage; /*!< member static berisi jumlah cage yang ada pada zoo */
    int cageNumber; /*!< member berisi info nomor dari cage */
    int size; /*!< member berisi jumlah cell di dalam cage */
    int nAnimal; /*!< member berisi jumlah animal di dalam cage */
    Cell **cellInside; /*!< cellInside merupakan kumpulan cell yang ada di dalam suatu cage */

public:
    /*
      * @brief Constructor
      * Menciptakan sebuah cage dengan parameter yang sudah dimasukkan
      * Setiap pembuatan Cage, NbCage ditambah, cageNumber = NbCage setelah ditambah
      * @param jumlahCell : jumlah cell yang ada di dalam cage, = countcell
      * @param jumlahAnimal : jumlah animal yang ada di dalam cage
      */
    Cage(int jumlahCell, int jumlahAnimal);
    /*
      * @brief CopyConstructor
      * Melakukan inisialisasi berdasarkan cage lain yang sudah dibuat
      * bukan bitwise copy
      * @param Ca : Acuan cage yang akan dicopy
      */
    Cage(const Cage& Ca);
    /*
      * @brief Destructor
      */
    ~Cage();
    /*
      * @brief fungsi getCageNumber
      berfungsi mengembalikan nomor cage tersebut
      */
    int getCageNumber();
    /*
      * @brief fungsi getCell
      * berfungsi mengembalikan suatu cell yang berada di dalam cage
      */
    Cell* getCell(int i);
    /*
      * @brief fungsi isFull
      * berfungsi mengecek apakah cage tersebut sudah penuh atau belum
      * Jumlah hewan maksimal didalam cage adalah
      * 30% x Jumlah Cell didalam cage
      */
    bool isFull();
    /*
      * @brief fungsi isIsiBuas
      * berfungsi mengecek apakah animal di dalam cage tersebut
      * buas atau jinak. True = buas, false = jinak
      */
    bool isIsiBuas();
    /*
      * @brief fungsi moveAnimal
      * berfungsi menggenerate secara random seluruh pergerakan binatang
      * agar tetap berada di dalam cage
      */
    void moveAnimal();
    /*
      * @brief fungsi getNbCage
      * mengembalikan jumlah cage yang sudah terbentuk di zoo
      */
    static int getNbCage();
    /*
      * @brief render
      * berfungsi merepresentasikan perilaku  setiap objek untuk kemudian ditampilkan di layar
      */
    void render();

    /*
      * @brief setCell
      * berfungsi untuk mengeset cell. Idx dicari terlebih dahulu yang berisi NULL, kemudian baru diisi dengan cell c
      * @param idx : index tempat peletakan cell (jika NULL dimasukan, jika tidak dicari idx yang NULL)
      * @param c : objek cell
      */
    void setCell(int idx, Cell * c);

    /*
      * @brief addAnimal
      * berfungsi untuk menambahkan animal dengan jumlah tertentu.
      * @param a : objek animal
      * @param count : jumlah animal
      */
    void addAnimal(Animal * a, int count);

    /**
     * @brief getnAnimal
     * berfungsi untuk mengembalikan banyaknya animal dalam suatu cage
     */
    int getnAnimal();

    /**
     * @brief getSize
     * berfungsi untuk mengembalikan ukuran kandang (jumlah cell dalam kandang)
     */
    int getSize();

    /**
     * @brief getAnimalWeight
     * berfungsi untuk mengembalikan berat animal berdasarkan tipe makanannya
     * @param c : tipe makanan
     */
    float getAnimalWeight(char c);

    /**
     * @brief getFoodWeight
     * berfungsi untuk menampilkan jumlah berat total yang perlu dikonsumsi hewan
     * berdasarkan tipe makanannya
     * @param c : tipe makanan
     */
    float getFoodWeight(char c);
    /*
      * @brief listanimal
      * menampilkan ke layar semua animal yang ada secara iteratif dari
      * indeks 0,0 sampai indeks 19,19
      */
    void ListAnimal();
};

#endif
