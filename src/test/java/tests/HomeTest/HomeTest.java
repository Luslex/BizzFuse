package tests.HomeTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;

public class HomeTest extends BaseTest {
    private String newURL = getBaseURL() + ".com/signup";
    private String newURL2 = getBaseURL() + ".com/login";
    private static final Logger LOG = LoggerFactory.getLogger(HomeTest.class);

    @Test
    public void signInAccounts() {
        int count = 5;
        String loginEmail = "25bhaam@gmail.com";
        String loginPassword = "dovlecel123";

        LOG.info("Verify if 'Hero' is displayed");
        Assert.assertTrue(homePage.isHeroDisplayed(), "'Hero is not displayed");

        LOG.info("Click the Register button");
        homePage.clickRegisterBtn();

        LOG.info("Type in the email input field");
        homePage.typeInEmailInputField(count);

        LOG.info("Type in the name input field");
        homePage.typeInNameInputField(count);

        LOG.info("Type in the password input field");
        homePage.typeInPasswordInputField(count);

        LOG.info("Click the Submit button");
        homePage.clickSumbitBtn();

        driver.get(newURL2);

        LOG.info("Type in the login email input field");
        homePage.typeInLoginEmail(loginEmail);

        LOG.info("Type in the login password input field");
        homePage.typeInLoginPassword(loginPassword);

        LOG.info("Click the Login button");
        homePage.clickLoginBtn();

        LOG.info("Click the Logout button");
        homePage.clickLogoutBtn();

        driver.get(newURL);

        LOG.info("Click the Company register button");
        homePage.clickCompanyRegisterBtn();

        LOG.info("Type in the company register email input field");
        homePage.typeInCompanyRegisterEmail(count);

        LOG.info("Type in the company register password input field");
        homePage.typeInCompanyRegisterPassword(count);

        LOG.info("Click the Sign Up button");
        homePage.clickSignUpBtn();

        homePage.isAlertPresent();


    }
}
