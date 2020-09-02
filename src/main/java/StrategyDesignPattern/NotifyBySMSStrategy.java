package StrategyDesignPattern;

public class NotifyBySMSStrategy implements NotifyStrategy{

    @Override
    public void notifyUserAboutSomething(User user) {
        System.out.println("Send sms to "+user.getPhoneNumber());
    }
}
