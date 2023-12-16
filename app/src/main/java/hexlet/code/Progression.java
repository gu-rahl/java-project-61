package hexlet.code;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class Progression {
    static int r = 0; // просто проверочный счетчик
    static int min = 5;
    static int max = 10;
/*
    static Random random = new Random();
    static int step = random.nextInt(10);
    static int element = random.nextInt(rnd(min, max));
    static int firstNumber = random.nextInt(100);
*/

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    static int[] progression = new int[rnd(min, max)];

    public static void progressionUse() {
        for (int j = 0; j < 3; j++) {
            Random random = new Random();
            int step = random.nextInt(10);
            int element = random.nextInt(rnd(min, max));
            int firstNumber = random.nextInt(100);

            progression[0] = firstNumber;
            // цикл for для заполнения массива
            for (int i = 1; i < progression.length; i++) {
                progression[i] = progression[i - 1] + step;
            }
            // далее преобразование массива int в массив String с разделением по знаку запятой через переменную а
            String a = Arrays.toString(progression);
            String progressionString[] = a.substring(1, a.length() - 1).split(", ");
            progressionString[element] = "..";
            System.out.println("What number is missing in the progression?");
            System.out.println("Question: " + Arrays.toString(progressionString));
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == progression[element]) {
                System.out.println("Correct!");
                r = 0;
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + progression[element]);
                System.out.println("Let's try again, " + Engine.userName);
                r = 1;
                break;
            }
        }
        if (r == 0) {
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }
}

