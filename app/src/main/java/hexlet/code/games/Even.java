package hexlet.code.games;

import java.util.Scanner;

public class Even {

    private static final int roundsCount = 3;
    private static final int maxRandomNumber = 100;
    private static final String yes = "yes";
    private static final String no = "no";

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println("Answer '" + yes + "' if the number is even, otherwise answer '" + no + "'.");

        int correctAnswers = 0;

        while (correctAnswers < roundsCount) {
            int number = (int) (Math.random() * maxRandomNumber) + 1;
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            boolean isEven = number % 2 == 0;
            String correctAnswer = isEven ? yes : no;

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + playerName + "!");
    }
}
