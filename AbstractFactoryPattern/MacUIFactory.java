package AbstractFactoryPattern;

public class MacUIFactory implements IUIFactory {
    public IAlert createAlert() {
        return new MacAlert();
    }

    public IButton createButton() {
        return new MacButton();
    }

}
