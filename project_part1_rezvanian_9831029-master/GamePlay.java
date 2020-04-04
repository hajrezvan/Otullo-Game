import java.io.IOException;

public class GamePlay {
    public static void main(String[] args) throws IOException, InterruptedException {
        Board mapGame = new Board();
        mapGame.printMap();

        Nuts nuts1B = new Nuts('b',4,'D');
        Nuts nuts2B = new Nuts('b',5,'E');

        Nuts nuts1W = new Nuts('w',4,'E');
        Nuts nuts2W = new Nuts('w',5,'D');

        mapGame.refresh();
    }
}