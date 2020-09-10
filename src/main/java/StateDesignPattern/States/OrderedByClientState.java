package StateDesignPattern.States;


import StateDesignPattern.PizzaOrder;

public class OrderedByClientState implements OrderedPizzaState{
    @Override
    public void nextState(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new BakingPizzaState());
    }

    @Override
    public void previousState(PizzaOrder pizzaOrder) {
        System.out.println("Root state");
    }

    @Override
    public void printStatus() {
        System.out.println("Pizza ordered, restaurant has received the order");
    }
}
