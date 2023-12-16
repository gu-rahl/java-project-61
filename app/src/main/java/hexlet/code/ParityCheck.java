package hexlet.code;

import java.lang.Math;
import java.util.Scanner;

public class ParityCheck {
    static int counter = 0;

    public static void playdTheGame() {
        for (int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 10);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Question: " + randomNumber);
            String yesOrNo = scanner.nextLine();
            System.out.println("Your answer: " + yesOrNo);
            scanner.close();
            if (!yesOrNo.equals("yes") && !yesOrNo.equals("no")) {
                System.out.println("that's wrong. Try again.");
                break;
            } else if (randomNumber % 2 == 0 && yesOrNo.equals("yes")) {
                counter += 1;
                System.out.println("Correct!");
            } else if (randomNumber % 2 != 0 && yesOrNo.equals("no")) {
                counter += 1;
                System.out.println("Correct!");
            } else if (randomNumber % 2 == 0 && yesOrNo.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Engine.userName + " !");
                break;
            } else if (randomNumber % 2 != 0 && yesOrNo.equals("yes")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + Engine.userName + " !");
                break;
            }
            if (counter == 3) {
                System.out.println("Congratulations, " + Engine.userName + " !");
                break;
            }
        }
    }
}

