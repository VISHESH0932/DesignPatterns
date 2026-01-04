package StrategyPattern;
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Duck simpleDuck = new Duck(new SimpleFly(), new SimpleQuack(), new NormalDisplay());
        simpleDuck.performFly();
        simpleDuck.performQuack();
        simpleDuck.performDisplay();

        Duck wilDuck = new Duck(new JetFly(), new NoQuack(), new FancyDisplay());
        wilDuck.performFly();
        wilDuck.performQuack();
        wilDuck.performDisplay();

        Duck rubberDuck = new Duck(new NoFly(), new SimpleQuack(), new NormalDisplay());
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performDisplay();
    }
}
