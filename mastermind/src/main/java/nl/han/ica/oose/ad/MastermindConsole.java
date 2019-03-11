package nl.han.ica.oose.ad;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MastermindConsole
{
    public static void main( String[] args )
    {
        var main = new MastermindConsole();
        Scanner scanner = new Scanner(System.in);
        var game = new MastermindGame();
        do {
            System.out.println("Doe een gok: ");
            String guessAsString = scanner.nextLine();
            game.checkCombination(guessAsString);
        }
while (!game.won);


    }

}
