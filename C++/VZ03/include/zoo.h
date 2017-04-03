/*
 * author : Faiz (13515010)
 */

#ifndef ZOO_H
#define ZOO_H

#include "renderable.h"
#include "cell.h"
#include "cage.h"
#include "animal.h"

using namespace std;

/** @class Zoo
  * Kelas Zoo berfungsi sebagai pengelola keseluruhan zoo
  * terdiri dari matriks of pointer to animal, yang merupakan keseluruhan
  * cell yang ada dalam zoo
  */
class Zoo : public Renderable {
private:
    Cell ***zcell; /*!< member matriks of cell berisi seluruh cell dalam zoo */
    int width, height; /*!< member matriks of cell berisi seluruh cell dalam zoo */

public:

    /*
      * @brief Constructor
      * Menciptakan sebuah Matriks of cell untuk kemudian sebagai tempat pembuatan
      * dan penempatan cell
      * @param height : menyatakan banyaknya panjang dari matriks of cell
      * @param width : menyatakan lebar dari matriks of cell
      */
    Zoo(int _height, int _width);
    /*
      * @brief CopyConstructor
      * Melakukan inisialisasi berdasarkan zoo lain yang sudah dibuat
      * bukan bitwise copy
      * @param Z : Acuan zoo yang akan dicopy
      */
    Zoo(const Zoo& Z);
    /*
      * @brief Destructor
      */
    ~Zoo();
    /*
      * @brief Operator Assignment
      * Melakukan assignment dari satu zoo ke zoo lainnya
      * bukan bitwise copy
      * @param Z: acuan assignment
      */
    Zoo& operator=(const Zoo& Z);
    /*
      * @brief fungsi draw
      * berfungsi merepresentasikan perilaku seluruh cell
      * yang ada di dalam zoo ke layar
      */
    //void draw();
    /*
      * @brief fungsi getCell
      * berfungsi mengembalikan suatu cell pada posisi tertentu
      * @param i : sebagai height acuan
      * @param j : sebagai width acuan
      */
    Cell* getCell(int i, int j);
    /*
      * @brief fungsi setCell
      * berfungsi memasukkan suatu cell pada posisi tertentu
      * @param i : sebagai height acuan
      * @param j : sebagai width acuan
      * @param value : Cell yang akan dimasukkan
      */
    void setCell(int i, int j, char type);
    /*
      * @brief render
      * berfungsi menggambar kebun binatang pada layar
      */
    void render();
    void render(int _width, int _height);
    /*
      * @brief fungsi fooodNeeded
      * berfungsi mengembalikan total makanan yang dibutuhkan
      * oleh seluruh hewan yang ada di zoo
      */
    void buildCell(int pos_i, int pos_j, int h, int w, char type, Cage * cg);

    void buildCell(int pos_i, int pos_j, int h, int w, char type);
    /*
      * @brief tour
      * melakukan tour dengan jalur random dan interact hewan jika
      * hewan berada di disampingnya
      */
    void Tour();
};

#endif