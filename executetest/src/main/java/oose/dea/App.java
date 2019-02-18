package oose.dea;

import oose.dea.factories.FizzbuzzFactory;

public class App {

    public static final int BUZZ_NUMBER = 5;
    public static final int FIZZ_NUMBER = 3;

    public static void main(String[] args) {
        var main = new App();
        //var main = new Main();        dit kan ook, nieuwe in java 11
        main.fizzbuzz();
    }

    public void fizzbuzz(){
        var fizzbuzz = new FizzbuzzFactory().create("Fizzbuzzer");
        fizzbuzz.fizzbuzz();
    }

//    public void streamingFizzBuzz(){
//        fizzBuzz.streamingFizzBuzz();
//    }
//
//    private void doFizzBuzz(int i) {
//        fizzBuzz.doFizzBuzz(i);
//    }
}