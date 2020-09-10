package StateDesignPattern.States;

import StateDesignPattern.PizzaOrder;

public class BakingPizzaState implements OrderedPizzaState{
    @Override
    public void nextState(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new OnTheRoadToClientState());
    }

    @Override
    public void previousState(PizzaOrder pizzaOrder) {
        pizzaOrder.setState(new OrderedByClientState());
    }

    @Override
    public void printStatus() {
        System.out.println("Pizza is baking in oven");
    }
}
