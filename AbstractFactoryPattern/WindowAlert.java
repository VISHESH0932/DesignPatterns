package AbstractFactoryPattern;

public class WindowAlert implements IAlert {
    @Override
    public void display() {
        System.out.println("Displaying Window Alert");
    }
}
