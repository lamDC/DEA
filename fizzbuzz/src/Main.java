import java.util.stream.IntStream;

public class Main {

    public static final int BUZZ_NUMBER = 5;
    public static final int FIZZ_NUMBER = 3;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main main = new Main();
        //var main = new Main();        dit kan ook, nieuwe in java 11
        main.fizzbuzz();
    }

    public void fizzbuzz(){
        for(int i = 1; i < 1001; i++){
            doFizzBuzz(i);
        }
    }

    public void streamingFizzBuzz(){
        IntStream.range(1, 1001).forEach(number -> doFizzBuzz(number));
    }

    private void doFizzBuzz(int i) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % FIZZ_NUMBER == 0) {
                System.out.println("Fizz");
            } else if (i % BUZZ_NUMBER == 0) {
                System.out.println("Buzz");
            }
    }
}
