package testng;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 1)
    public void b() {
        System.out.println("first");
    }

    @Test(priority = 3)
    public void c() {
        System.out.println("third");
    }

    @Test(priority = 2)
    public void a() {
        System.out.println("second");
    }

    @Test(timeOut = 400, enabled = false)
    public void d() throws InterruptedException {
        System.out.println("It should fail");
    }
}
