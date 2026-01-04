package StrategyPattern;
public class JetFly implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with jet power!");
    }
}
