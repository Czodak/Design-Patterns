package ObserverDesignPattern;

public class FreeDailyNewsSubscriber implements Observer{

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
