package dea.factories;

import dea.RandomTextGenerator;
import dea.Text;
import dea.adapters.LoremIpsumAdapter;
import dea.adapters.RandomTextAdapter;

public class RandomTextGeneratorFactory {

    private static RandomTextGeneratorFactory factory;

    public static RandomTextGeneratorFactory getInstance(){
        if(factory == null){
            factory = new RandomTextGeneratorFactory();
        }
        return factory;
    }

    public Text create(RandomTextType type){
        switch(type){
            case RANDOMTEXT:
                return new RandomTextAdapter();
            case LOREMIPSUM:
                return new LoremIpsumAdapter();
            default:
                return null;
        }
    }
}
