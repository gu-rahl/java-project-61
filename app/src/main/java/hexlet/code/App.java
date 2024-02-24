package hexlet.code;

public class App {
    public static void main(String[] args) {
        Engine.greeting();

        String game = Engine.game;
        if (game.equals("1")) {
            Engine.enterUserName();
            System.out.print("Your choice: 1\n");
            System.out.print("The greeting was higher :)");
        } else if (game.equals("2")) {
            Engine.enterUserName();
            ParityCheck.playdTheGame();
        } else if (game.equals("7")) {
            System.out.print("Your choice: 7, Good Bye!");
        } else if (game.equals("4")) {
            Engine.enterUserName();
            GCD.findingGcd();
        } else if (game.equals("3")) {
            Engine.enterUserName();
            Calc.calc();
        } else if (game.equals("5")) {
            Engine.enterUserName();
            Progression.progressionUse();
        } else if (game.equals("6")) {
            Engine.enterUserName();
            Prime.primeMath();
        } else System.out.print("BAD choice!, Good Bye!");
    }
}

