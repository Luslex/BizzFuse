package pages.HomePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class HomePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    public static HomePage instance;

    private HomePage() {
    }

    public static HomePage getInstance() {
        if (instance == null) {
            instance = new HomePage();
        }
        return instance;
    }

    //Homepage
    private By hero = By.id("hero");

    public boolean isHeroDisplayed() {
        LOG.info("Verify if 'Hero' is displayed");
        return driver.findElement(hero).isDisplayed();
    }

}
