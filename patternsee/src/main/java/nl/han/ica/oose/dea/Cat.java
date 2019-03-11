package nl.han.ica.oose.dea;

public class Cat {

    private static final String MIAUW = "MIAUW";

    public String miauw(int howMany){
        StringBuilder sound = new StringBuilder();
        for (int i = 0; i < howMany; i++) {
            sound.append(MIAUW);
        }
        return sound.toString();
    }
}
