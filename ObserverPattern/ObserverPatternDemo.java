package ObserverPattern;


public class ObserverPatternDemo {
    
    public static void main(String[] args) {
        WeatherStation weatherstation = new WeatherStation();
        
        PhoneDisplay myphone = new PhoneDisplay(weatherstation);
        WindowDisplay yourwindow = new WindowDisplay(weatherstation);
        
        weatherstation.addObserver(myphone);
        weatherstation.addObserver(yourwindow);

        weatherstation.setTemperature(25);

        weatherstation.setTemperature(30);  


    }
}
