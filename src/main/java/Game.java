import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Game {

    private int simulations;

    public Game(int simulations) {
        this.simulations = simulations;
    }

    public Map<Integer, Boolean> playGame(boolean switchDoor) {
        Random random = new Random();
        Map<Integer, Boolean> results = new HashMap<>();

        for (int i = 0; i < simulations; i++) {

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
            boolean res = (playerChoice == winDoor);
            results.put(i, res);
        }

        return results;
    }

    public void showResults(Map<Integer, Boolean> results) {
        int wins = 0;
        int losses = 0;

        for (boolean result : results.values()) {
            if (result) {
                wins++;
            } else {
                losses++;
            }
        }

        System.out.println("Статистика после " + simulations+ " игр:");
        System.out.println("Победы: " + wins);
        System.out.println("Поражения: " + losses);

    }
}
