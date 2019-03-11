package nl.han.oose.DiegoCup;

public class MagazijnMedewerker implements Runnable {

    private int hoeveelheid;
    private ThreadingMagazijn magazijn;

    public MagazijnMedewerker(ThreadingMagazijn magazijn, int hoeveelheid){
        this.magazijn = magazijn;
        this.hoeveelheid = hoeveelheid;
    }

    @Override
    public void run() {
            if (hoeveelheid > 0) {
                magazijn.plaats(hoeveelheid);
            } else {
                magazijn.pak(hoeveelheid);
            }
    }

}
