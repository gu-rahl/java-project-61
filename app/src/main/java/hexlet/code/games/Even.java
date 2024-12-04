package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void play() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = generateRoundsData();
        Engine.runGame(roundsData, gameDescription);
    }

    private static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = random.nextInt(MAX_RANDOM_NUMBER) + 1;
            roundsData[i][0] = String.valueOf(number);
            roundsData[i][1] = (number % 2 == 0) ? "yes" : "no";
        }

        return roundsData;
    }
}
