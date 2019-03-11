package nl.han.ica.oose.ad;

public class Hint {
    private int correct;
    private int semiCorrect;

    public Hint(int rightPos, int wrongPos){
        correct = rightPos;
        semiCorrect = wrongPos;
    }

    public String toString(){
        if(correct == 4){
            return "Gefeliciteerd je hebt de geheime code geraden!";
        }
        else {
            return "Right colour right position = " + correct + "\n" + "Right colour wrong position = " + semiCorrect;
        }
    }

    public int getCorrect() {
        return correct;
    }
    public int getSemiCorrect(){
        return semiCorrect;
    }
}
