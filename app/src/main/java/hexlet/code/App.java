package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression Game");
        System.out.println("6 - Prime Game");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Cli.greetUser(); // запуск "приветствия"
                break;
            case 2:
                Even.play(); // запуск игры "проверка на четность"
                break;
            case 3:
                Calc.run(); // запуск игры "калькулятор"
                break;
            case 4:
                GCD.runGame(); // запуск игры "НОД"
                break;
            case 5:
                ProgressionGame.startGame();  // Запуск игры "Арифметическая прогрессия"
                break;
            case 6:
                PrimeGame.run();  // Запуск игры "Простое ли число"
                break;
            case 0:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
