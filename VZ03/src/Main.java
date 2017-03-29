import animal.Animal;
import animal.species.Cat;
import animal.species.Peacock;
import cell.Cell;
import util.Driver;
import util.Global;

import java.util.Scanner;

/**
 * Created by dery on 3/28/17.
 */
public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(15,40,"test.txt");
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
            do {
                System.out.println("Menu Setup: ");
                System.out.println("1 : Display Map \n2 : Available Animal \n3 : Masukan nama hewan \n# : Setup selesai");
                System.out.print("Masukan pilihan : ");
                animalName = reader.nextLine();
                driver.clear();
                if(animalName.equals("1")){
                    driver.displayMap();
                } else if (animalName.equals("2")){
                    driver.printAvailableAnimal();
                } else if (animalName.equals("3")){
                    System.out.print("Masukan nama hewan : ");
                    animalName = reader.nextLine();
                    break;
                } else if (animalName.equals("#")) break;
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
            if(option.equals("1")) {
                driver.update();
                driver.displayMap();
            } else if (option.equals("2")){
                System.out.println("BABABA");
                driver.zooInfo();
            } else if (option.equals("3")) {
                driver.tourZoo();
            } else if (option.equals("4")) {
                System.out.println(driver.getNAnimal());
            } else if (option.equals("5")) {
                System.out.println(driver.getFoodConsum(Global.HERB) + driver.getFoodConsum(Global.CARN) + (driver.getFoodConsum((short) (Global.HERB + Global.CARN)) / 2));
            } else if(option.equals("6")) {
                System.out.println(driver.getNbCage());
                break;
            } else if(option.equals("0")) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
            System.out.print("Tekan enter : ");

            option = reader.nextLine();
        } while(!option.equals("0"));
    }
}
