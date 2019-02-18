package nl.han.ica.oose.dea;

public class Getal {
    private int returnGetal = 0;
public synchronized int geefGetal(){

    returnGetal++;
    return returnGetal;
}
}
