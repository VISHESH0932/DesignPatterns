package DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Caramel(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}