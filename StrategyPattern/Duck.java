package StrategyPattern;

public class Duck {
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;
    private IDisplayBehavior displayBehavior;

    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, IDisplayBehavior displayBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performDisplay() {
        displayBehavior.display();
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void setDisplayBehavior(IDisplayBehavior db) {
        this.displayBehavior = db;
    }
}
