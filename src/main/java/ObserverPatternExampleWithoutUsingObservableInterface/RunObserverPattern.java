package ObserverPatternExampleWithoutUsingObservableInterface;

public class RunObserverPattern {
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("Observer pattern without using the observable interface.");
        System.out.println("========================================================");

        WeatherData weatherData = new WeatherData();
        CurrentDisplayConditions currentDisplayConditions = new CurrentDisplayConditions(weatherData);

        weatherData.setMeasurements(30.4f, 65, 80);
        weatherData.setMeasurements(29.2f, 70, 82);
        weatherData.setMeasurements(29.2f, 90, 78);

        currentDisplayConditions.display();

    }
}
