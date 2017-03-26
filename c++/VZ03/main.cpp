/*
 * author : Dery (13515097), Ariq (13515112)
 */

#include <bits/stdc++.h>
#include "include/all.h"

int main() {

    Driver mesin;

    int opsi;
    do {
        system("clear");
        mesin.Logo();
        printf("\n\n");
        printf("Selamat datang di Wow Zoo. Wow Zoo merupakan Virtual Zoo yang berisi 24 spesies.\n");
        printf("\n");
        printf("Menu : \n");
        printf("1 : Display Map \n2 : Zoo Info \n3 : Tour \n4 : Banyak Animal \n5 : Jumlah Konsumsi Hewan \n6 : Jumlah Cage \n0 : exit\n");
        cin >> opsi;
        if (opsi == 1) {
            mesin.AnimalMove();
            mesin.DisplayMap();
        }else if(opsi == 2){
            mesin.ZooInfo();
        }else if(opsi == 3){
            mesin.TourZoo();
        }else if (opsi == 4){
            printf("Total hewan yang ditangani berjumlah %d\n", mesin.getNAnimal());
        }else if (opsi == 5){
            printf("Setiap hari kebun binatang ini membutuhkan :\n");
            printf("Daging %.2f kg\n", mesin.getFoodConsum('C') + (float)mesin.getFoodConsum('O')/2);
            printf("Sayuran %.2f kg\n", mesin.getFoodConsum('H') + (float)mesin.getFoodConsum('O')/2);
        }else if (opsi == 6){
            printf("Jumlah cage dalam Virtual Zoo ini adalah : %d\n", mesin.getNbCage());
        }else if (opsi == 0){
            break;
        } else {
            cout << "opsi salah\n";
        }

        cout << "Tekan enter";
        getchar();
        while(getchar() != '\n');
    } while(opsi != 0);
    return 0;
}
