package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int GREET = 1;
    private static final int EVEN_GAME = 2;
    private static final int CALC_GAME = 3;
    private static final int GCD_GAME = 4;
    private static final int PROGRESSION_GAME = 5;
    private static final int PRIME_GAME = 6;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET + " - Greet");
        System.out.println(EVEN_GAME + " - Even");
        System.out.println(CALC_GAME + " - Calc");
        System.out.println(GCD_GAME + " - GCD");
        System.out.println(PROGRESSION_GAME + " - Progression Game");
        System.out.println(PRIME_GAME + " - Prime Game");
        System.out.println(EXIT + " - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case GREET:
                Cli.greetUser(); // запуск "приветствия"
                break;
            case EVEN_GAME:
                Even.play(); // запуск игры "проверка на четность"
                break;
            case CALC_GAME:
                Calc.run(); // запуск игры "калькулятор"
                break;
            case GCD_GAME:
                GCD.runGame(); // запуск игры "НОД"
                break;
            case PROGRESSION_GAME:
                ProgressionGame.startGame();  // Запуск игры "Арифметическая прогрессия"
                break;
            case PRIME_GAME:
                PrimeGame.run();  // Запуск игры "Простое ли число"
                break;
            case EXIT:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
