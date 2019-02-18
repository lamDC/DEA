package nl.han.ica.oose.dea;

public class Opteltafel implements Runnable {
    private final String naam;
    private final Getal getal;
    private final int multiplier;

    public Opteltafel(String naam, Getal getal, int multiplier) {
        this.naam = naam;
        this.getal = getal;
        this.multiplier = multiplier;
    }

    @Override
    public void run() {
        int i = 1;
        int getalletje = 0;
        while(i <= 10) {
            getalletje = getal.geefGetal();
            int som = multiplier * getalletje;
            System.out.println("De Thread " + naam + " doet de som: " + getalletje + " x " + multiplier + " = " + som );
            i++;
        }
    }
}
