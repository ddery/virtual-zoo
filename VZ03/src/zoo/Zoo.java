package zoo;

import cell.Cell;
import cell.facility.road.Road;
import renderable.Renderable;
import util.Global;

import java.io.*;

/**
 * @author      Dery Rahman A <13515097@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Zoo implements Renderable {
    private Cell[][] zCell;
    private int height,width;

    // max animal in 1 cell is 5
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
                    if((t & Global.ROAD) > 0){
                        zCell[i][j] = new Road();
                    }
                }
                i++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
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
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) zCell[i][j].render();
            System.out.println();
        }
    }
}
