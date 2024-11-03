import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(1000);
        Game game1 = new Game(500);

        Map<Integer, Boolean> resultsGame = game.playGame(true);
        Map<Integer, Boolean> resultsGame1 = game1.playGame(false);

        game.showResults(resultsGame);
        game1.showResults(resultsGame1);
    }
}
