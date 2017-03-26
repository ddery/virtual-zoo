/*
 * author : Faiz (13515010)
 */

#ifndef RENDERABLE_H
#define RENDERABLE_H

#include <bits/stdc++.h>
#include "colormod.h"
#include <string.h>

using namespace std;
/** @class Renderable
  * Kelas Renderable yang merupakan Abstract Base Class
  * Menurunkan fungsi render ke semua turunannya
  */
class Renderable {
public:
    /*
      * @brief fungsi render sebagai pure virtual
      berfungsi merepresentasikan perilaku  setiap objek
      untuk kemudian ditampilkan di layar
      */
    virtual void render() = 0;
};

#endif
