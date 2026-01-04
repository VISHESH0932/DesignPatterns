package FacadePattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Lights lights = new Lights();

        HomeTheater homeTheater = new HomeTheater(amplifier, lights, projector);
        homeTheater.watchMovie("Inception");
        System.out.println("\n--- 2 Hours Later ---\n");
        homeTheater.endMovie();

    }
}
