import java.util.HashMap;
import java.util.Random;

public class Game {

    private int wins = 0;
    private int losses = 0;

    public void playGame(boolean switchDoor) {
        Random random = new Random();
        int winDoor = random.nextInt(3); // выигрышная дверь
        int playerChoice = random.nextInt(3); // Выбор участника

        int openDoorHost;
        do {
            openDoorHost = random.nextInt(3);
        } while (openDoorHost == winDoor || openDoorHost == playerChoice);

        // Если игрок решает поменять выбор
        if (switchDoor) {
            playerChoice = 3 - playerChoice - openDoorHost; // Меняем выбор
        }

        // Проверяем, выиграл ли игрок
        if (playerChoice == winDoor) {
            wins++;
        } else {
            losses++;
        }

    }

    public HashMap<String, Integer> getResults() {
        HashMap<String, Integer> results = new HashMap<>();
        results.put("Wins", wins);
        results.put("Losses", losses);
        return results;
    }
}
