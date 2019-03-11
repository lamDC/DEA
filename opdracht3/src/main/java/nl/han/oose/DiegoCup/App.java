package nl.han.oose.DiegoCup;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var app = new App();
        app.actiesOpMagazijn();
    }

    public void actiesOpMagazijn(){
        ThreadingMagazijn magazijn = new ThreadingMagazijn(25);
        var medewerkers = new ArrayList<MagazijnMedewerker>();

        medewerkers.add(new MagazijnMedewerker(magazijn, 10));
        medewerkers.add(new MagazijnMedewerker(magazijn, -50));
        medewerkers.add(new MagazijnMedewerker(magazijn, -20));
        medewerkers.add(new MagazijnMedewerker(magazijn, 14));
        medewerkers.add(new MagazijnMedewerker(magazijn, 16));
        medewerkers.add(new MagazijnMedewerker(magazijn, -40));

        medewerkers.forEach(medewerker -> new Thread(medewerker).start());

        System.out.println(magazijn.toString());
    }

}
