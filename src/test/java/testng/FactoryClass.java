package testng;

import org.testng.annotations.Test;

public class FactoryClass {

    int param;

    public FactoryClass(int param) {
        this.param = param;
    }

    @Test
    public void simpleTest1() {
        System.out.println("Simple Test1 Method." + param);
    }

    @Test
    public void simpleTest2() {
        System.out.println("Simple Test2 Method." + param);
    }
}

