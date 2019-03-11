package nl.han.oose.dea;

public class CatAdapter implements Animal {
    private Cat cat;

    public CatAdapter(){
    this.cat = new Cat();

    }
    @Override
    public String annoy(int number) {
        String sound = "";
        sound = cat.miauw(number);
        return sound;
    }

}
