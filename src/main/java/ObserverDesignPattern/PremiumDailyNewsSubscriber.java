package ObserverDesignPattern;

public class PremiumDailyNewsSubscriber implements Observer{
    @Override
    public void update(String message) {
        System.out.println(message+this.addPremiumContentToMessage());
    }

    private String addPremiumContentToMessage(){
        return "premium-content";
    }
}
