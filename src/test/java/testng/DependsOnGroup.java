package testng;

import org.testng.annotations.Test;

public class DependsOnGroup {

    @Test(groups = "preconditions")
    public void setData() {
        System.out.println("1. Set test data");
    }

    @Test(groups = "preconditions", dependsOnMethods = "setData")
    public void reset() {
        System.out.println("2. Reset state");
    }

    @Test(dependsOnGroups = {"preconditions"}, groups = "tests")
    public void avatar() {
        System.out.println("3. First test");
    }

    @Test(dependsOnGroups = {"preconditions"}, groups = "tests", dependsOnMethods = "avatar", alwaysRun = true, invocationCount = 3, invocationTimeOut = 1000)
    public void action() {
        System.out.println("4. Second test");
    }
}
