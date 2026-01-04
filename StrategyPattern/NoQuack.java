package StrategyPattern;
public class NoQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
