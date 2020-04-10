/**
 * This class represents status of board and update its.
 * @author Rezvanian 9831029
 * @version 1.2
 */
public class Board implements IBoard  {

    //constant variable, size of map
    private static final int SIZE = 9;

    //for programmer
    private static char[] map = new char[81];

    /*
    Access in version 0.1
    private char[] map;
    */

    //for user
    private static char[][] visualMap = new char[4 * 9 + 1][8 * 9 + 1];

    /*
    Access in version 0.1
    private char[][] visualMap;
    */

    /**
     * This method, initialise the fields and map.
     */
    public static void initialisingBoard(){

        map = new char[81];
        for (int i = 0; i < SIZE * SIZE; i++){

            //initialise the map and set header of map
            switch (i){
                case 0:{
                    map[i] = '+';
                }
                case 1:{
                    map[i] = 'A';
                }
                case 2:{
                    map[i] = 'B';
                }
                case 3:{
                    map[i] = 'C';
                }
                case 4:{
                    map[i] = 'D';
                }
                case 5:{
                    map[i] = 'E';
                }
                case 6:{
                    map[i] = 'F';
                }
                case 7:{
                    map[i] = 'G';
                }
                case 8:{
                    map[i] = 'H';
                }
                case 9:{
                    map[i] = '1';
                }
                case 18:{
                    map[i] = '2';
                }
                case 27:{
                    map[i] = '3';
                }
                case 36:{
                    map[i] = '4';
                }
                case 45:{
                    map[i] = '5';
                }
                case 54:{
                    map[i] = '6';
                }
                case 63:{
                    map[i] = '7';
                }
                case 72:{
                    map[i] = '8';
                }
                default:{
                    if (map[i] != 'w' || map[i] != 'b')
                        map[i] = ' ';
                }
            }
        }

        visualMap = new char[4 * SIZE + 1][8 * SIZE + 1];
        //initialise the visualMap
        for (int xRow = 0; xRow <= 4 * SIZE; xRow++){
            for (int yColumn = 0; yColumn <= 8 * SIZE; yColumn++){
                if (xRow % 4 == 0){
                    visualMap[xRow][yColumn] = '*';
                }else if (yColumn % 8 == 0){
                    visualMap[xRow][yColumn] = '*';
                } else {
                    if (visualMap[xRow][yColumn] != 'w' || visualMap[xRow][yColumn] != 'b')
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

    /**
     * This method get map.
     * */
    public char[] getMap() {
        return map;
    }

    /**
     * this method get visual map
     * */
    public char[][] getVisualMap() {
        return visualMap;
    }

    /**
     * this method clear the screen and print the map.
     * */
    static public void printMap() {

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

    /*Access in version 0.0

   public void setMapByPosition(int position, char nut){
        map[position] = nut;
    }

    public void setVisualMapByPosition(int xPosition, int yPosition, char nut){
        xPosition = 8 * (xPosition - 1) + 4;
        yPosition = 4 * (yPosition - 1) + 2;
        visualMap[yPosition][xPosition] = nut;
    }
    */

    /**
     * this method get the character and search the where is position nut.
     * @param c is character that we want to search position of its.
     * */
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

    /**
     * this method refresh of map
     * */
    public static void refresh(){
        printMap();
    }


    /**
     * this method set value of "visualMap".
     * @param map is value of visualMap field.
     * */
    public void setVisualMap(char[][] map) {
        visualMap = map;
    }

    /**
     * this method set value of "map".
     * @param map2 is value of map field.
     * */
    public void setMap(char[] map2) {
        map = map2;
    }
}
