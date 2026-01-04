package AbstractFactoryPattern;

public class MacButton implements IButton {
    @Override
    public void click() {
        System.out.println("Clicking Mac Button");
    }
}
