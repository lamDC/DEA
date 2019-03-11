package nl.han.oose.dea;

public class AnimalFactory {

    private static AnimalFactory factory;

    public static AnimalFactory getInstance(){
        if(factory == null){
            factory = new AnimalFactory();
        }
        return factory;
    }

    public Animal create(AnimalType type){
        switch(type){
            case DOG:
                return new DogAdapter();
            case CAT:
                return new CatAdapter();
            default:
                return null;
        }

    }

}
