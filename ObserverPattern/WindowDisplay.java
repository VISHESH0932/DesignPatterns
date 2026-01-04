package ObserverPattern;

public class WindowDisplay implements IObserver {
    private WeatherStation weatherStation;
    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Window Display - Temperature updated: " + weatherStation.getTemperature() + "°C");
    }   
}
