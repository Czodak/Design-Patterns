package StrategyDesignPattern;

public class NotifyByEmailStrategy implements NotifyStrategy{

    @Override
    public void notifyUserAboutSomething(User user) {
        System.out.println("send email to "+user.getEmail());
    }
}
