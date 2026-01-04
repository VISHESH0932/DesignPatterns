package DecoratorPattern;

public class Caramel extends AddOnDecorator {
    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public int cost() {
        return beverage.cost() + 2;
    }
}
