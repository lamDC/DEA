package nl.han.oose.dea;

public class StringCalculator {

    public int add(String numbers) throws NegativeNumberException {
        if("".equals(numbers)){
            return 0;
        }
        else if(numbers.equals("1")){
            return 1;
        }
        else {
            String[] dividedNumbers;
            if(numbers.contains("//")){
                String[] values = numbers.split("\n");
                String delimiter = Character.toString(values[0].charAt(2));
                dividedNumbers = values[1].split(delimiter + "");
            }
            else {
                dividedNumbers = numbers.split(",|\\\n");
            }

            int som = 0;
            for (int i = 0; i < dividedNumbers.length; i++) {
                int getal = Integer.parseInt(dividedNumbers[i]);
                if(getal < 0){
                    throw new NegativeNumberException("Negatieve waarde niet toegestaan, " + getal + ", ");
                }
                som += getal;
            }
            if(som > 0){
                return som;
            }
            else {
                return 0;
            }
        }
    }
}
