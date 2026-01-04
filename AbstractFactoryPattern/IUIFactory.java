package AbstractFactoryPattern;

public interface IUIFactory {
    IAlert createAlert();
    IButton createButton();
}
