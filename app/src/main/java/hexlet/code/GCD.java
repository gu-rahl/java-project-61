package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {

    public static int findGCD(int a, int b) {
        // Алгоритм Евклида для нахождения НОД
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void runGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int roundsCount = 3;

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        System.out.println("Find the greatest common divisor of given numbers.");

        for (int round = 0; round < roundsCount; round++) {
            // Генерация двух случайных чисел
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            // Проверка ответа
            try {
                int correctAnswer = findGCD(num1, num2);
                if (Integer.parseInt(userAnswer) == correctAnswer) {
                    System.out.println("Correct!");
                } else {
                    System.out.printf("'%s' is wrong answer ;(. Correct answer was '%d'.\n", userAnswer, correctAnswer);
                    System.out.println("Let's try again, " + playerName + "!");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
