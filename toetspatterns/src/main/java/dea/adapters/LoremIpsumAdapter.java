package dea.adapters;

import dea.LoremIpsum;
import dea.Text;

public class LoremIpsumAdapter implements Text {

    private LoremIpsum loremIpsum;

    public LoremIpsumAdapter(){
        this.loremIpsum = new LoremIpsum();
    }

    @Override
    public String returnText(int number) {
        return loremIpsum.getWords(number);
    }
}
