package SingletonDesignPattern;

public class ExampleSingletonClass {

    private static ExampleSingletonClass INSTANCE;

    private ExampleSingletonClass(){

    }

    // example of lazy loading singleton
    public static ExampleSingletonClass getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ExampleSingletonClass();
        }
        return INSTANCE;
    }
}
