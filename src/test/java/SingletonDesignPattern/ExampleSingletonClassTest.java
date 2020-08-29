package SingletonDesignPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleSingletonClassTest {

    @Test
    public void test_If_All_Object_Have_Same_Instance(){
        ExampleSingletonClass testObject1 = ExampleSingletonClass.getInstance();
        ExampleSingletonClass testObject2 = ExampleSingletonClass.getInstance();
        ExampleSingletonClass testObject3 = ExampleSingletonClass.getInstance();

        // assertSame doesnt invoke equals. it verifies if testObject1 == testObject2
        // if testObject1 == testObject2 and testObject1 == testObject 3 then testObject2 == testObject3.
        assertSame(testObject1, testObject2);
        assertSame(testObject1, testObject3);
    }
}