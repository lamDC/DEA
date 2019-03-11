package nl.han.ica.oose.ad;

public class MastermindGame {

    private int turn;
    private boolean won;

    public void checkCombination(String guessAsString){

        var guess = new ColorCombination(guessAsString);
        var code = new ColorCombination("BRBY");
        var hint = code.compareWith(guess);

    }
}
