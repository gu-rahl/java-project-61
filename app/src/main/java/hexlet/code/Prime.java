package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    static int checkResponse = 0; // просто проверочный счетчик
    static Random random = new Random();
    static int check = 1;
    static int divider = 1;
    static boolean isPrime = true;

    public static void primeMath() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int j = 0; j < 3; j++) {

            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            for (int i = 1; i <= number / 2; i++) {
                if (number < 2) {
                    check++;
                }
                if (number % i == 0) {
                    check++;
                    if (check == 3) {
                        break;
                    }
                }
            }
            if (check >= 3 && answer.equals("no") || check < 3 && answer.equals("yes")) {
                System.out.println("Correct!");
                check = 0;
            } else {
                System.out.println("is wrong answer ;(. Try again, " + Engine.userName);
                checkResponse++;
                break;
            }
        }
        if (checkResponse == 0) {
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }
}

