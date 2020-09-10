package StateDesignPattern;

import StateDesignPattern.States.OrderedByClientState;
import StateDesignPattern.States.OrderedPizzaState;

public class PizzaOrder {
    private OrderedPizzaState state = new OrderedByClientState();

    public OrderedPizzaState getState() {
        return state;
    }

    public void setState(OrderedPizzaState state) {
        this.state = state;
    }

    public void previousState(){
        state.previousState(this);
    }

    public void nextState(){
        state.nextState(this);
    }

    public void printStatus(){
        state.printStatus();
    }
}
