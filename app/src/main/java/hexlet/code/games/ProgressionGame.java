package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {

    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_STEP = 1;
    private static final int MAX_STEP = 10;
    private static final int MAX_START_VALUE = 10;
    private static final String HIDDEN_ELEMENT_PLACEHOLDER = "..";

    private static final Random RANDOM = new Random();

    public static String[][] generateRoundsData() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            // Генерируем параметры прогрессии
            int progressionLength = getRandomInt(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int step = getRandomInt(MIN_STEP, MAX_STEP);
            int start = getRandomInt(0, MAX_START_VALUE);

            // Генерируем прогрессию
            int[] progression = generateProgression(progressionLength, start, step);

            // Скрываем случайный элемент
            int hiddenIndex = getRandomInt(0, progressionLength - 1);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = -1;

            // Формируем вопрос
            StringBuilder question = new StringBuilder();
            for (int value : progression) {
                if (value == -1) {
                    question.append(HIDDEN_ELEMENT_PLACEHOLDER).append(" ");
                } else {
                    question.append(value).append(" ");
                }
            }

            // Сохраняем данные для раунда
            roundsData[i][0] = question.toString().trim();
            roundsData[i][1] = String.valueOf(hiddenValue);
        }

        return roundsData;
    }

    // Универсальный метод для генерации прогрессии
    private static int[] generateProgression(int length, int start, int step) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }

    // Метод для генерации случайного числа в заданном диапазоне
    private static int getRandomInt(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static void startGame() {
        String gameDescription = "What number is missing in the progression?";
        String[][] roundsData = generateRoundsData();
        Engine.runGame(roundsData, gameDescription);
    }
}
