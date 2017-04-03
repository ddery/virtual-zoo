#include "../include/zoo.h"
#include <stdio.h>

/*
	* @brief Constructor
  * Menciptakan sebuah Matriks of pointer to animal untuk kemudian sebagai tempat pembuatan
  * dan penempatan cell
  * @param height : menyatakan banyaknya panjang dari matriks of pointer to animal
  * @param width : menyatakan lebar dari matriks of pointer to animal
  */
Zoo::Zoo(int _height, int _width){
    height = _height; width = _width;
    zcell = new Cell**[height];
    for (int i = 0;i < width;i++){
        zcell[i] = new Cell*[width];
        for(int j = 0; j < width; j++)
            zcell[i][j] = NULL;
    }
}
/*
  * @brief CopyConstructor
  * Melakukan inisialisasi berdasarkan zoo lain yang sudah dibuat
  * bukan bitwise copy
  * @param Z : Acuan zoo yang akan dicopy
  */
Zoo::Zoo(const Zoo& Z){
    height = Z.height; width = Z.width;
    zcell = new Cell**[height];
    for (int i = 0;i < width;i++){
        zcell[i] = new Cell*[width];
        for(int j = 0; j < width; j++)
            zcell[i][j] = Z.zcell[i][j];
    }
}
/*
  * @brief Destructor
  */
Zoo::~Zoo(){
    for (int i = 0;i < width;i++){
        for(int j = 0; j < width; j++)
            delete zcell[i][j];
        delete [] zcell[i];
    }
    delete [] zcell;
} 
/*
  * @brief Operator Assignment
  * Melakukan assignment dari satu zoo ke zoo lainnya
  * bukan bitwise copy
  * @param Z: acuan assignment
  */
Zoo& Zoo::operator=(const Zoo& Z){
    for (int i = 0;i < width;i++){
        delete [] zcell[i];
    }
    delete [] zcell;
    height = Z.height; width = Z.width;
    zcell = new Cell**[height];
    for (int i = 0;i < width;i++){
        zcell[i] = new Cell*[width];
        for(int j = 0; j < width; j++)
            zcell[i][j] = Z.zcell[i][j];
    }
    return *this;

}
/*
  * @brief fungsi draw
  * berfungsi merepresentasikan perilaku seluruh cell
  * yang ada di dalam zoo ke layar
  */
void Zoo::render(){
  for(int i = 0; i < height; i++){
    //printf("%2d", i);
    for(int j = 0; j < width; j++){
      if(zcell[i][j]==NULL){
        cout << "  ";
      }else{
        if(zcell[i][j]->isAnimal()) {  
          Animal * a;
          a = zcell[i][j]->getAnimal();
          a->render(); 
        }else{
          //printf("%2c ", zcell[i][j]->getType());
          zcell[i][j]->render();
        }
      }
    }
    cout << "\n";
  }
}

void Zoo::render(int _width, int _height) {
  for(int i = 0; i < _height; i++){
    /* printf("%2d ", i); */
    for(int j = 0; j < _width; j++){
      if(zcell[i][j]==NULL){
        cout << "   ";
      }else{
        if(zcell[i][j]->isAnimal()) {  
          Animal * a;
          a = zcell[i][j]->getAnimal();
          a->render(); 
        }else{
          printf("%2c ", zcell[i][j]->getType());
        }
      }
    }
    cout << "\n";
  }	
}
/*
  * @brief fungsi getCell
  * berfungsi mengembalikan suatu pointer to animal pada posisi tertentu
  * @param i : sebagai height acuan
  * @param j : sebagai width acuan
  */
Cell* Zoo::getCell(int i, int j){
  return zcell[i][j];
}
/*
  * @brief fungsi setCell
  * berfungsi memasukkan suatu cell pada posisi tertentu
  * @param i : sebagai height acuan
  * @param j : sebagai width acuan
  * @param type : menandakan tipe dari cell
  */
