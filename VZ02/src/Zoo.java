import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

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
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                visited[i][j] = false;
            }
        }

        Random rand = new Random();
        int randomValue = rand.nextInt();
        int nowX, nowY;
        if ((randomValue % 2) == 0) {
            nowX = 1;
            nowY = 0;
            visited[nowX][nowY] = true;
        } else {
            nowX = 19;
            nowY = 4;
            visited[nowX][nowY] = true;
        }

        boolean finish = false;
        while (!finish) {
            int visibleX[] = new int[3];
            int visibleY[] = new int[3];
            int visible = 0;
            if (!zCell[nowX][nowY].isExit()) {
                if (nowX != 0) {
        /* cek kirinya */
                    int tempX = nowX - 1;
                    if (zCell[nowY][tempX].isAnimal()) {
                        Animal temp;
                        temp = zCell[nowY][tempX].getAnimal();
                        temp.interact();
                    } else if (zCell[nowY][tempX].isRoad() && !visited[nowY][tempX]) {
                        visibleX[visible] = tempX;
                        visibleY[visible] = nowY;
                        visible++;
                    }
                }
                if (nowX != 19) {
                    //cekkanan
                    int tempX = nowX + 1;
                    if (zCell[nowY][tempX].isAnimal()) {
                        Animal temp;
                        temp = zCell[nowY][tempX].getAnimal();
                        temp.interact();
                    } else if (zCell[nowY][tempX].isRoad() && !visited[nowY][tempX]) {
                        visibleX[visible] = tempX;
                        visibleY[visible] = nowY;
                        visible++;
                    }
                }
                if (nowY != 0) {
        /* cekatas */
                    int tempY = nowY - 1;
                    if (zCell[tempY][nowX].isAnimal()) {
                        Animal temp;
                        temp = zCell[tempY][nowX].getAnimal();
                        temp.interact();
                    } else if (zCell[tempY][nowX].isRoad() && !visited[tempY][nowX]) {
                        visibleX[visible] = nowX;
                        visibleY[visible] = tempY;
                        visible++;
                    }
                }
                if (nowY != 19) {
                    //cekbawah
                    int tempY = nowY + 1;
                    if (zCell[tempY][nowX].isAnimal()) {
                        Animal temp;
                        temp = zCell[tempY][nowX].getAnimal();
                        temp.interact();
                    } else if (zCell[tempY][nowX].isRoad() && !visited[tempY][nowX]) {
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
                    randomValue = rand.nextInt();
                    int future = (randomValue % visible);
                    if (future == 0) {
                        nowX = visibleX[future];
                        nowY = visibleY[future];
                        visited[nowY][nowX] = true;
                    } else if (future == 1) {
                        nowX = visibleX[future];
                        nowY = visibleY[future];
                        visited[nowY][nowX] = true;
                    } else if (future == 2) {
                        nowX = visibleX[future];
                        nowY = visibleY[future];
                        visited[nowY][nowX] = true;
                    }
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
                if (nowX != 19) {
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
                if (nowY != 19) {
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
                    if (zCell[i][j].isAnimal()) {
                        Animal temp;
                        temp = zCell[i][j].getAnimal();
                        temp.render();
                    } else {
                        if (visited[i][j]) {
                            System.out.print(".");
                        } else {
                            zCell[i][j].render();
                        }
                    }
                }
            }
        }
    }

}
