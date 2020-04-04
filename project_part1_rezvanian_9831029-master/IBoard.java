import java.io.IOException;

public interface IBoard {
    char[] getMap();
    char[][] getVisualMap();
    void printMap() throws IOException, InterruptedException;
    void setMapByPosition(int position, char nut);
    void setVisualMapByPosition(int xPosition, int yPosition, char nut);
    int searchPosition(char c);
}
