package FactoryPattern;

public abstract class AnimalFactory {
    public abstract IAnimal createAnimal();

    public void performAnimalAction(){
        IAnimal animal = createAnimal();
        animal.speak();
    }
}
