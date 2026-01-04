package FacadePattern;

public class HomeTheater {
    private Amplifier amplifier;
    private Lights lights;
    private Projector projector;

    public HomeTheater(Amplifier amplifier, Lights lights, Projector projector) {
        this.amplifier = amplifier;
        this.lights = lights;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.on();
        lights.dim(10);
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(5);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        amplifier.off();
        projector.off();
        lights.off();
    }
}