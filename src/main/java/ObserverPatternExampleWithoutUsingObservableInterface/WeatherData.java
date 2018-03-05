package ObserverPatternExampleWithoutUsingObservableInterface;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

    private List<Observer> observers;
    private float temp;
    private float pressure;
    private float humidity;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        if(observers.indexOf(observer)>=0)
        observers.remove(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer:observers)
            observer.update(temp, pressure, humidity);
    }

    public void measurementsChanged(){
        notifyAllObservers();
    }

    public void setMeasurements(float temp, float pressure, float humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
