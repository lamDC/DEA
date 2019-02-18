package oose.dea;

import java.util.stream.IntStream;

public class FizzBuzz {
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
        } else if (i % App.FIZZ_NUMBER == 0) {
            System.out.println("Fizz");
        } else if (i % App.BUZZ_NUMBER == 0) {
            System.out.println("Buzz");
        }
    }
}