package tests.HomeTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class HomeTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(HomeTest.class);

    @Test
    public void checkIfImageIsDisplayed(){

        LOG.info("Verify if 'Hero' is displayed");
        Assert.assertTrue(homePage.isHeroDisplayed(), "'Hero is not displayed");

    }
}
