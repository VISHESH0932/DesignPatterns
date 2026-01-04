package DecoratorPattern;

public abstract class AddOnDecorator extends Beverage{
    protected Beverage beverage;

    public abstract int cost();
}
