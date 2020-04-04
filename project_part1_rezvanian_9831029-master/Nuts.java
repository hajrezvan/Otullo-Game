/**
 * This class represent status of nuts, and add them to map.
 * @author Rezvanian 9831029
 * @version 0.0
 */
public class Nuts extends Board implements INuts {
    private char color;
    private int MergePosition;
    private int x;
    private int y;

    /**
     * This constructor, build a object from nuts by follow parameter
     * @param characterPart is X position of nuts that user enter its.
     * @param integerPart  is Y Position of nuts that user enter its.
     * @param userColor is color of user's nuts.
     */
    public Nuts(char userColor, int integerPart, char characterPart){
        color = userColor;
        if (searchPosition(characterPart) != 0){
            MergePosition = (integerPart - 1) * 8 + searchPosition(characterPart);
            x = searchPosition(characterPart);
            y = integerPart;
        }
        setNutsInBoard();
    }

    /**
     * This method set nuts in board by use "setMapByPosition" & "setVisualMapByPosition"
     * method in "Board" class.
     */
    public void setNutsInBoard(){
        setMapByPosition(MergePosition,color);
        setVisualMapByPosition(x,y,color);
    }

    public char getColor() {
        return color;
    }

    public int getMergePosition() {
        return MergePosition;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}