package StateDesignPattern.States;

import StateDesignPattern.PizzaOrder;

public interface OrderedPizzaState {
    void nextState(PizzaOrder pizzaOrder);
    void previousState(PizzaOrder pizzaOrder);
    void printStatus();
}
