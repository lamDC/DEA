package ml.han;

import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testThatEmptyStringReturnsEmptyString() throws UglyNumberException {
        //Setup
        var app = new App();

        //Test
        var fizzBuzzReturnValue = app.doFizzBuzz(7);

        //Verify
        Assertions.assertEquals(7, fizzBuzzReturnValue);
    }
    public void testExceptionIsThrown() throws UglyNumberException {
        var app = new App();

        var fizzBuzzReturnValue = app.doFizzBuzz(3);

        UglyNumberException uglyNumberException = Assertions.assertThrows(UglyNumberException.class, () -> app.doFizzBuzz(7));
        Assertions.assertEquals("", uglyNumberException.getMessage());
    }
}
