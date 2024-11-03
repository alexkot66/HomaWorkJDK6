import javax.swing.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();
        Game game1 = new Game();
        int simulations = 1000;

        for (int i = 0; i < simulations; i++) {
            game.playGame(true); // Игрок всегда меняет выбор
        }

        for (int i = 0; i < simulations; i++) {
            game1.playGame(false); // Игрок всегда оставляет свой выбор
        }

        HashMap<String, Integer> results = game.getResults();
        System.out.println("Статистика после " + simulations + " игр:");
        System.out.println("Победы: " + results.get("Wins"));
        System.out.println("Поражения: " + results.get("Losses"));
        System.out.println("Следующая игра");
        HashMap<String, Integer> results1 = game1.getResults();
        System.out.println("Статистика после " + simulations + " игр:");
        System.out.println("Победы: " + results1.get("Wins"));
        System.out.println("Поражения: " + results1.get("Losses"));

    }
}
