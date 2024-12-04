package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;

    public static void runGame(String[][] roundsData, String gameDescription) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");

        System.out.println(gameDescription);

        for (int roundIndex = 0; roundIndex < ROUNDS_COUNT; roundIndex++) {
            String[] round = roundsData[roundIndex];
            String question = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", userAnswer, correctAnswer);
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
