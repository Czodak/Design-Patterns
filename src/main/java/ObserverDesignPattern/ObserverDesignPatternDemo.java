package ObserverDesignPattern;

public class ObserverDesignPatternDemo {

    public static void tryOutObserver(){
        // init
        Subject mostPopularNewsWebsite = new DailyNews();

        Observer freeSubscriber = new FreeDailyNewsSubscriber();
        Observer premiumSubscriber = new PremiumDailyNewsSubscriber();

        // add observers to subject
        mostPopularNewsWebsite.addObserver(freeSubscriber);
        mostPopularNewsWebsite.addObserver(premiumSubscriber);

        // notify observers
        mostPopularNewsWebsite.notifyObservers();



    }
}
