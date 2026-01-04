package StrategyPattern;
public class NormalDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("Displaying normally!");
    }
}
