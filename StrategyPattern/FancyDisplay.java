package StrategyPattern;
public class FancyDisplay implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("Displaying fancily!");
    }
}
