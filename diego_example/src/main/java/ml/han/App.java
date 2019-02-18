package ml.han;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */

public class App {

    public static final int BUZZ_NUMBER = 5;
    public static final int FIZZ_NUMBER = 3;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var main = new App();
        //var main = new Main();        dit kan ook, nieuwe in java 11
        main.fizzbuzz();
    }

    public void fizzbuzz(){
        for(int i = 1; i < 1001; i++){
            try {
                doFizzBuzz(i);
            } catch (UglyNumberException e) {
                e.printStackTrace();
            }
        }
    }

   // public void streamingFizzBuzz(){
   //     IntStream.range(1, 1001).forEach(number -> doFizzBuzz(number));
   // }

    public int doFizzBuzz(int i) throws UglyNumberException {
        if (i % 15 == 0) {
            return 15;
        } else if (i % FIZZ_NUMBER == 0) {
            return 3;
        } else if (i % BUZZ_NUMBER == 0) {
            return 5;
        }
        else if (i % 7 == 0){
            throw new UglyNumberException("yes dit is 7");
        }
        else return 0;
    }
}