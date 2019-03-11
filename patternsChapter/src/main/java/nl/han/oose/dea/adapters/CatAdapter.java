package nl.han.oose.dea.adapters;

import nl.han.oose.dea.Animal;
import nl.han.oose.dea.Cat;

public class CatAdapter implements Animal {
    private Cat cat;

    public CatAdapter(){
    this.cat = new Cat();

    }
    @Override
    public String makeSound(int number) {
        String sound = "";
        sound = cat.miauw(number);
        return sound;
    }

}
