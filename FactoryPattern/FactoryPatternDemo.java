package FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        AnimalFactory factory = new RandomAnimal();
        factory.performAnimalAction();

        factory.performAnimalAction();
    }
}
