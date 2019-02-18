package nl.han.oose.dea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Before
    public void setup(){

    }

    @Test
    public void legeStringTest() throws NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        int getal = calculator.add("");
        assertEquals(0, getal);
    }

    @Test
    public void eenGetalTest() throws NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        int getal = calculator.add("1");
        assertEquals(1, getal);
    }

    @Test
    public void tweeGetallenTest() throws NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        int getal = calculator.add("1,2");
        assertEquals(3, getal);
    }

    @Test
    public void meerdereGetallenTest() throws NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        int getal = calculator.add("1,2,4,5");
        assertEquals(12, getal);
    }

    @Test
    public void tweeDelimitersTest() throws NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        int getal = calculator.add("1\n2,3");
        assertEquals(6, getal);
    }

    @Test
    public void meerdereDelimitersTest() throws NegativeNumberException {
        StringCalculator calculator = new StringCalculator();
        int getal = calculator.add("//;\n1;3");
        assertEquals(4, getal);
    }

    @Test
    public void negatieveWaardeTest(){
        StringCalculator calculator = new StringCalculator();
        int getal = 0;
        boolean thrown = false;
        try {
            getal = calculator.add("-3, -4");
        } catch (NegativeNumberException e) {
            e.printStackTrace();
            thrown = true;
        }
        assertTrue(thrown, "");
    }
}
