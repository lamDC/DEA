package nl.han.oose.DiegoCup;

import nl.han.oose.DiegoCup.exceptions.InvalidAantalException;

public class Magazijn {
    private int voorraad;

    public Magazijn(int startVoorraad){
        this.voorraad = startVoorraad;
    }

    public void pak (int aantal) throws InvalidAantalException {
        if(aantal < 0){
            throw new InvalidAantalException();
        }
        else if (aantal > voorraad) {
            System.out.println("Er is niet genoeg voorraad voor het gekozen aantal");
        }
        else {
            System.out.println("Aantal voor pakken (" + aantal + "): " + voorraad);

            voorraad -= aantal;

            System.out.println("Aantal na pakken (" + aantal + "): " + voorraad);
        }
    }

    public void plaats (int aantal) throws InvalidAantalException {
        if (aantal < 0) {
            throw new InvalidAantalException();
        } else {
            System.out.println("Aantal voor plaatsen (" + aantal + "): " + voorraad);

            voorraad += aantal;

            System.out.println("Aantal na plaatsen (" + aantal + "): " + voorraad);
        }
    }

    public String toString(){
        return "Voorraad: "+voorraad;
    }

    public int getVoorraad() {
        return voorraad;
    }
}


