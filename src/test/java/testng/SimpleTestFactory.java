package testng;

import org.testng.annotations.Factory;

public class SimpleTestFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[]{new FactoryClass(7), new FactoryClass(4)};
    }


}
