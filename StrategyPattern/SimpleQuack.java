package StrategyPattern;
public class SimpleQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking simply!");
    }
}
