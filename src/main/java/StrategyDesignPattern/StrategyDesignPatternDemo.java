package StrategyDesignPattern;

public class StrategyDesignPatternDemo {
    public static void tryOutStrategyDesignPattern(){
        User exampleUser = new User("randomEmail@random.com", "1112223333");
        NotifyUser notifyUser = new NotifyUser();
        NotifyByEmailStrategy notifyByEmailStrategy = new NotifyByEmailStrategy();
        notifyUser.setStrategy(notifyByEmailStrategy);

        // use email notify strategy
        notifyUser.notifyAboutSomething(exampleUser);

        // change strategy to notify by sms
        notifyUser.setStrategy(new NotifyBySMSStrategy());
        notifyUser.notifyAboutSomething(exampleUser);

    }
}
