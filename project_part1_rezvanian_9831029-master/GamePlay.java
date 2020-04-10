import java.io.IOException;
/**
 * This class, is main class in program.
 * The program started from hear.
 * @version 1.2
 * @author Rezvanian 9831029
 * */
public class GamePlay {
    public static void main(String[] args) throws IOException, InterruptedException {
        Board.initialisingBoard();

        Nuts nuts1B = new Nuts('b',4,'D');
        Nuts nuts2B = new Nuts('b',5,'E');

        Nuts nuts1W = new Nuts('w',4,'E');
        Nuts nuts2W = new Nuts('w',5,'D');

        Player player1 = new Player(1);
        Player player2 = new Player(0);

        Board.refresh();
        Thread.sleep(1000);

        //check end of the game
        do {
            System.out.println("Welcome players!!");
            Thread.sleep(1000);
            System.out.println("Player");

        }while (GameController.checkEndOfGame());
    }
}
