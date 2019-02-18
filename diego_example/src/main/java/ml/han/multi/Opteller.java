package ml.han.multi;

import ml.han.UglyNumberException;

public class Opteller implements Runnable {

    private final Getal getal;
    private final String naam;

    public Opteller(String naam, Getal getal){
        this.naam = naam;
        this.getal = getal;
    }

    @Override
    public void run() {
        var i = 0;
        while(i < 1000){
            i = getal.geefGetalletje();

            if(i == 37){
                try {
                    throw new UglyNumberException("Getver 37");
                } catch (UglyNumberException e) {
                    break; //hier sterft de thread
                }
            }

            System.out.println("ik, " + naam + ", heb het getal " + i + " gepakt!");

        }

    }

}
