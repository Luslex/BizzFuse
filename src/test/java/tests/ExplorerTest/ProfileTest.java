package tests.ExplorerTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseURL;

public class ProfileTest extends BaseTest {
    private String newURL = getBaseURL() + ".com/home_user";

    private static final Logger LOG = LoggerFactory.getLogger(ProfileTest.class);

    @Test
    public void loginAsExplorer() {
        int count = 5;
        int count2 = 10;

        LOG.info("Click the Profile Tab buttton button");
        profilePage.clickProfileTabBtn();

        LOG.info("Type in the First Name input field");
        profilePage.typeInFirstName(count);

        LOG.info("Type in the Last Name input field");
        profilePage.typeInLastName(count);

        LOG.info("Type in the Last Name input field");
        profilePage.typeInCompanyName(count);

        LOG.info("Type in the Company Location input field");
        profilePage.typeInCompanyLocation(count);

        LOG.info("Type in the Company Position input field");
        profilePage.typeInCompanyPosition(count);

        LOG.info("Type in the LinkedIn Link input field");
        profilePage.typeInLinkedinLink(count);

        LOG.info("Type in the Phone Number input field");
        profilePage.typeInPhoneNumber(count2);



    }
}
