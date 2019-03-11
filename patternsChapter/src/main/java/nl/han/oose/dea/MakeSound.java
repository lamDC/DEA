package nl.han.oose.dea;

public class MakeSound {

    private AnimalFactory animalFactory;

    private int number;
    private String animal;

    private Animal animalType;


    public MakeSound(String animal, int number){
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
        return animalType.annoy(number);
    }
}
