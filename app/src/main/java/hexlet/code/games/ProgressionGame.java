package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {

    private static final int minProgressionLength = 5;
    private static final int maxProgressionLength = 10;
    private static final int minStep = 1;
    private static final int maxStep = 10;
    private static final int roundsCount = 3;
    private static final int maxStartValue = 10;
    private static final int hiddenElementPlaceholder = -1;

    public static String[][] generateRoundsData() {
        Random random = new Random();
        String[][] roundsData = new String[roundsCount][2];  // Массив для хранения вопросов и правильных ответов

        for (int i = 0; i < roundsCount; i++) {
            int progressionLength = random.nextInt(maxProgressionLength - minProgressionLength + 1) + minProgressionLength;
            int step = random.nextInt(maxStep - minStep + 1) + minStep;
            int start = random.nextInt(maxStartValue);

            // Генерируем прогрессию
            int[] progression = new int[progressionLength];
            for (int j = 0; j < progressionLength; j++) {
                progression[j] = start + j * step;
            }

            // Скрываем случайный элемент
            int hiddenIndex = random.nextInt(progressionLength);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = hiddenElementPlaceholder; // Скрытый элемент помечаем как -1

            // Формируем строку для вывода
            StringBuilder question = new StringBuilder();
            for (int j = 0; j < progressionLength; j++) {
                if (progression[j] == hiddenElementPlaceholder) {
                    question.append(".. ");
                } else {
                    question.append(progression[j]).append(" ");
                }
            }

            // Правильный ответ — это скрытое число
            String correctAnswer = String.valueOf(hiddenValue);

            // Сохраняем вопрос и правильный ответ
            roundsData[i][0] = question.toString().trim();
            roundsData[i][1] = correctAnswer;
        }

        return roundsData;
    }

    public static void startGame() {
        String gameDescription = "What number is missing in the progression?";

        // Генерируем данные для раундов
        String[][] roundsData = generateRoundsData();

        // Запускаем игру с использованием движка
        Engine.runGame(roundsData, gameDescription);
    }
}
