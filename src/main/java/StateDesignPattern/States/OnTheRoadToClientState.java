package StateDesignPattern.States;

import StateDesignPattern.PizzaOrder;

public class OnTheRoadToClientState implements OrderedPizzaState {
    @Override
    public void nextState(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new DeliveredToCustomer());
    }

    @Override
    public void previousState(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new BakingPizzaState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pizza is on the road to customer");
    }
}
