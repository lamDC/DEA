package nl.han.oose.DiegoCup;

import nl.han.oose.DiegoCup.exceptions.InvalidAantalException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var app = new App();
        try {
            app.main();
        } catch (InvalidAantalException e) {
            e.printStackTrace();
        }
    }

    public void main() throws InvalidAantalException {
        Magazijn magazijn = new Magazijn(25);

        magazijn.plaats(10);
        magazijn.pak(50);
        magazijn.pak(20);
        magazijn.plaats(14);
        magazijn.plaats(16);
        magazijn.pak(40);

        System.out.println(magazijn.getVoorraad());
    }
}

