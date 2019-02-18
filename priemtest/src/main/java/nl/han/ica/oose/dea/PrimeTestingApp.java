package nl.han.ica.oose.dea;

import java.util.ArrayList;

public class PrimeTestingApp {

    private static final int HIGHEST_NUMBER_TO_TEST = 1000;

    public static void main(String[] args) {
        PrimeTestingApp app = new PrimeTestingApp();
        app.startTesting();

    }

    private void startTesting() {
        NumberUnderTest numberUnderTest = new NumberUnderTest();

        /* voor met een arraylist
        var primeTesters = new ArrayList<PrimeTester>();
        primeTesters.add(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));
        primeTesters.add(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));
        primeTesters.add(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));
        primeTesters.add(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));

        primeTesters.forEach(primeTester -> new Thread(primeTester).start());
        */

        for (int i = 0; i < 4; i++) {
            PrimeTester tester = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);
            Thread t = new Thread(tester);
            t.start();
        }

    }
}
//hieronder is voor het testen, een stappenplan
/*
public class PrimeTester implements Runnable { //alt + enter, geeft een constructor run()
    public boolean isPrime(int i){
        //iets slims

        return true;
    }
    @Override
    public void run(){
        isPrime(37);
    }
}

public class TestRunner{

    public static voic main(String[] args){
        var testRunner = new Testrunner();
        testRunner.startYourTesting();
    }
    private void startYourTesting(){
        List<PrimeTester> primeTesters = new ArrayList<>();     //lijst waarin de objecten worden opgeslagen

        primeTesters.add(new PrimeTester());       //zorg dat er meerdere objecten zijn die aan het werk gaan
        primeTesters.add(new PrimeTester());

        for(PrimeTester primeTester : primeTesters){    //hier worden de werkende objecten in aparte threads gezet
            new Thread(primeTester).start();
        }
    }
}
*/