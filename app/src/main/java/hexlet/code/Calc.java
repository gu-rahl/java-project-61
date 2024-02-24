package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static int result;

    public static void calc() {
        int i = 3;
        System.out.println("What is the result of the expression?");
        while (i > 0) {
            Random randomNumbers = new Random();
            int operationType = randomNumbers.nextInt(3);
            int numberA = randomNumbers.nextInt(100);
            int numberB = randomNumbers.nextInt(100);
            if (operationType == 0) {
                result = numberA + numberB;
                System.out.println(numberA + " + " + numberB);
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (answer == result) {
                    System.out.println("Correct!");
                    i--;
                    // scanner.close();
                } else System.out.println("Wrong!");
            } else if (operationType == 1) {
                result = numberA - numberB;
                System.out.println(numberA + " - " + numberB);
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (answer == result) {
                    System.out.println("Correct!");
                    i--;
                    // scanner.close();
                } else System.out.println("Wrong!");
            } else if (operationType == 2) {
                result = numberA * numberB;
                System.out.println(numberA + " * " + numberB);
                Scanner scanner = new Scanner(System.in);
                int answer = scanner.nextInt();
                if (answer == result) {
                    System.out.println("Correct!");
                    i--;
                    // scanner.close();
                } else System.out.println("Wrong!");
            }
        }
        System.out.println("Congratulations, " + Engine.userName + " !");
    }
}
