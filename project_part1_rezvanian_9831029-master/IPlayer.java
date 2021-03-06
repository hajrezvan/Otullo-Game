/**
 * This interface for Player class and represent status and information of players.
 * @author Rezvanian 9831029
 * @version 0.0
 */
public interface IPlayer {
    int getColorCode();
    int getIntPlayerTurn();
    void setPlayerTurn(boolean playerTurn);
    void setColorCode(int colorCode);
}
