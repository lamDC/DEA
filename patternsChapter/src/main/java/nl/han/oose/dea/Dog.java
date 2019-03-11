package nl.han.oose.dea;

public class Dog {
    private static final String BARK = "WOEF";

    public String bark(int howMany){
        StringBuilder sound = new StringBuilder();
        for (int i = 0; i < howMany; i++) {
            sound.append(BARK);
        }
        return sound.toString();
    }
}
