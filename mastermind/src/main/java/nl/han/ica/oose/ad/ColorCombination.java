package nl.han.ica.oose.ad;

import java.util.ArrayList;
import java.util.Objects;

public class ColorCombination {

    private String guess;
    private Peg pegs[];

    public ColorCombination(String guess){
        this.guess = guess;

    }

    public Hint compareWith(ColorCombination other){
        pegs[0] = (new Peg("B"));
        pegs[1] = (new Peg("R"));
        pegs[2] = (new Peg("B"));
        pegs[3] = (new Peg("Y"));

        var hint = new Hint(determineRightColorRightPosition(), determineRightColorWrongPosition());
        return hint;

    }

    private int determineRightColorRightPosition(){
        int right = 0;
        for (int i = 0; i < 4; i++) {
            if(Objects.equals(pegs[i].getColor(), String.valueOf(guess.charAt(i)))){
                right += 1;
            }
        }
        return right;
    }

    private int determineRightColorWrongPosition(){
        int right = 0;
        for (int i = 0; i < 4; i++) {
            if(Objects.equals(pegs[i].getColor(), String.valueOf(guess.charAt(i)))){
                right += 1;
            }
        }
        return right;
    }
}
