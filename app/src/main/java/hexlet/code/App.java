package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n 1 - Greet \n 2 - Even \n 3 - Exit \n");
        String game = scanner.next();
            if (game.equals("1")) {
                System.out.print("Your choice: 1\n");
                Cli.greeting();
            } else if (game.equals("2")) {
                ParityCheck.playdTheGame();
            } else if (game.equals("3")) {
                System.out.print("Your choice: 3, Good Bye!");
            } else if (!game.equals("1") && !game.equals("2") && !game.equals("3")) {
                System.out.print("BAD choice!, Good Bye!");
            }



    }
}
