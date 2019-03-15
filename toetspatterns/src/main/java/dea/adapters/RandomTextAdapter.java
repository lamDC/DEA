package dea.adapters;

import dea.RandomTextGenerator;
import dea.Text;

public class RandomTextAdapter implements Text {

    private RandomTextGenerator randomTextGenerator;

    public RandomTextAdapter(){
        this.randomTextGenerator = new RandomTextGenerator();
    }

    @Override
    public String returnText(int number) {
        return randomTextGenerator.generateText(number);
    }
}
