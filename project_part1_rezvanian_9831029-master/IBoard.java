import java.io.IOException;
/**
 * This interface, has declaration of method in Board class
 * @version 1.2
 * @author Rezvanian 9831029
 * */
public interface IBoard {
    char[] getMap();
    char[][] getVisualMap();
    static void printMap() throws IOException, InterruptedException {

    }

    //    void setMapByPosition(int position, char nut);
    //    void setVisualMapByPosition(int xPosition, int yPosition, char nut);

    int searchPosition(char c);
    void setMap(char[] map);
    void setVisualMap(char[][] visualMap);
    static void refresh() throws IOException, InterruptedException {

    }
}
