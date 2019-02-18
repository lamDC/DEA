package oose.dea;

import java.util.stream.IntStream;

public class FizzBuzz {

    private static final int BUZZ_NUMBER = 5;
    private static final int FIZZ_NUMBER = 3;
    private String name;

    public FizzBuzz(String name) {
        this.name = name;
    }

    public void fizzbuzz() {
        System.out.println(name + " gaat te werk!");
        for (int i = 1; i < 1001; i++) {
            doFizzBuzz(i);
        }
    }

//    public void streamingFizzBuzz() {
//        IntStream.range(1, 1001).forEach(number -> doFizzBuzz(number));
//    }

    void doFizzBuzz(int i) {
        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % FIZZ_NUMBER == 0) {
            System.out.println("Fizz");
        } else if (i % BUZZ_NUMBER == 0) {
            System.out.println("Buzz");
        }
    }
}