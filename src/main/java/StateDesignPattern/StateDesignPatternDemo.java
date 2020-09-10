package StateDesignPattern;

public class StateDesignPatternDemo {

    public static void tryOutStateDesignPattern(){
        // create pizza order
        PizzaOrder pizzaOrder = new PizzaOrder();

        // print state of pizza
        pizzaOrder.printStatus();
        //go to next state
        pizzaOrder.nextState();

        pizzaOrder.printStatus();

        pizzaOrder.nextState();
        pizzaOrder.printStatus();

        pizzaOrder.nextState();
        pizzaOrder.printStatus();
        // order is in final state
        pizzaOrder.nextState();
        System.out.println("-------   BACK TO ROOT   -------");
        // return to root state
        pizzaOrder.previousState();
        pizzaOrder.printStatus();

        pizzaOrder.previousState();
        pizzaOrder.printStatus();

        pizzaOrder.previousState();
        pizzaOrder.printStatus();

        pizzaOrder.previousState();

    }
}
