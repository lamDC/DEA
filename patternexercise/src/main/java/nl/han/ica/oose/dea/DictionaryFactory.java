package nl.han.ica.oose.dea;

public class DictionaryFactory {

    private static DictionaryFactory factory;

    public static DictionaryFactory getInstance(){
        if(factory == null){
            factory = new DictionaryFactory();
        }
        return factory;

    }

    public Dictionary create(DictionaryType type){
        switch(type){
            case KOENEN:
                return new KoenenAdapter();
            case KRAMERS:
                return new KramersAdapter();
            default:
                return null;
        }

    }
}
