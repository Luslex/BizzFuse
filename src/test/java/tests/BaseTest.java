package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.CompanyPage.CompanyPage;
import pages.ExplorerPage.ExplorerPage;
import pages.HomePage.HomePage;

public class BaseTest {

    public HomePage homePage = HomePage.getInstance();
    public CompanyPage companyPage = CompanyPage.getInstance();
    public ExplorerPage explorerPage = ExplorerPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void teardown() {
        BasePage.tearDown();
    }

}
