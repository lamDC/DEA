package ml.han.multi;

public class Getal {
    private int getalletje = 0;

    public synchronized int geefGetalletje(){
        var returnGetal = getalletje;
        getalletje++;
        return returnGetal;
    }
}
