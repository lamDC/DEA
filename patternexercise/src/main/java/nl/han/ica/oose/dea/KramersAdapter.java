package nl.han.ica.oose.dea;

public class KramersAdapter implements Dictionary{

    private KramersDictionary kramers;
    private String naam;

    public KramersAdapter(){
        kramers = new KramersDictionary();
        naam = "Kramers Dictionary";
    }

    @Override
    public String translate(String word) {
        return kramers.find(word);
    }

    @Override
    public String getName(){
        return naam;
    }
}
