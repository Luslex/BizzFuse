package pages.ExplorerPage;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ProfilePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ProfilePage.class);
    public static ProfilePage instance;

    private ProfilePage() {
    }

    public static ProfilePage getInstance() {
        if (instance == null) {
            instance = new ProfilePage();
        }
        return instance;
    }

    private By profileTab = By.xpath("//a[@href='/profile']");
    private By firstName = By.id("_first_name");
    private By lastName = By.id("_last_name");
    private By companyName = By.id("_company_name");
    private By companyLocation = By.id("_company_location");
    private By companyPosition = By.id("_company_position");
    private By linkedinLink = By.id("_linkedin_link");
    private By phoneNumber = By.id("_phone");

    public void clickProfileTabBtn(){
        LOG.info("Click the Profile Tab buttton button");
        driver.findElement(profileTab).click();
    }

    public void typeInFirstName(int count) {
        LOG.info("Type in the First Name input field");
        String random = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(firstName).sendKeys(random);
    }
    public void typeInLastName(int count) {
        LOG.info("Type in the First Name input field");
        String random = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(lastName).sendKeys(random);
    }
    public void typeInCompanyName(int count) {
        LOG.info("Type in the Last Name input field");
        String random = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(companyName).sendKeys(random);
    }
    public void typeInCompanyLocation(int count) {
        LOG.info("Type in the Company Location input field");
        String random = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(companyLocation).sendKeys(random);
    }
    public void typeInCompanyPosition(int count) {
        LOG.info("Type in the Company Position input field");
        String random = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(companyPosition).sendKeys(random);
    }

    public void typeInLinkedinLink(int count) {
        LOG.info("Type in the LinkedIn Link input field");
        String random = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(linkedinLink).sendKeys(random);
    }
    public void typeInPhoneNumber(int count2) {
        LOG.info("Type in the Phone Number input field");
        String random = RandomStringUtils.randomAlphanumeric(count2);
        driver.findElement(phoneNumber).sendKeys(random);
    }

}
