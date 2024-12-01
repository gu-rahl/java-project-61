package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static final String greetingMessage = "Welcome to the Brain Games!";
    private static final String namePrompt = "May I have your name? ";
    private static final String helloMessage = "Hello, ";

    public static void greetUser() {
        String name = getName();
        System.out.println(greetingMessage);
        System.out.println(helloMessage + name + "!");
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(namePrompt);
        return scanner.nextLine();
    }
}
