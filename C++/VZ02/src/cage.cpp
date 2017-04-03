/*
 * author : Faiz (13515010)
 */

#include "../include/cage.h"

int Cage::NbCage = 0;

/*
  * @brief Constructor
  * Menciptakan sebuah cage dengan parameter yang sudah dimasukkan
  * Setiap pembuatan Cage, NbCage ditambah, cageNumber = NbCage sebelum ditambah
  * @param jumlahCell : jumlah cell yang ada di dalam cage, = countcell
  * @param jumlahAnimal : jumlah animal yang ada di dalam cage
  */

Cage::Cage(int jumlahCell, int jumlahAnimal){
    size = jumlahCell;
    nAnimal = jumlahAnimal;
    cellInside = new Cell*[size];
    //cageNumber = NbCage;
    for(int i = 0;i < size;i++){
        cellInside[i] = NULL;
    }
    NbCage++;
}
/*
  * @brief CopyConstructor
  * Melakukan inisialisasi berdasarkan cage lain yang sudah dibuat
  * bukan bitwise copy
  * @param Ca : Acuan cage yang akan dicopy
  */
Cage::Cage(const Cage& Ca){
    size = Ca.size;
    nAnimal = Ca.nAnimal;
    cellInside = new Cell*[size];
    for(int i = 0;i < size;i++){
        cellInside[i] = Ca.cellInside[i];
    }
    //cageNumber = NbCage;
    NbCage++;
}
/*
  * @brief Destructor
  */
Cage::~Cage(){
    NbCage--;
    delete [] cellInside;
}
/*
  * @brief fungsi getCageNumber
  berfungsi mengembalikan nomor cage tersebut
  */
int Cage::getCageNumber(){
    return cageNumber;
}
/*
  * @brief fungsi getCell
  * berfungsi mengembalikan suatu cell yang berada di dalam cage
  */
Cell* Cage::getCell(int i){
    return cellInside[i];
}
/*
  * @brief fungsi isFull
  * berfungsi mengecek apakah cage tersebut sudah penuh atau belum
  * Jumlah hewan maksimal didalam cage adalah
  * 30% x Jumlah Cell didalam cage
  */
bool Cage::isFull(){
    return ((float)nAnimal >= 0.3*size);
}
/*
  * @brief fungsi isIsiBuas
  * berfungsi mengecek apakah animal di dalam cage tersebut
  * buas atau jinak. True = buas, false = jinak
  */
bool Cage::isIsiBuas(){
    int i = 0;
    while ((i < size) && !(cellInside[i]->isAnimal())){
        i++;
    }
    Animal* A = cellInside[i]->getAnimal();
    return (A->isTamed());
}
/*
  * @brief fungsi moveAnimal
  * berfungsi menggenerate secara random seluruh pergerakan binatang
  * agar tetap berada di dalam cage
  */
void Cage::moveAnimal(){
    Animal** temp;
    temp= new Animal*[nAnimal];
    int count= 0;
    //memindahkan seluruh kepemilikan animal ke array temporary
    for (int i=0; i<size; i++) {
      if (cellInside[i]->isAnimal()) {
        if (count<nAnimal) {
          temp[count++]= cellInside[i]->getAnimal();
          cellInside[i]->setAnimal(NULL);
        }
      }
    }
    //untuk setiap animal, akan diberikan cell baru
    srand(time(NULL));
    for (int i=0; i<count; i++) {
        int sizeHabit=0,startHabitIdx=0;
        for(int j=0;j<size;j++) {
            if(sizeHabit==0)startHabitIdx=j;
            if ((cellInside[j]->getType() == temp[i]->getBioType()) || (temp[i]->getBioType()=='z' && (cellInside[j]->isWH() || cellInside[j]->isLH()))) sizeHabit++;
        }
      int index= startHabitIdx+rand()%sizeHabit;
      while (cellInside[index]->isAnimal() || ((cellInside[index]->getType() != temp[i]->getBioType()) && (temp[i]->getBioType()=='z' && !(cellInside[index]->isWH() || cellInside[index]->isLH())))) {
        if (index>=startHabitIdx+sizeHabit-1) {
          index= 0;
        } else {
          index++;
        }
      }
      cellInside[index]->setAnimal(temp[i]);
      temp[i]=NULL;
    }
    delete [] temp;
}
/*
  * @brief fungsi getNbCage
  * mengembalikan jumlah cage yang sudah terbentuk di zoo
  */
int Cage::getNbCage(){
    return NbCage;
}

void Cage::render(){
  for(int i = 0; i < size; i++){
    cellInside[i]->render();
  }
}

void Cage::setCell(int idx, Cell * c){
    idx = 0;
    while(this->cellInside[idx]!=NULL){idx++;};
    this->cellInside[idx] = c;
}

void Cage::addAnimal(Animal * a, int count){
    int idx = 0;
    if((nAnimal+count)<0.3*(this->size)) {
        if(a->isTamed() || (!a->isTamed() && nAnimal==0)) {
            while (cellInside[idx]->isAnimal()) idx++;
            while (count--) {
                if(a->getBioType()=='z'){
                    while ((cellInside[idx]->isAH()) && idx<size-1) idx++;
                } else {
                    if (cellInside[idx]->getType() != a->getBioType()) {
                        while ((cellInside[idx]->getType() != a->getBioType()) && (idx < size - 1)) idx++;
                    }
                }
                if(idx<size-1) {
                    this->cellInside[idx++]->setAnimal(a);
                    nAnimal++;
                }
            }
        }
    }
}

int Cage::getnAnimal(){
  return nAnimal;
}

int Cage::getSize(){
    return size;
}

float Cage::getAnimalWeight(char c){
    float total = 0;
    for(int i=0;i<size;i++){
        if(cellInside[i]->isAnimal() && cellInside[i]->getAnimal()->getDietType()==c) total+=cellInside[i]->getAnimal()->getWeight();
    }
    return total;
}

float Cage::getFoodWeight(char c){
    float total = 0;
    for(int i=0;i<size;i++){
        if(cellInside[i]->isAnimal() && cellInside[i]->getAnimal()->getDietType()==c) total+=cellInside[i]->getAnimal()->foodConsumption();
    }
    return total;
}


void Cage::ListAnimal() {
    for(int i=0;i<size;i++){
        if(cellInside[i]->isAnimal()) {
            cellInside[i]->getAnimal()->render();
            cout << cellInside[i]->getAnimal()->getName() << " | ";
            cout << "Berat : " <<cellInside[i]->getAnimal()->getWeight() << " | ";
            cout << "Tipe  : ";
            if(cellInside[i]->getAnimal()->getDietType()=='H') cout << "Herbivora";
            else if(cellInside[i]->getAnimal()->getDietType()=='C') cout << "Karnivora";
            else if(cellInside[i]->getAnimal()->getDietType()=='O') cout << "Omnivora";
            cout << endl;
        }
    }
}
