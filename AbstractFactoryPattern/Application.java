package AbstractFactoryPattern;

public class Application {
    private IButton button;
    private IAlert alert;

    public Application(IUIFactory factory) {
        button = factory.createButton();
        alert = factory.createAlert();
    }

    public void paint(){
        alert.display();
        button.click();
    }
}
