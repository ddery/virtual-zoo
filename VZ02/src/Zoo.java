import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author      Irfan Ariq <13515112@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
public class Zoo {
    private Cell[][] zCell;
    private int height,width;

    // max animal in 1 cell is 5
    public Zoo(int height, int width){
        this.height = height;
        this.width = width;
        for (int i = 0;i < width;i++) {
            zCell[i] = new Cell[width];
            for (int j = 0; j < width; j++)
                zCell[i][j] = null;
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

    public void setCell(int i, int j, char type) {
        zCell[i][j] = new Cell(type);
    }

    public void buildCell(int xPosition, int yPosition, int h, int w, char type, Cage cg) {
        for(int i = xPosition; i < h; i++) {
            for (int j = yPosition; j < w; j++) {
                this.setCell(i,j,type);
                cg.setCell(zCell[i][j]);
            }
        }
    }

    public void buildCell(int xPosition, int yPosition, int h, int w, char type) {
        for(int i = xPosition; i < h; i++) {
            for (int j = yPosition; j < w; j++) {
                this.setCell(i,j,type);
            }
        }
    }

    public void render() {
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) zCell[i][j].render();
            //System.out.println();
        }
    }

    public void render(int height, int width) {
        for(int i = 0; i < height; i++){
            for (int j = 0; j < width; j++) zCell[i][j].render();
            //System.out.println();
        }
    }

    public void tour() {
        boolean[][] visited;
        visited = new boolean[height][width];
        for (int i = 0; i < height;i++) {
            for (int j = 0; j < width; j++) {
                visited[i][j] = false;
            }
        }


    }
}
