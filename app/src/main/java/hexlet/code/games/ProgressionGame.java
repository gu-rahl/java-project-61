package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {

    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final int MAX_START_VALUE = 10;
    private static final int HIDDEN_ELEMENT_PLACEHOLDER = -1;

    public static String[][] generateRoundsData() {
        Random random = new Random();
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int progressionLength = random.nextInt(MAX_PROGRESSION_LENGTH - MIN_PROGRESSION_LENGTH + 1) + MIN_PROGRESSION_LENGTH;
            int step = random.nextInt(MAX_STEP - MIN_STEP + 1) + MIN_STEP;
            int start = random.nextInt(MAX_START_VALUE);

            int[] progression = new int[progressionLength];
            for (int j = 0; j < progressionLength; j++) {
                progression[j] = start + j * step;
            }

            int hiddenIndex = random.nextInt(progressionLength);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = HIDDEN_ELEMENT_PLACEHOLDER;

            StringBuilder question = new StringBuilder();
            for (int j = 0; j < progressionLength; j++) {
                if (progression[j] == HIDDEN_ELEMENT_PLACEHOLDER) {
                    question.append(".. ");
                } else {
                    question.append(progression[j]).append(" ");
                }
            }

            String correctAnswer = String.valueOf(hiddenValue);
            roundsData[i][0] = question.toString().trim();
            roundsData[i][1] = correctAnswer;
        }

        return roundsData;
    }

    public static void startGame() {
        String gameDescription = "What number is missing in the progression?";
        String[][] roundsData = generateRoundsData();
        Engine.runGame(roundsData, gameDescription);
    }
}
