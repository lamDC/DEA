package nl.han.oose.DiegoCup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import nl.han.oose.DiegoCup.exceptions.InvalidAantalException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void pakTest() {
        Magazijn mgz = new Magazijn(5);
        try {
            mgz.pak(1);
        } catch (InvalidAantalException e) {
            e.printStackTrace();
        }
        assertEquals(4, mgz.getVoorraad());
    }

    @Test
    public void plaatsTest(){
        Magazijn mgz = new Magazijn(5);
        try {
            mgz.plaats(1);
        } catch (InvalidAantalException e) {
            e.printStackTrace();
        }
        assertEquals(6, mgz.getVoorraad());
    }

    @Test
    public void plaatsNegatiefTest(){
        Magazijn mgz = new Magazijn(5);
        try {
            mgz.plaats(-1);
        } catch (InvalidAantalException e) {
            e.printStackTrace();
        }
        assertEquals(5, mgz.getVoorraad());
    }

    @Test
    public void pakHoogAantalTest() {
        Magazijn mgz = new Magazijn(5);
        try {
            mgz.pak(6);
        } catch (InvalidAantalException e) {
            e.printStackTrace();
        }
        assertEquals(5, mgz.getVoorraad());
    }




}
