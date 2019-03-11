package nl.han.ica.oose.dea;

public class TranslateToDutch {

    private String word;
    private String foundWord;

    private DictionaryFactory dictionaryFactory;
    private Dictionary dictionary;

    public TranslateToDutch(String word){
        this.word = word;
        dictionaryFactory = DictionaryFactory.getInstance();

        dictionary = dictionaryFactory.create(DictionaryType.KOENEN);
        foundWord = dictionary.translate(word);
        if(foundWord == null){
            dictionary = dictionaryFactory.create(DictionaryType.KRAMERS);
            foundWord = dictionary.translate(word);
            if(foundWord == null){
                System.out.println("Your translate request: " + word + " gave no results");
            }
            else {
                System.out.println("The translation for the word: " + word + " is: " + foundWord + " from the " + dictionary.getName());
            }
        }
        else {
            System.out.println("The translation for the word: " + word + " is: " + foundWord + " from the " + dictionary.getName());
        }

    }

}
