import BuilderDesignPattern.BuilderPatternDemo;
import FactoryDesignPattern.FactoryPatternDemo;
import ObserverDesignPattern.ObserverDesignPatternDemo;
import StateDesignPattern.StateDesignPatternDemo;
import StrategyDesignPattern.StrategyDesignPatternDemo;

public class main {

    public static void main(String[] args) {
        System.out.println("FACTORY DESIGN PATTERN ");
        FactoryPatternDemo.tryOutFactoryPattern();
        System.out.println("\nOBSERVER DESIGN PATTERN ");
        ObserverDesignPatternDemo.tryOutObserver();
        System.out.println("\nBUILDER DESIGN PATTERN ");
        BuilderPatternDemo.tryOutBuilderPattern();
        System.out.println("\nSTRATEGY DESIGN PATTERN");
        StrategyDesignPatternDemo.tryOutStrategyDesignPattern();
        System.out.println("\nSTATE DESIGN PATTERN");
        StateDesignPatternDemo.tryOutStateDesignPattern();
    }
}
