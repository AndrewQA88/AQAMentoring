package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestParameters {


    @Test
    public void firstTest() {
        Assert.assertEquals(4, 1);
    }

    @Test(dependsOnMethods = {"firstTest"}, alwaysRun = true)
    public void secondTestDependsOnFirst() {
        System.out.println("secondTestDependsOnFirst");
    }

    @Test(description = "third test to check description parameter ")
    public void thirdTest() {
        System.out.println("test with description");
    }

    @Test(enabled = true)
    public void enable() {
        System.out.println("enable true");
    }
}
