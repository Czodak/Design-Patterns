package StateDesignPattern.States;

import StateDesignPattern.PizzaOrder;

public class DeliveredToCustomer implements OrderedPizzaState{
    @Override
    public void nextState(PizzaOrder pizzaOrder) {
        System.out.println("Pizza is delivered, no more states");
    }

    @Override
    public void previousState(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new OnTheRoadToClientState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pizza is delivered to customer. The order is finished");
    }
}
