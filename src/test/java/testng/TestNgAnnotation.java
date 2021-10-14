package testng;

import org.testng.annotations.*;
import testng.Color;


public class TestNgAnnotation {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println(Color.ANSI_GREEN + "it's beforeSuite: set configurations for tests by admin for particular suite(helpful if run is from test suite xml)" + Color.ANSI_RESET);
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println(Color.ANSI_RED + "it's beforeClass:set configurations for tests by admin for particular class(helpful if run is from test suite xml)" + Color.ANSI_RESET);
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println(Color.ANSI_BLUE + "it's beforeTest: set configurations for tests by admin" + Color.ANSI_RESET);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(Color.ANSI_YELLOW + "it's beforeMethod: login to application" + Color.ANSI_RESET);
    }

    @Test
    public void firstTest() {
        System.out.println("firstTest");
    }

    @Test
    public void secondTest() {
        System.out.println("secondTest");
    }

    @Test
    public void thirdTest() {
        System.out.println("thirdTest");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(Color.ANSI_YELLOW + "it's afterMethod: logout" + Color.ANSI_RESET);
    }

    @AfterTest
    public void afterTest() {
        System.out.println(Color.ANSI_BLUE + "it's afterTest: reset env configuration by admin" + Color.ANSI_RESET);
    }

    @AfterClass
    public void afterClass() {
        System.out.println(Color.ANSI_RED + "it's afterClass: reset env configuration by admin for particular class(helpful if run is from test suite xml" + Color.ANSI_RESET);
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(Color.ANSI_GREEN + "it's afterSuite: reset env configuration by admin for particular suite(helpful if run is from test suite xml)" + Color.ANSI_RESET);
    }
}
