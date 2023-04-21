package tests.CompanyTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;

public class CompanyTest extends BaseTest {
    private String newURL = getBaseURL() + ".com  ";
    String url = "https://bizzfuse.herokuapp.com";
    private static final Logger LOG = LoggerFactory.getLogger(CompanyTest.class);

    @Test
    public void loginAsCompany() {
        String loginEmail = "25bhaam@gmail.com";
        String loginPassword = "dovlecel123";

        driver.get(url);


        LOG.info("Click the Login Slide button");
        companyPage.clickLoginTabBtn();

        LOG.info("Click the Login as Company button");
        companyPage.clickLoginAsCompanyBtn();

        LOG.info("Type in the login email input field");
        companyPage.typeInLoginEmail(loginEmail);

        LOG.info("Type in the login password input field");
        companyPage.typeInLoginPassword(loginPassword);

        LOG.info("Click the Login button");
        companyPage.clickLoginBtn();

    }
}