void Zoo::setCell(int i, int j, char type){
  if (type == 'L'){ zcell[i][j] = new Cell(type); } else
  if (type == 'W'){ zcell[i][j] = new Cell(type); } else
  if (type == 'A'){ zcell[i][j] = new Cell(type); } else
  if (type == 'R'){ zcell[i][j] = new Cell(type); } else
  if (type == 'r'){ zcell[i][j] = new Cell(type); } else
  if (type == 'P'){ zcell[i][j] = new Cell(type); } else
  if (type == 'E'){ zcell[i][j] = new Cell(type); } else
  if (type == 'e'){ zcell[i][j] = new Cell(type); } 
}
/*
  * @brief fungsi fooodNeeded
  * berfungsi mengembalikan total makanan yang dibutuhkan
  * oleh seluruh hewan yang ada di zoo
  */
void Zoo::foodNeeded(){
  int meat = 0;
  int vege = 0;
  for(int i = 0; i < height; i++){
      for(int j = 0; j < width; j++){
          if(zcell[i][j]->isAnimal()){
              if(zcell[i][j]->getAnimal()->getDietType()=='H'){
                  vege += zcell[i][j]->getAnimal()->foodConsumption();
              }else{
                  meat += zcell[i][j]->getAnimal()->foodConsumption();
                  /*ASUMSI HANYA ADA HERBIVORE DAN CARNIVORE*/
              }
          }
      }
  }
  cout << vege << endl;
  cout << meat << endl;
}


void Zoo::buildCell(int pos_i, int pos_j, int h, int w, char type, Cage * cg){
  int x=0;
  for(int i=pos_i; i<pos_i+h; i++){
    for(int j=pos_j; j<pos_j+w; j++){
      this->setCell(i,j,type);
      cg->setCell(x, zcell[i][j]);
      x++;
    }
  }
}

void Zoo::buildCell(int pos_i, int pos_j, int h, int w, char type){
 for(int i=pos_i; i<pos_i+h; i++){
    for(int j=pos_j; j<pos_j+w; j++){
      this->setCell(i,j,type);
    }
  }
}

void Zoo::ListAnimal() {
  for (int i = 0; i < height; ++i) {
    for (int j = 0; j < width; ++j) {
      if(zcell[i][j]->isAnimal()) {
        Animal * temp;
        temp = zcell[i][j]->getAnimal();
        temp->render();
        cout << i << " " << j << " " << temp->getWeight() << endl;
      }
    }
  }
}

