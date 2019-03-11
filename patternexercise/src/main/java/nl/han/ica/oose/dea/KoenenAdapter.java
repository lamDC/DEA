package nl.han.ica.oose.dea;

public class KoenenAdapter implements Dictionary {

    private KoenenDictionary koenen;
    private String naam;

    public KoenenAdapter(){
        koenen = new KoenenDictionary();
        koenen.openEnglishDutch();
        koenen.openDutchEnglish();
        naam = "Koenen Dictionary";
    }
    @Override
    public String translate(String word) {
        return koenen.lookUp(word);
    }

    @Override
    public String getName(){
        return naam;
    }
}
