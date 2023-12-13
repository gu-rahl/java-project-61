package hexlet.code;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Engine.greeting();
        Engine.enterUserName();
        String game = Engine.game;
        if (game.equals("1")) {
            System.out.print("Your choice: 1\n");
            System.out.print("The greeting was higher :)");
        } else if (game.equals("2")) {
            ParityCheck.playdTheGame();
        } else if (game.equals("4")) {
            System.out.print("Your choice: 4, Good Bye!");
        } else if (!game.equals("1") && !game.equals("2") && !game.equals("3")) {
            System.out.print("BAD choice!, Good Bye!");
        } else if (game.equals("3")) {
            Calc.calc();
        }
    }
}