void Zoo::Tour(){
  bool ** visited;
  visited = new bool * [height];
  for (int i = 0; i < height; ++i) {
    visited[i] = new bool[width];
    for (int j = 0; j < width; ++j) {
      visited[i][j] = false;
    }
  }

  srand(time(NULL));
  int nowx, nowy;
  if( ( rand() % 2 ) == 0) {
    nowy = 1;
    nowx = 0;
    visited[nowy][nowx] = true;
  }else{
    nowx = 19;
    nowy = 4;
    visited[nowy][nowx] = true;
  }

  bool selesai = false;
  while(!selesai) {
    //cout << "x : " << nowx << " y : " << nowy << endl;
    int visiblex[3],visibley[3],visible = 0;
    if(!zcell[nowy][nowx]->isExit()) {

      if (nowx != 0) {
        /* cek kirinya */
        int tempx = nowx - 1;
        if(zcell[nowy][tempx]->isAnimal()) {
          Animal * temp;
          temp = zcell[nowy][tempx]->getAnimal();
          temp->interact();
        }else if((zcell[nowy][tempx]->isRoad() || zcell[nowy][tempx]->isEntrance() || zcell[nowy][tempx]->isExit()) && !visited[nowy][tempx]) {
          visiblex[visible] = tempx;
          visibley[visible] = nowy;
          visible++;
        }
      }
      if(nowx != 19) {
        //cekkanan
        int tempx = nowx + 1; 
        if(zcell[nowy][tempx]->isAnimal()) {
          Animal * temp;
          temp = zcell[nowy][tempx]->getAnimal();
          temp->interact();
        }else if((zcell[nowy][tempx]->isRoad() || zcell[nowy][tempx]->isEntrance() || zcell[nowy][tempx]->isExit()) && !visited[nowy][tempx]) {
          visiblex[visible] = tempx;
          visibley[visible] = nowy;
          visible++;
        }
      }
      if (nowy != 0) {
        /* cekatas */
        int tempy = nowy - 1;
        if(zcell[tempy][nowx]->isAnimal()) {
          Animal * temp;
          temp = zcell[tempy][nowx]->getAnimal();
          temp->interact();
        }else if((zcell[tempy][nowx]->isRoad() || zcell[tempy][nowx]->isEntrance() || zcell[tempy][nowx]->isExit()) && !visited[tempy][nowx]) {
          visiblex[visible] = nowx;
          visibley[visible] = tempy;
          visible++;
        }        
      }
      if(nowy != 19) {
        //cekbawah
        int tempy = nowy + 1;
        if(zcell[tempy][nowx]->isAnimal()) {
          Animal * temp;
          temp = zcell[tempy][nowx]->getAnimal();
          temp->interact();
        }else if((zcell[tempy][nowx]->isRoad() || zcell[tempy][nowx]->isEntrance() || zcell[tempy][nowx]->isExit()) && !visited[tempy][nowx]) {
          visiblex[visible] = nowx;
          visibley[visible] = tempy;
          visible++;
        } 
      }

      if (visible == 0) {
        selesai = true;
      }else if (visible == 1) {
        nowx = visiblex[0];
        nowy = visibley[0];
        visited[nowy][nowx] = true;
      }else if(visible > 1){
        int future = (rand() % visible);
        if( future == 0){
          nowx = visiblex[future];
          nowy = visibley[future];
          visited[nowy][nowx] = true;
        }else if( future == 1){
          nowx = visiblex[future];
          nowy = visibley[future];
          visited[nowy][nowx] = true;
        }else if( future == 2){
          nowx = visiblex[future];
          nowy = visibley[future];
          visited[nowy][nowx] = true;
        }
      }
    }else{
      selesai = true;
      if (nowx != 0) {
        /* cek kirinya */
        int tempx = nowx - 1;
        if(zcell[nowy][tempx]->isAnimal()) {
          Animal * temp;
          temp = zcell[nowy][tempx]->getAnimal();
          temp->interact();
        }
      }
      if(nowx != 19) {
        //cekkanan
        int tempx = nowx + 1; 
        if(zcell[nowy][tempx]->isAnimal()) {
          Animal * temp;
          temp = zcell[nowy][tempx]->getAnimal();
          temp->interact();
        }
      }
      if (nowy != 0) {
        /* cekatas */
        int tempy = nowy - 1;
        if(zcell[tempy][nowx]->isAnimal()) {
          Animal * temp;
          temp = zcell[tempy][nowx]->getAnimal();
          temp->interact();
        }        
      }
      if(nowy != 19) {
        //cekbawah
        int tempy = nowy + 1;
        if(zcell[tempy][nowx]->isAnimal()) {
          Animal * temp;
          temp = zcell[tempy][nowx]->getAnimal();
          temp->interact();
        } 
      }

    }
  }

  for(int i = 0; i < height; i++){
    //printf("%2d", i);
    for(int j = 0; j < width; j++){
        if(zcell[i][j]==NULL){
          cout << "  ";
        }else{
          if(zcell[i][j]->isAnimal()) {  
            Animal * a;
            a = zcell[i][j]->getAnimal();
            a->render(); 
          }else{
            //printf("%2c ", zcell[i][j]->getType());
            if (visited[i][j]) {
                        Color::Modifier gray(Color::BG_LIGHT_GRAY);
                        Color::Modifier white(Color::FG_WHITE);
                        Color::Modifier clear(Color::BG_DEFAULT);
                        Color::Modifier cleartext(Color::FG_DEFAULT);
                        cout << white << gray << ".." << clear << cleartext;
            }else{
              zcell[i][j]->render();
            }
          }
        }
    }
    cout << "\n";
  }

  delete [] visited;

}