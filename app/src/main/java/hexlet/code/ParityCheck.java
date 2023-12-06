package hexlet.code;
import java.lang.Math;
import java.util.Scanner;
public class ParityCheck {
    static int counter = 0;

    public static void playdTheGame() {
        Scanner scannerName = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String userName = scannerName.nextLine();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for(int i = 0; i < 3; i++) {
            int randomNumber = (int) (Math.random() * 10);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Question: " + randomNumber);
            String yesOrNo = scanner.nextLine();
            System.out.println("Your answer: " + yesOrNo);
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
                System.out.println("Let's try again, " + userName + " !");
                break;
            } else if (randomNumber % 2 != 0 && yesOrNo.equals("yes")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + userName + " !");
                break;
            }
            if (counter == 3) {
                System.out.println("Congratulations, " + userName + " !");
            }

        }

    }
}

