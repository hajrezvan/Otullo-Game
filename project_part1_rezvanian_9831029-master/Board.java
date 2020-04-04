import java.io.IOException;

/**
 * This class represents status of board and update its.
 * @author Rezvanian 9831029
 * @version 0.0
 */

public class Board implements IBoard  {
    private final int SIZE = 9;
    //for programmer
    private char[] map;
    //for user
    private char[][] visualMap;

    /**
     * This constructor, initialise the fields.
     */
    public Board(){

        map = new char[81];
        for (int i = 0; i < SIZE * SIZE; i++){
            switch (i){
                case 0:{
                    this.map[i] = '+';
                }
                case 1:{
                    this.map[i] = 'A';
                }
                case 2:{
                    this.map[i] = 'B';
                }
                case 3:{
                    this.map[i] = 'C';
                }
                case 4:{
                    this.map[i] = 'D';
                }
                case 5:{
                    this.map[i] = 'E';
                }
                case 6:{
                    this.map[i] = 'F';
                }
                case 7:{
                    this.map[i] = 'G';
                }
                case 8:{
                    this.map[i] = 'H';
                }
                case 9:{
                    this.map[i] = '1';
                }
                case 18:{
                    this.map[i] = '2';
                }
                case 27:{
                    this.map[i] = '3';
                }
                case 36:{
                    this.map[i] = '4';
                }
                case 45:{
                    this.map[i] = '5';
                }
                case 54:{
                    this.map[i] = '6';
                }
                case 63:{
                    this.map[i] = '7';
                }
                case 72:{
                    this.map[i] = '8';
                }
                default:{
                    if (this.map[i] != 'w' || this.map[i] != 'b')
                        this.map[i] = ' ';
                }
            }
        }

        visualMap = new char[4 * SIZE + 1][8 * SIZE + 1];
        for (int xRow = 0; xRow <= 4 * SIZE; xRow++){
            for (int yColumn = 0; yColumn <= 8 * SIZE; yColumn++){
                if (xRow % 4 == 0){
                    visualMap[xRow][yColumn] = '*';
                }else if (yColumn % 8 == 0){
                    visualMap[xRow][yColumn] = '*';
                } else {
                    if (this.visualMap[xRow][yColumn] != 'w' || this.visualMap[xRow][yColumn] != 'b')
                        visualMap[xRow][yColumn] = ' ';
                }
            }
            for (int i = 0; i <= 36; i++){
                visualMap[i][72] = '*';
            }
            for (int j = 0; j <= 72; j++){
                visualMap[36][j] = '*';
            }
        }
        visualMap[2][4] = '+';
        visualMap[2][12] = 'A';
        visualMap[2][20] = 'B';
        visualMap[2][28] = 'C';
        visualMap[2][36] = 'D';
        visualMap[2][44] = 'E';
        visualMap[2][52] = 'F';
        visualMap[2][60] = 'G';
        visualMap[2][68] = 'H';
        visualMap[6][4] = '1';
        visualMap[10][4] = '2';
        visualMap[14][4] = '3';
        visualMap[18][4] = '4';
        visualMap[22][4] = '5';
        visualMap[26][4] = '6';
        visualMap[30][4] = '7';
        visualMap[34][4] = '8';
    }

    public char[] getMap() {
        return map;
    }

    public char[][] getVisualMap() {
        return visualMap;
    }

    public void printMap() throws IOException, InterruptedException{

        //clear terminal for refresh.
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < 4 * 9; i++){
            for (int j = 0; j < 8 * 9; j++){
                System.out.printf("%c",visualMap[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void setMapByPosition(int position, char nut){
        map[position] = nut;
    }

    public void setVisualMapByPosition(int xPosition, int yPosition, char nut){
        xPosition = 8 * (xPosition - 1) + 4;
        yPosition = 4 * (yPosition - 1) + 2;
        this.visualMap[yPosition][xPosition] = nut;
    }

    public int searchPosition(char c){
        switch (c){
            case 'A':{
                return 1;
            }
            case 'B':{
                return 2;
            }
            case 'C':{
                return 3;
            }
            case 'D':{
                return 4;
            }
            case 'E':{
                return 5;
            }
            case 'F':{
                return 6;
            }
            case 'G':{
                return 7;
            }
            case 'H':{
                return 8;
            }
            default:{
                return 0;
            }
        }
    }

    public void refresh() throws IOException, InterruptedException {
        printMap();
    }

}