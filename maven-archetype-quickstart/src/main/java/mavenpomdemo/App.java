package mavenpomdemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        var app = new App();
        app.performFizzBuzz();
    }

    private void performFizzBuzz(){
        for(int i = 0; i < 10; i++){
            try {
                doFizzBuzz("" + i);
            } catch (UglyNumberException e) {
                System.out.printf(e.getMessage());
            }
        }
    }

    public void doFizzBuzz(String number) {
        if (number.equals("3")){
            System.out.println("Fizz");
        }
        else if (number.equals("5")){
            System.out.println("Buzz");
        }
        else if(number.equals("9")){
            throw new UglyNumberException("Help!!!");

        }
    }
}
