package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static final String GREETING_MESSAGE = "Welcome to the Brain Games!";
    private static final String NAME_PROMPT = "May I have your name? ";
    private static final String HELLO_MESSAGE = "Hello, ";

    public static void greetUser() {
        String name = getName();
        System.out.println(GREETING_MESSAGE);
        System.out.println(HELLO_MESSAGE + name + "!");
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(NAME_PROMPT);
        return scanner.nextLine();
    }
}
