package tests.ExplorerTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseURL;

public class ExplorerTest extends BaseTest {
    private String newURL = getBaseURL() + ".com/home_user";

    private static final Logger LOG = LoggerFactory.getLogger(ExplorerTest.class);

    @Test
    public void loginAsExplorer() {
        String loginEmail = "25bhaam@gmail.com";
        String loginPassword = "dovlecel123";
        String investNum = "9865";


        driver.get(newURL);

        LOG.info("Click the Login Slide button");
        explorerPage.clickLoginTabBtn();

        LOG.info("Click the Login as Explorer button");
        explorerPage.clickLoginAsExplorerBtn();

        LOG.info("Type in the login email input field");
        explorerPage.typeInLoginEmail(loginEmail);

        LOG.info("Type in the login password input field");
        explorerPage.typeInLoginPassword(loginPassword);

        LOG.info("Click the Login button");
        explorerPage.clickLoginBtn();

        LOG.info("Click the 'Take a look!' button");
        explorerPage.clickTakeALookBtn();

        LOG.info("Click the Axiobit invest button");
        explorerPage.clickAxiobitInvestBtn();

        LOG.info("Type in the Invest input bar");
        explorerPage.typeInInvestInputBar(investNum);

        LOG.info("Click the Invest button");
        explorerPage.clickInvestBtn();

        driver.get(newURL);

        LOG.info("Click the Team hyperlink");
        explorerPage.clickTeamBtn();

        driver.get(newURL);

        LOG.info("Click the Terms And Conditions hyperlink");
        explorerPage.clickTermsAndConditionsBtn();

        driver.get(newURL);

        LOG.info("Click the Privacy hyperlink");
        explorerPage.clickPrivacyBtn();

        LOG.info("Click the Facebook icon");
        explorerPage.clickFacebookIcon();

        driver.get(newURL);

        LOG.info("Click the Twitter icon");
        explorerPage.clickTwitterIcon();

        driver.get(newURL);

        LOG.info("Click the Instagram icon");
        explorerPage.clickInstagramIcon();

        LOG.info("Click the Linkedin icon");
        explorerPage.clickLinkedinIcon();

    }
}
