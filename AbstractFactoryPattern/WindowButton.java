package AbstractFactoryPattern;

public class WindowButton implements IButton {
    @Override
    public void click() {
        System.out.println("Clicking Window Button");
    }
}
