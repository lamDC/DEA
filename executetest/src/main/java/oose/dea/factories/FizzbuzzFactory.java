package oose.dea.factories;

import oose.dea.FizzBuzz;

public class FizzbuzzFactory {

    public static FizzBuzz create(String name){
        var fizzbuzz = new FizzBuzz(name);
        return fizzbuzz;
    }
}
