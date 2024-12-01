package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {

    private static final int maxRandomNumber = 100;
    private static final int roundsCount = 3;

    public static void run() {
        final String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundsData = new String[roundsCount][2];

        for (int i = 0; i < roundsCount; i++) {
            int number = generateRandomNumber();
            String question = String.valueOf(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.runGame(roundsData, gameDescription);
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(maxRandomNumber) + 1;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
