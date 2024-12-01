package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    private static final int greet = 1;
    private static final int evenGame = 2;
    private static final int calcGame = 3;
    private static final int gcdGame = 4;
    private static final int progressionGame = 5;
    private static final int primeGame = 6;
    private static final int exit = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(greet + " - Greet");
        System.out.println(evenGame + " - Even");
        System.out.println(calcGame + " - Calc");
        System.out.println(gcdGame + " - GCD");
        System.out.println(progressionGame + " - Progression Game");
        System.out.println(primeGame + " - Prime Game");
        System.out.println(exit + " - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case greet:
                Cli.greetUser(); // запуск "приветствия"
                break;
            case evenGame:
                Even.play(); // запуск игры "проверка на четность"
                break;
            case calcGame:
                Calc.run(); // запуск игры "калькулятор"
                break;
            case gcdGame:
                GCD.runGame(); // запуск игры "НОД"
                break;
            case progressionGame:
                ProgressionGame.startGame();  // Запуск игры "Арифметическая прогрессия"
                break;
            case primeGame:
                PrimeGame.run();  // Запуск игры "Простое ли число"
                break;
            case exit:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
