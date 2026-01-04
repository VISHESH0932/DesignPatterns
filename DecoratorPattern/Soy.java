package DecoratorPattern;

public class Soy extends AddOnDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public int cost() {
        return beverage.cost() + 1;
    }
}