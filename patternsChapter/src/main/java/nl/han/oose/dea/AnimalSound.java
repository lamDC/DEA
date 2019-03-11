package nl.han.oose.dea;

import nl.han.oose.dea.factories.AnimalFactory;

public class AnimalSound {

    private AnimalFactory animalFactory;

    private int number;
    private String animal;

    private Animal animalType;


    public AnimalSound(String animal, int number){
        this.animal = animal;
        this.number = number;

        animalFactory = AnimalFactory.getInstance();
        if("Cat".equals(animal)){
            animalType = animalFactory.create(AnimalType.CAT);
        }
        if("Dog".equals(animal)){
            animalType = animalFactory.create(AnimalType.DOG);
        }
    }

    public String getSound(){
        return animalType.makeSound(number);
    }
}
