package ObserverPatternExampleWithoutUsingObservableInterface;

public interface Observer {
    public void update(float temp, float pressure, float humidity);
}
