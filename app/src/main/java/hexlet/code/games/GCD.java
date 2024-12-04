package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {

    private static final int MAX_RANDOM_VALUE = 100;
    private static final int MIN_RANDOM_VALUE = 1;
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void runGCD() {
        String[][] roundsData = generateRoundsData();
        Engine.runGame(roundsData, GAME_DESCRIPTION);
    }

    private static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int num1 = random.nextInt(MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1) + MIN_RANDOM_VALUE;
            int num2 = random.nextInt(MAX_RANDOM_VALUE - MIN_RANDOM_VALUE + 1) + MIN_RANDOM_VALUE;

            String question = num1 + " " + num2;
            String correctAnswer = String.valueOf(findGcd(num1, num2));

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        return roundsData;
    }

    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
