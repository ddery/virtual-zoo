/**
 * Created by irfan on 29/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Driver mesin;
        mesin = new Driver();

        int opsi = 2;
        //do {
            mesin.logo();
            System.out.print("\n\n");
            System.out.print("Selamat datang di Wow Zoo. Wow Zoo merupakan Virtual Zoo yang berisi 24 spesies.\n");
            System.out.print("\n");
            System.out.print("Menu : \n");
            System.out.print("1 : Display Map \n2 : Zoo Info \n3 : Tour \n4 : Banyak Animal \n5 : Jumlah Konsumsi Hewan \n6 : Jumlah Cage \n0 : exit\n");
            //System.in.read(opsi);
            if (opsi == 1) {
                mesin.animalMove();
                mesin.displayMap();
            }else if(opsi == 2){
                mesin.zooInfo();
            }else if(opsi == 3){
                mesin.tourZoo();
            }else if (opsi == 4){
                System.out.print("Total hewan yang ditangani berjumlah %d\n" + mesin.getnAnimal());
            }else if (opsi == 5){
                System.out.print("Setiap hari kebun binatang ini membutuhkan :\n");
                System.out.print("Daging %.2f kg\n" + mesin.getFoodConsum('C') + (float)mesin.getFoodConsum('O')/2);
                System.out.print("Sayuran %.2f kg\n" + mesin.getFoodConsum('H') + (float)mesin.getFoodConsum('O')/2);
            }else if (opsi == 6){
                System.out.print("Jumlah cage dalam Virtual Zoo ini adalah : %d\n" + mesin.getNbCage());
            }else if (opsi == 0){
                //break;
            } else {
                System.out.print("opsi salah\n");
            }

            System.out.print("\n");

        //} while(opsi != 0);

    }
}
