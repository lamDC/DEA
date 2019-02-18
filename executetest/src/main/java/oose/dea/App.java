package oose.dea;

import oose.dea.factories.FizzbuzzFactory;

public class App {

    public static void main(String[] args) {
        var main = new App();
        //var main = new App();        dit kan ook
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