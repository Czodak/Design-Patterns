package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DailyNews implements Subject{
    private List<Observer> observers;

    public DailyNews() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update("New daily news");
        }
    }
}
