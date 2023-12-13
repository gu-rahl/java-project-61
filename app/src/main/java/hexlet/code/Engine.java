package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String game;
    public static String userName;

    public static String greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n 1 - Greet \n 2 - Even \n 3 - Calc \n 4 - Exit \n");
        String game = scanner.nextLine();
        // scanner.close();
        return Engine.game = game;
    }
    public static String enterUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name?");
        String userName = scanner.nextLine();
        // scanner.close();
        System.out.println("Hello, " + userName + " !");
        return Engine.userName = userName;
    }
}
