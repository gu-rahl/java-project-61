package hexlet.code;

import hexlet.code.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                Cli.greetUser();
                break;
            case "2":
                Even.play();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please restart the application.");
        }
    }
}