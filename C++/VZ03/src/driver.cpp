/*
 * author : Dery (13515097), Ariq (13515112)
 */

#include "../include/driver.h"

using namespace std;

  Driver::Driver() : Wow(20,20){
	  kdg = new Cage * [7];
    //set Jalan
    Wow.buildCell(1,0,1,1,'r');
    Wow.buildCell(1,1,1,7,'r');
    Wow.buildCell(1,7,19,1,'r');
    Wow.buildCell(4,7,1,13,'r');
    Wow.buildCell(4,19,1,1,'r');
    Wow.buildCell(4,12,7,1,'r');
    Wow.buildCell(19,7,1,1,'e');
    Wow.buildCell(7,2,1,5,'r');
    Wow.buildCell(5,2,15,1,'r');
    Wow.buildCell(5,0,1,3,'r');
    Wow.buildCell(9,0,1,3,'r');
    Wow.buildCell(10,2,1,5,'r');
    Wow.buildCell(11,7,1,13,'r');
    Wow.buildCell(12,16,8,1,'r');
    Wow.buildCell(19,16,1,1,'e');
    Wow.buildCell(15,11,1,7,'r');
    //set restoran
    Wow.buildCell(8,3,2,4,'R');
    Wow.buildCell(5,8,6,2,'R');
    //set park
    Wow.buildCell(6,0,3,2,'P');
    Wow.buildCell(5,10,6,2,'P');
    //set Kandang 0
    kdg[0] = new Cage(56,0);
    Wow.buildCell(0,0,1,8,'L',kdg[0]);
    Wow.buildCell(0,8,4,12,'L',kdg[0]);
    //set Kandang 1
    kdg[1] = new Cage(29,0);
    Wow.buildCell(2,0,3,3,'A',kdg[1]);
    Wow.buildCell(2,3,5,4,'A',kdg[1]);
    //set Kandang 2
    kdg[2] = new Cage(20,0);
    Wow.buildCell(10,0,10,2,'W',kdg[2]);
    //set Kandang 3
    kdg[3] = new Cage(36,0);
    Wow.buildCell(11,3,9,4,'L',kdg[3]);
    //set Kandang 4
    kdg[4] = new Cage(59,0);
    Wow.buildCell(12,8,3,5,'W',kdg[4]);
    Wow.buildCell(15,8,5,3,'W',kdg[4]);
    Wow.buildCell(16,11,4,3,'A',kdg[4]);
    Wow.buildCell(12,13,3,3,'L',kdg[4]);
    Wow.buildCell(16,14,4,2,'L',kdg[4]);
    //set Kandang 5
    kdg[5] = new Cage(42,0);
    Wow.buildCell(5,13,6,7,'W',kdg[5]);
    //set Kandang 6
    kdg[6] = new Cage(24,0);
    Wow.buildCell(12,17,8,3,'A',kdg[6]);

      kdg[0]->addAnimal(new Panda,5);
      kdg[0]->addAnimal(new Harimau(true,true),2);
      kdg[0]->addAnimal(new Bunglon,2);
      kdg[0]->addAnimal(new Gajah,2);
      kdg[0]->addAnimal(new Orangutan,1);
      kdg[0]->addAnimal(new Gorila(10,true),1);
      kdg[0]->addAnimal(new Komodo,2);
      kdg[0]->addAnimal(new Simpanze,2);
      kdg[1]->addAnimal(new BurungUnta,2);
      kdg[1]->addAnimal(new Cendrawasi,1);
      kdg[1]->addAnimal(new Merak,2);
      kdg[1]->addAnimal(new Elang,2);
      kdg[1]->addAnimal(new Flamingo,1);
      kdg[2]->addAnimal(new LumbaLumba,2);
      kdg[2]->addAnimal(new Pari,2);
      kdg[2]->addAnimal(new Salmon,2);
      kdg[3]->addAnimal(new Panda,3);
      kdg[3]->addAnimal(new Harimau,2);
      kdg[4]->addAnimal(new GoliathFrog,3);
      kdg[4]->addAnimal(new Salamander,3);
      kdg[4]->addAnimal(new Pinguin,3);
      kdg[4]->addAnimal(new Cendrawasi,2);
      kdg[4]->addAnimal(new Bunglon,2);
      kdg[4]->addAnimal(new Merak,2);
      kdg[5]->addAnimal(new PausHumpback,6);
      kdg[5]->addAnimal(new LumbaLumba,5);
      kdg[5]->addAnimal(new Pari,3);
      kdg[6]->addAnimal(new Cendrawasi,3);
      kdg[6]->addAnimal(new Merak,2);
      kdg[6]->addAnimal(new Flamingo,2);

  }

	Driver::~Driver(){
		for (int i = 0; i < 7; ++i) {
			delete kdg[i];
		}
		delete kdg;
	}

	void Driver::DisplayMap(){
		Wow.render();
	}

	void Driver::Logo(){
		printf(" _|          _|    _|_|    _|          _|      _|_|_|_|_|    _|_|      _|_|    \n");
		printf(" _|          _|  _|    _|  _|          _|            _|    _|    _|  _|    _|  \n");
		printf(" _|    _|    _|  _|    _|  _|    _|    _|          _|      _|    _|  _|    _|  \n");
		printf("   _|  _|  _|    _|    _|    _|  _|  _|          _|        _|    _|  _|    _|  \n");
		printf("     _|  _|        _|_|        _|  _|          _|_|_|_|_|    _|_|      _|_|    \n");
	}

	void Driver::ZooInfo(){
        for (int i = 0; i < Cage::getNbCage(); ++i) {
            if(kdg[i]->getnAnimal()>0) {
                cout << "CAGE " << i + 1 << endl;
                kdg[i]->ListAnimal();
            }
        }
		cout << "\n";
	}

	void Driver::TourZoo(){
    AnimalMove();
    Wow.Tour();
	}

	void Driver::AnimalMove(){
		for (int i = 0; i < Cage::getNbCage(); ++i) {
			kdg[i]->moveAnimal();
		}
	}

    int Driver::getNAnimal(){
        int total = 0;
        for (int i = 0; i < Cage::getNbCage(); ++i) {
            total+=kdg[i]->getnAnimal();
        }
        return total;
    }

    float Driver::getFoodConsum(char type){
        float total = 0;
        for (int i = 0; i < Cage::getNbCage(); ++i) {
            total+=kdg[i]->getFoodWeight(type);
        }
        return total;
    }

    int Driver::getNbCage(){
        return kdg[0]->getNbCage();
    };

