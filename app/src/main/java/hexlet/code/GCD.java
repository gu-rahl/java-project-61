package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    static int gcd = 0;
    static int checkResponse = 0;

    public static void findingGcd() {
        System.out.println("Find the greatest common divisor of given numbers");
        for (int i = 0; i < 3; i++) {
            Random randomNumbers = new Random();
            int numberA = randomNumbers.nextInt(100);
            int numberB = randomNumbers.nextInt(100);
            System.out.println("Question: " + numberA + " " + numberB);
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            while (numberA != numberB) {
                if (numberA > numberB) {
                    numberA = numberA - numberB;
                } else {
                    numberB = numberB - numberA;
                }
            }
            gcd = numberA;
            if (answer == gcd) {
                System.out.println("Correct!");
                checkResponse = 0;
            } else {
                System.out.println("Your answer: " + answer);
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + gcd);
                System.out.println("Let's try again, " + Engine.userName);
                checkResponse = 1;
                break;
            }
        }
        if (checkResponse != 1) {
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }
}
