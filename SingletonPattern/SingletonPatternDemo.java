package SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same. Singleton pattern works!");
        } else {
            System.out.println("Instances are different. Singleton pattern failed.");
        }
    }
}