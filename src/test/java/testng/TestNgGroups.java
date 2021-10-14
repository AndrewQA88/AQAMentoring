package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import testng.Color;

public class TestNgGroups {

    @BeforeGroups(groups = {"regression", "sanity"})
    public void beforeGroup() {
        System.out.println(Color.ANSI_RED + "it's beforeGroup" + Color.ANSI_RESET);
    }

    @Test(groups = {"regression", "sanity"})
    public void firstTest() {
        System.out.println("regression and sanity groups: test 1");
    }

    @Test(groups = {"regression", "sanity"})
    public void secondTest() {
        System.out.println("regression and sanity groups: test 2");
    }

    @Test(groups = {"sanity"})
    public void thirdTest() {
        System.out.println("only sanity group: test 3");
    }

    @AfterGroups(groups = {"regression", "sanity"})
    public void afterGroup() {
        System.out.println(Color.ANSI_BLUE + "it's afterGroup" + Color.ANSI_RESET);
    }
}
