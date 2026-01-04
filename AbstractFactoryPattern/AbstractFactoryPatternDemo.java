package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
      
        IUIFactory factory = new MacUIFactory();
        Application app = new Application(factory);
        app.paint();
        
        factory = new WindowUIFactory();
        app = new Application(factory); 
        app.paint();
    }
}
