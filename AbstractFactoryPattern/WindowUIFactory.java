package AbstractFactoryPattern;

public class WindowUIFactory implements IUIFactory {
    public IAlert createAlert() {
        return new WindowAlert();
    }

    public IButton createButton() {
        return new WindowButton();
    }
}
