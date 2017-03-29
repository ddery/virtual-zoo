import util.Driver;
import util.Global;

import java.util.Scanner;


/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
class Main {
    /**
     * Main class
     * @param args arguments
     */
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.clear();
        driver.logo();
        System.out.println("Untuk setup pertamakali, sebuah zoo perlu diinisiasi");
        System.out.println("jumlah hewan yang akan dimasukan kedalam kandang.");
        System.out.println("Terdapat " + driver.getNbCage() + " kandang dalam zoo ini");
        Scanner reader = new Scanner(System.in);
        int count,cageNumber;
        boolean domestic;
        String animalName;
        do {
            label:
            do {
                System.out.println("Menu Setup: ");
                System.out.println("1 : Display Map \n2 : Available Animal \n3 : Masukan nama hewan \n# : Setup selesai");
                System.out.print("Masukan pilihan : ");
                animalName = reader.nextLine();
                driver.clear();
                switch (animalName) {
                    case "1":
                        driver.displayMap();
                        break;
                    case "2":
                        driver.printAvailableAnimal();
                        break;
                    case "3":
                        System.out.print("Masukan nama hewan : ");
                        animalName = reader.nextLine();
                        break label;
                    case "#":
                        break label;
                }
            } while (!animalName.equals("3"));
            if(!animalName.equals("#")) {
                System.out.print("Masukan jumlah hewan : ");count = reader.nextInt();
                System.out.print("Masukan nomor kandang : ");cageNumber = reader.nextInt();
                System.out.print("Apakah hewan ini jinak? : ");domestic = reader.nextBoolean();
                driver.createAnimal(animalName, domestic, count, cageNumber);
            }
        } while (!animalName.equals("#"));
        String option;
        do {
            driver.clear();
            driver.logo();
            System.out.println("Selamat datang di Wow Zoo. Wow Zoo merupakan Virtual Zoo yang berisi " + driver.getNAnimal() + " hewan");
            System.out.println("Menu : ");
            System.out.println("1 : Display Map \n2 : Zoo Info \n3 : Tour \n4 : Banyak Animal \n5 : Jumlah Konsumsi Hewan \n6 : Jumlah Cage \n0 : exit");

            System.out.print("Masukan pilihan : ");
            option = reader.nextLine();
            switch (option) {
                case "1":
                    driver.update();
                    driver.displayMap();
                    break;
                case "2":
                    driver.zooInfo();
                    break;
                case "3":
                    driver.tourZoo();
                    break;
                case "4":
                    System.out.println(driver.getNAnimal());
                    break;
                case "5":
                    System.out.println(driver.getFoodConsum(Global.HERB) + driver.getFoodConsum(Global.CARN) + (driver.getFoodConsum((short) (Global.HERB + Global.CARN)) / 2));
                    break;
                case "6":
                    System.out.println(driver.getNbCage());
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
            System.out.print("Tekan enter : ");
            option = reader.nextLine();
        } while(!option.equals("0"));
    }
}
