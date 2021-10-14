package testng;

import org.testng.annotations.Test;

public class Parameters {

    @org.testng.annotations.Parameters("parameter-firstname")
    @Test
    public void firstName(String name) {
        System.out.println("First name is " + name);
    }

    @org.testng.annotations.Parameters("parameter-lastname")
    @Test
    public void lastName(String name) {
        System.out.println("Second name is " + name);
    }

}
