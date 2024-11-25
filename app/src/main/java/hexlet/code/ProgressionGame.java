package hexlet.code;

import java.util.Random;

public class ProgressionGame {

    public static String[][] generateRoundsData() {
        Random random = new Random();
        int rounds = 3;
        String[][] roundsData = new String[rounds][2];  // Массив для хранения вопросов и правильных ответов

        for (int i = 0; i < rounds; i++) {
            int length = random.nextInt(6) + 5; // Длина прогрессии от 5 до 10 чисел
            int step = random.nextInt(10) + 1;  // Шаг прогрессии от 1 до 10
            int start = random.nextInt(10);  // Начальное число прогрессии

            // Генерируем прогрессию
            int[] progression = new int[length];
            for (int j = 0; j < length; j++) {
                progression[j] = start + j * step;
            }

            // Скрываем случайный элемент
            int hiddenIndex = random.nextInt(length);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = -1; // Скрытый элемент помечаем как -1

            // Формируем строку для вывода
            StringBuilder question = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (progression[j] == -1) {
                    question.append(".. ");
                } else {
                    question.append(progression[j] + " ");
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
