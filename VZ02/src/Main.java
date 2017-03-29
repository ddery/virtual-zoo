import java.util.Scanner;

/**
 * @author      Irfan Ariq <13515112@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */

class Main {
    public static void main(String[] args) {
        Driver mesin;
        mesin = new Driver();
        Scanner scan = new Scanner(System.in);

        String opsi;
        do {
            mesin.logo();
            System.out.print("\n\n");
            System.out.print("Selamat datang di Wow Zoo. Wow Zoo merupakan Virtual Zoo yang berisi 24 spesies.\n");
            System.out.print("\n");
            System.out.print("Menu : \n");
            System.out.print("1 : Display Map \n2 : Zoo Info \n3 : Tour \n4 : Banyak Animal \n5 : Jumlah Konsumsi Hewan \n6 : Jumlah Cage \n0 : exit\n");
            opsi = scan.nextLine();
            switch (opsi) {
                case "1":
                    mesin.animalMove();
                    mesin.displayMap();
                    break;
                case "2":
                    mesin.zooInfo();
                    break;
                case "3":
                    mesin.tourZoo();
                    break;
                case "4":
                    System.out.print("Total hewan yang ditangani berjumlah \n" + mesin.getnAnimal());
                    break;
                case "5":
                    System.out.print("Setiap hari kebun binatang ini membutuhkan :\n");
                    System.out.print("Daging kg\n" + mesin.getFoodConsum('C') + mesin.getFoodConsum('O') / 2);
                    System.out.print("Sayuran kg\n" + mesin.getFoodConsum('H') + mesin.getFoodConsum('O') / 2);
                    break;
                case "6":
                    System.out.print("Jumlah cage dalam Virtual Zoo ini adalah : \n" + mesin.getNbCage());
                    break;
                case "0":
                    //break;
                    break;
                default:
                    System.out.print("opsi salah\n");
                    break;
            }

            System.out.print("Tekan Enter");
            opsi = scan.nextLine();
            System.out.print("\n");

        } while(!opsi.equals("0"));

    }
}
