package zoo;

import animal.Animal;
import cell.Cell;
import cell.facility.park.Park;
import cell.facility.restaurant.Restaurant;
import cell.facility.road.Road;
import cell.facility.road.entrance.Entrance;
import cell.facility.road.exit.Exit;
import cell.habitat.airhabitat.AirHabitat;
import cell.habitat.landhabitat.LandHabitat;
import cell.habitat.waterhabitat.WaterHabitat;
import renderable.Renderable;
import util.Global;

import java.io.*;
import java.util.Random;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Zoo implements Renderable {
    private final Cell[][] zCell;
    private final int height;
    private final int width;

    // max animal in 1 cell is 5
    @SuppressWarnings("SameParameterValue")
    public Zoo(int height, int width, String filename){
        this.height = height;
        this.width = width;
        zCell = new Cell[height][width];
        for(int i = 0; i < height; i++){
            zCell[i] = new Cell[width];
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader("VZ03/map/" + filename));
            String line;
            int i = 0;
            while((line = in.readLine()) != null)
            {
                for(int j = 0; j < width; j++){
                    short t = convertCharToType(line.charAt(j));

                    if((t & Global.WATER) > 0){
                        zCell[i][j] = new WaterHabitat();
                    }
                    if((t & Global.LAND) > 0){
                        zCell[i][j] = new LandHabitat();
                    }
                    if((t & Global.AIR) > 0){
                        zCell[i][j] = new AirHabitat();
                    }
                    if((t & Global.RESTAURANT) > 0){
                        zCell[i][j] = new Restaurant();
                    }
                    if((t & Global.PARK) > 0){
                        zCell[i][j] = new Park();
                    }
                    if((t & Global.ROAD) > 0){
                        zCell[i][j] = new Road();
                    }
                    if((t & Global.EXIT) > 0){
                        zCell[i][j] = new Exit();
                    }
                    if((t & Global.ENTRANCE) > 0){
                        zCell[i][j] = new Entrance();
                    }
                }
                i++;
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private short convertCharToType(char c){
        switch (c){
            case 'W' : return Global.WATER;
            case 'L' : return Global.LAND;
            case 'A' : return Global.AIR;
            case 'P' : return Global.PARK;
            case 'T' : return Global.RESTAURANT;
            case '#' : return Global.ROAD;
            case 'X' : return Global.EXIT;
            case 'E' : return Global.ENTRANCE;
            default  : return 0;
        }
    }

    public Cell getCell(int i, int j){
        try {
            return zCell[i][j];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Out of zoo range");
        }
        return null;
    }

    @Override
    public void render() {
        System.out.println();
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) {
                if (zCell[i][j].isAnimal()) {
                    Animal temp;
                    temp = zCell[i][j].getAnimal();
                    temp.render();
                }else {
                    zCell[i][j].render();
                }
            }
            System.out.println();
        }
    }

    public void tour() {
        boolean[][] visited;
        visited = new boolean[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                visited[i][j] = false;
            }
        }

        int nowX, nowY;
        int pintuX[] = new int[height+width];
        int pintuY[] = new int[height+width];
        int nPintu = 0;
        for (int i = 0 ; i < height ; i++) {
            for (int j = 0 ; j < width ; j++) {
                if (zCell[i][j].cekTypeCell(Global.ENTRANCE)) {
                    pintuX[nPintu] = j;
                    pintuY[nPintu] = i;
                    nPintu++;
                }
            }
        }

        Random rand = new Random();
        int randomValue = rand.nextInt(nPintu);
        int tempInt = randomValue % nPintu;
        nowX = pintuX[tempInt];
        nowY = pintuY[tempInt];
        visited[nowY][nowX] = true;


        boolean finish = false;
        while (!finish) {
            int visibleX[] = new int[3];
            int visibleY[] = new int[3];
            int visible = 0;
            if (!zCell[nowY][nowX].cekTypeCell(Global.EXIT)) {
                if (nowX != 0) {
                    int tempX = nowX - 1;
                    if (zCell[nowY][tempX].isAnimal()) {
                        Animal temp;
                        temp = zCell[nowY][tempX].getAnimal();
                        temp.interact();
                    } else if (zCell[nowY][tempX].cekTypeCell((short) (Global.ROAD + Global.EXIT + Global.ENTRANCE)) && !visited[nowY][tempX]) {
                        visibleX[visible] = tempX;
                        visibleY[visible] = nowY;
                        visible++;
                    }
                }
                if (nowX != width - 1) {
                    int tempX = nowX + 1;
                    if (zCell[nowY][tempX].isAnimal()) {
                        Animal temp;
                        temp = zCell[nowY][tempX].getAnimal();
                        temp.interact();
                    } else if (zCell[nowY][tempX].cekTypeCell((short) (Global.ENTRANCE + Global.EXIT + Global.ENTRANCE)) && !visited[nowY][tempX]) {
                        visibleX[visible] = tempX;
                        visibleY[visible] = nowY;
                        visible++;
                    }
                }
                if (nowY != 0) {
                    int tempY = nowY - 1;
                    if (zCell[tempY][nowX].isAnimal()) {
                        Animal temp;
                        temp = zCell[tempY][nowX].getAnimal();
                        temp.interact();
                    } else if (zCell[tempY][nowX].cekTypeCell((short) (Global.ENTRANCE + Global.EXIT + Global.ROAD)) && !visited[tempY][nowX]) {
                        visibleX[visible] = nowX;
                        visibleY[visible] = tempY;
                        visible++;
                    }
                }
                if (nowY != height - 1) {
                    //cekbawah
                    int tempY = nowY + 1;
                    if (zCell[tempY][nowX].isAnimal()) {
                        Animal temp;
                        temp = zCell[tempY][nowX].getAnimal();
                        temp.interact();
                    } else if (zCell[tempY][nowX].cekTypeCell((short) (Global.ENTRANCE + Global.EXIT + Global.ROAD)) && !visited[tempY][nowX]) {
                        visibleX[visible] = nowX;
                        visibleY[visible] = tempY;
                        visible++;
                    }
                }

                if (visible == 0) {
                    finish = true;
                } else if (visible == 1) {
                    nowX = visibleX[0];
                    nowY = visibleY[0];
                    visited[nowY][nowX] = true;
                } else if (visible > 1) {
                    randomValue = rand.nextInt(visible);
                    int future = (randomValue % visible);
                    nowX = visibleX[future];
                    nowY = visibleY[future];
                    visited[nowY][nowX] = true;
                }
            } else {
                finish = true;
                if (nowX != 0) {
                /* cek kirinya */
                    int tempX = nowX - 1;
                    if (zCell[nowY][tempX].isAnimal()) {
                        Animal temp;
                        temp = zCell[nowY][tempX].getAnimal();
                        temp.interact();
                    }
                }
                if (nowX != width - 1) {
                    //cekkanan
                    int tempX = nowX + 1;
                    if (zCell[nowY][tempX].isAnimal()) {
                        Animal temp;
                        temp = zCell[nowY][tempX].getAnimal();
                        temp.interact();
                    }
                }
                if (nowY != 0) {
                /* cekatas */
                    int tempY = nowY - 1;
                    if (zCell[tempY][nowX].isAnimal()) {
                        Animal temp;
                        temp = zCell[tempY][nowX].getAnimal();
                        temp.interact();
                    }
                }
                if (nowY != height - 1) {
                    //cekbawah
                    int tempY = nowY + 1;
                    if (zCell[tempY][nowX].isAnimal()) {
                        Animal temp;
                        temp = zCell[tempY][nowX].getAnimal();
                        temp.interact();
                    }
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (zCell[i][j] == null) {
                    System.out.print(" ");
                } else {
                    if (visited[i][j]) {
                        System.out.print( Global.ANSI_CYAN_BACKGROUND + Global.ANSI_BLACK + ".." + Global.ANSI_RESET);
                    } else {
                        zCell[i][j].render();
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
