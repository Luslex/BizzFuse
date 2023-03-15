package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.HomePage.HomePage;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();

    @BeforeSuite
    public void init(){
        BasePage.setUp();
    }

    @AfterSuite
    public void teardown(){
        BasePage.tearDown();
    }

}
