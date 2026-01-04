package FactoryPattern;

public class RandomAnimal extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        if (Math.random() < 0.5) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}