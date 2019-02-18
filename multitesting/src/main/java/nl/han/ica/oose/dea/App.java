package nl.han.ica.oose.dea;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var app = new App();
        app.start();
    }

    public void start(){
        var getal = new Getal();
        List<Opteltafel> opteltafels = new ArrayList<>();

        opteltafels.add(new Opteltafel("A", getal, 1));
        opteltafels.add(new Opteltafel("B", getal, 2));
        opteltafels.add(new Opteltafel("C", getal, 3));

        opteltafels.forEach(opteltafel -> new Thread(opteltafel).start());
    }
}
