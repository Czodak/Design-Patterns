package StrategyDesignPattern;

public class NotifyUser {
    private NotifyStrategy strategy;

    public void setStrategy(NotifyStrategy strategy) {
        this.strategy = strategy;
    }

    public void notifyAboutSomething(User user){
        this.strategy.notifyUserAboutSomething(user);
    }
}
