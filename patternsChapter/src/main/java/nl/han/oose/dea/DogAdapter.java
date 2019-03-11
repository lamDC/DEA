package nl.han.oose.dea;

public class DogAdapter implements Animal{
    private Dog dog;

    public DogAdapter(){
        this.dog = new Dog();
    }

    @Override
    public String annoy(int number) {
        String sound = "";
        sound = dog.bark(number);
        return sound;
    }

}
