package pages.HomePage;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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
    private By registerBtn = By.xpath("//a[@href='/signup']");
    private By emailInputField = By.id("user_email");
    private By nameInputField = By.id("user_name");
    private By passwordInputField = By.id("user_pass");
    private By submitBtn = By.xpath("//input[@type='submit']");
    private By loginBtn = By.id("button1");
    private By companyRegisterBtn = By.xpath("//button[contains(text(),'Company')]");
    private By logoutBtn = By.xpath("//a[@href='/logout']");


    public boolean isHeroDisplayed() {
        LOG.info("Verify if 'Hero' is displayed");
        return driver.findElement(hero).isDisplayed();

    }

    public void clickRegisterBtn() {
        LOG.info("Click the Register button");
        driver.findElement(registerBtn).click();
    }

    public void typeInEmailInputField(int count) {
        LOG.info("Type in the email input field");
        String email = RandomStringUtils.randomAlphabetic(count) + "@gmail.com";
        driver.findElement(emailInputField).sendKeys(email);
    }

    public void typeInNameInputField(int count) {
        LOG.info("Type in the name input field");
        String nume = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(nameInputField).sendKeys(nume);
    }

    public void typeInPasswordInputField(int count) {
        LOG.info("Type in the password input field");
        String password = RandomStringUtils.randomAlphanumeric(count);
        driver.findElement(passwordInputField).sendKeys(password);
    }

    public void clickSumbitBtn() {
        LOG.info("Click the Submit button");
    }

    public void typeInLoginEmail(String loginEmail) {
        LOG.info("Type in the login email input field");
        driver.findElement(emailInputField).sendKeys(loginEmail);
    }

    public void typeInLoginPassword(String loginPassword) {
        LOG.info("Type in the login password input field");
        driver.findElement(passwordInputField).sendKeys(loginPassword);
    }

    public void clickLoginBtn() {
        LOG.info("Click the Login button");
        driver.findElement(loginBtn).click();
    }

    public void clickLogoutBtn() {
        LOG.info("Click the Logout button");
        driver.findElement(logoutBtn).click();
    }

    public void clickCompanyRegisterBtn() {
        LOG.info("Click the Company register button");
        driver.findElement(companyRegisterBtn).click();
    }

    public void typeInCompanyRegisterEmail(int count) {
        LOG.info("Type in the company register email input field");
        String email = RandomStringUtils.randomAlphabetic(count) + "@gmail.com";
        driver.findElement(emailInputField).sendKeys(email);
    }

    public void typeInCompanyRegisterPassword(int count) {
        LOG.info("Type in the company register password input field");
        String password = RandomStringUtils.randomAlphabetic(count);
        driver.findElement(passwordInputField).sendKeys(password);
    }

    public void clickSignUpBtn() {
        LOG.info("Click the Sign Up button");
        driver.findElement(submitBtn).click();

    }

    public boolean isAlertPresent()
    {
        try
        {
            driver.switchTo().alert();
            driver.switchTo().alert().accept();
            return true;
        }
        catch (NoAlertPresentException Ex)
        {
            return false;
        }
    }

}
