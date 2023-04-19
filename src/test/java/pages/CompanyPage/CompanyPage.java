package pages.CompanyPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class CompanyPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(CompanyPage.class);
    public static CompanyPage instance;

    private CompanyPage() {
    }

    public static CompanyPage getInstance() {
        if (instance == null) {
            instance = new CompanyPage();
        }
        return instance;
    }

    private By loginSlideDown= By.xpath("//a[@href='#bookmark1']");
    private By loginAsCompanyBtn = By.xpath("//a[@href='/login_company']");
    private By emailInputField = By.id("user_email");
    private By passwordInputField = By.id("user_pass");
    private By loginBtn = By.id("button1");


    public void clickLoginTabBtn(){
        LOG.info("Click the Login Slide button");
        driver.findElement(loginSlideDown).click();
    }

    public void clickLoginAsCompanyBtn(){
        LOG.info("Click the Login as Company button");
        sleep(1000);
        driver.findElement(loginAsCompanyBtn).click();
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
}
