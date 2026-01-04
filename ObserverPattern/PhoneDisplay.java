package ObserverPattern;

public class PhoneDisplay implements IObserver {
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Phone Display - Temperature updated: " + weatherStation.getTemperature() + "°C");
    }
}
