package nl.han.oose.DiegoCup;

public class ThreadingMagazijn {
    private int voorraad;

    public ThreadingMagazijn(int startVoorraad) {
        this.voorraad = startVoorraad;
    }

    public synchronized void pak(int aantal) {
        if (aantal > voorraad) {
            return;
        }
        voorraad = voorraad - aantal;
    }

    public synchronized void plaats(int aantal) {
        voorraad = voorraad + aantal;
    }

    public String toString() {
        return "Voorraad: " + voorraad;
    }

    public int getVoorraad() {
        return voorraad;
    }
}
