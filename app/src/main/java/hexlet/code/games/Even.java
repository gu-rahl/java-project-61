package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.utils.Utils;

public class Even {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    // Метод для определения четности числа
    private static String getAnswerForNumber(int number) {
        return (number % 2 == 0) ? "yes" : "no";
    }

    public static void startGame() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.getRandomInt(MIN_NUMBER, MAX_NUMBER);
            roundsData[i][0] = String.valueOf(number); // Вопрос
            roundsData[i][1] = getAnswerForNumber(number); // Ответ
        }

        Engine.runGame(roundsData, gameDescription);
    }
}
