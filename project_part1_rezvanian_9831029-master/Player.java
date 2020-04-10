/**
 * This class represents status and information of players.
 * @author Rezvanian 9831029
 * @version 1.2
 */
public class Player implements IPlayer {
    private int colorCode;              //Color code for white is 1 and for black is 0
    private boolean playerTurn;
    private int intPlayerTurn;

    public Player(int color){
        colorCode = color;
    }

    public int getColorCode() {
        return colorCode;
    }

    public int getIntPlayerTurn() {
        return intPlayerTurn;
    }

    public void setPlayerTurn(boolean playerTurn) {
        this.playerTurn = playerTurn;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }
}
