package hexlet.code.games;

import java.util.Scanner;

public class Even {

    private static final int ROUNDS_COUNT = 3;
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println("Answer '" + YES + "' if the number is even, otherwise answer '" + NO + "'.");

        int correctAnswers = 0;

        while (correctAnswers < ROUNDS_COUNT) {
            int number = (int) (Math.random() * MAX_RANDOM_NUMBER) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? YES : NO;

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(");
                System.out.println("Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
