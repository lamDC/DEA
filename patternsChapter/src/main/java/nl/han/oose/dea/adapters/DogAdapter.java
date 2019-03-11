package nl.han.oose.dea.adapters;

import nl.han.oose.dea.Animal;
import nl.han.oose.dea.Dog;

public class DogAdapter implements Animal {
    private Dog dog;

    public DogAdapter(){
        this.dog = new Dog();
    }

    @Override
    public String makeSound(int number) {
        String sound = "";
        sound = dog.bark(number);
        return sound;
    }

}
