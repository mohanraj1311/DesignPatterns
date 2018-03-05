package ObserverPatternExampleWithoutUsingObservableInterface;

public class CurrentDisplayConditions implements Observer, DisplayElement {

    private Subject weatherData;
    private float temp;
    private float pressure;
    private float humidity;

    public CurrentDisplayConditions(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void update(float temp, float pressure, float humidity){
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;

    }

    public void display() {
        System.out.println("The current temp: "+temp+", pressure: "+pressure+", humidity: "+humidity);

    }
}
