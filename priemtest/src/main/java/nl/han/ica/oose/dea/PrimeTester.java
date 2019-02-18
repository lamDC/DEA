package nl.han.ica.oose.dea;

import org.apache.commons.math3.primes.Primes;

public class PrimeTester implements Runnable{

    NumberUnderTest numberUnderTest;
    int highestNumberToTest;

    public PrimeTester(NumberUnderTest numberUnderTest, int highestNumberToTest) {
        this.numberUnderTest = numberUnderTest;
        this.highestNumberToTest = highestNumberToTest;
    }

    public synchronized void startTesting() throws OuchIFoundThirtySevenAndHenceMustdieException {

        while (true) {

            int number = numberUnderTest.getNumber();

            if (number > highestNumberToTest){
                break;
            }

            if (number == 37){
                throw new OuchIFoundThirtySevenAndHenceMustdieException(Thread.currentThread().getId() + " found Thirty Seven and must die");
            }

           boolean isPrime = Primes.isPrime(number);

            if (isPrime) {
                System.out.println(Thread.currentThread().getId() + " found a prime number: " + number);
            }
        }
    }

    public void run(){
        try{
            startTesting();
            Thread.sleep(20);
        }
        catch (OuchIFoundThirtySevenAndHenceMustdieException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}