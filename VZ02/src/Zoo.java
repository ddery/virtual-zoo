import util.Global;

import java.util.Random;

/**
 * @author      Irfan Ariq <13515112@std.stei.itb.ac.id>
 * @version     1.0
 * @since       1.0
 */
@SuppressWarnings("ALL")
class Zoo {
    /**
     * zCell define the Cell inside the zoo
     */
    private final Cell[][] zCell;
    /**
     * height define the height of the zoo
     */
    private final int height;
    /**
     * width define the width of the zoo
     */
    private final int width;

    /**
     * Zoo constructor
     * <p>
     * Make a zoo, for cell and animal
     * @param height = height of the zoo
     * @param width = width of the zoo
     */
    public Zoo(int height, int width) {
        this.height = height;
        this.width = width;
        zCell = new Cell[height][width];
        for (int i = 0;i < width;i++) {
            //zCell[i] = new Cell[width];
            for (int j = 0; j < width; j++)
                zCell[i][j] = null;
        }
    }
    /**
     * Getter for the cell
     * <p>
     * return the cell with in exact postion
     * @param i = x position
     * @param j = y position
     */
    @SuppressWarnings("unused")
    public Cell getCell(int i, int j) {
        try {
            return zCell[i][j];
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error : Out of zoo range");
        }
        return null;
    }
    /**
     * Setter for the cell in zoo
     * <p>
     * set the cell in exact position
     * @param i = x position
     * @param j = y position
     * @param type = type of the cell
     */
    private void setCell(int i, int j, char type) {
        zCell[i][j] = new Cell(type);
    }
    /**
     * build some cell
     * <p>
     * sett some cell start in (x,y) until (x+height,y+width) in cage cg
     * @param xPosition = initial x position
     * @param yPosition = initial y position
     * @param h = height
     * @param w = width
     * @param type = type of the cell
     * @param cg = cage
     */
    public void buildCell(int xPosition, int yPosition, int h, int w, char type, Cage cg) {
        for(int i = xPosition; i < h+xPosition; i++) {
            for (int j = yPosition; j < w+yPosition; j++) {
                this.setCell(i,j,type);
                cg.setCell(zCell[i][j]);
            }
        }
    }
    /**
     * build some cell
     * <p>
     * sett some cell start in (x,y) until (x+height,y+width)
     * @param xPosition = initial x position
     * @param yPosition = initial y position
     * @param h = height
     * @param w = width
     * @param type = type of the cell
     */
    public void buildCell(int xPosition, int yPosition, int h, int w, char type) {
        for(int i = xPosition; i < h+xPosition; i++) {
            for (int j = yPosition; j < w+yPosition; j++) {
                this.setCell(i,j,type);
            }
        }
    }
    /**
     * display tha map into the monitor
     * <p>
     */
    public void render() {
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(zCell[i][j] != null) {
                    zCell[i][j].render();
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    @SuppressWarnings("unused")
    public void render(int height, int width) {
        for(int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(zCell[i][j] != null) {
                    zCell[i][j].render();
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
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
            nowX = 0;
            nowY = 1;
            visited[nowY][nowX] = true;
        } else {
            nowX = 19;
            nowY = 4;
            visited[nowY][nowX] = true;
        }

        boolean finish = false;
        while (!finish) {
            int visibleX[] = new int[3];
            int visibleY[] = new int[3];
            int visible = 0;
            if (!zCell[nowY][nowX].isExit()) {
                if (nowX != 0) {
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
