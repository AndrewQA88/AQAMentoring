package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {


    @DataProvider(name = "usernames", parallel = true)
    public Object[][] username() {
        return new Object[][]{{"Andrii"}, {"Ben"}, {"Ivan"}};
    }

    @Test(dataProvider = "usernames")
    public void myTest(String name) {
        System.out.println("Username: " + name);
    }
}
