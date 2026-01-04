package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }
}
