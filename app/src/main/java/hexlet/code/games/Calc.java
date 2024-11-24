package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final int MAX_NUMBER = 100;

    public static void run() {
        String[][] roundsData = new String[3][2];
        String gameDescription = "What is the result of the expression?";
        Random random = new Random();

        for (int i = 0; i < roundsData.length; i++) {
            int number1 = random.nextInt(MAX_NUMBER);
            int number2 = random.nextInt(MAX_NUMBER);
            char operator = getRandomOperator();

            String question = number1 + " " + operator + " " + number2;
            String correctAnswer = String.valueOf(calculate(number1, number2, operator));

            roundsData[i][0] = question;
            roundsData[i][1] = correctAnswer;
        }

        Engine.runGame(roundsData, gameDescription);
    }

    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        Random random = new Random();
        return operators[random.nextInt(operators.length)];
    }

    private static int calculate(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new IllegalStateException("Unexpected operator: " + operator);
        };
    }
}
