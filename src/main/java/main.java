import BuilderDesignPattern.BuilderPatternDemo;
import FactoryDesignPattern.FactoryPatternDemo;
import ObserverDesignPattern.ObserverDesignPatternDemo;

public class main {

    public static void main(String[] args) {
        System.out.println("FACTORY DESIGN PATTERN ");
        FactoryPatternDemo.tryOutFactoryPattern();
        System.out.println("\nOBSERVER DESIGN PATTERN ");
        ObserverDesignPatternDemo.tryOutObserver();
        System.out.println("\nBUILDER DESIGN PATTERN ");
        BuilderPatternDemo.tryOutBuilderPattern();
    }
}
