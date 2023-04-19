package pages.ExplorerPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;



public class ExplorerPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(ExplorerPage.class);
    public static ExplorerPage instance;

    private ExplorerPage() {
    }

    public static ExplorerPage getInstance() {
        if (instance == null) {
            instance = new ExplorerPage();
        }
        return instance;
    }
    private By emailInputField = By.id("user_email");
    private By passwordInputField = By.id("user_pass");
    private By loginBtn = By.id("button1");
    private By loginSlideDown= By.xpath("//a[@href='#bookmark1']");
    private By loginAsExplorerBtn = By.xpath("//a[@href='/login']");
    private By takeALookBtn = By.xpath("//button[contains(text(),'Take')]");
    private By axiobitInvestBtn = By.xpath("//a[@href='/project_to_invest/14']");
    private By investInputBar = By.id("fname");
    private By investBtn = By.xpath("//input[@class='btn']");
    private By teamBtn = By.xpath("//a[@href='/team']");
    private By termsAndConditionsBtn = By.xpath("//a[@href='/terms-and-conditions/en']");
    private By privacyBtn = By.xpath("//a[@href='/privacy-policy/en']");
    private By facebookIcon = By.xpath("//a[@class='fa fa-facebook']");
    private By twitterIcon = By.xpath("//a[@class='fa fa-twitter']");
    private By instagramIcon = By.xpath("//a[@class='fa fa-instagram']");
    private By linkedinIcon = By.xpath("//a[@class='fa fa-linkedin']");

    public void clickLoginTabBtn(){
        LOG.info("Click the Login Slide button");
        driver.findElement(loginSlideDown).click();
    }

    public void clickLoginAsExplorerBtn(){
        LOG.info("Click the Login as Explorer button");
        sleep(1000);
        driver.findElement(loginAsExplorerBtn).click();
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

    public void clickTakeALookBtn(){
        LOG.info("Click the 'Take a look!' button");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        sleep(1000);
        driver.findElement(takeALookBtn).click();
    }

    public void clickAxiobitInvestBtn(){
        LOG.info("Click the Axiobit invest button");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1050)", "");
        sleep(1000);
        driver.findElement(axiobitInvestBtn).click();
    }

    public void typeInInvestInputBar(String investNum){
        LOG.info("Type in the Invest input bar");
        driver.findElement(investInputBar).sendKeys(investNum);
        sleep(1000);
    }

    public void clickInvestBtn(){
        LOG.info("Click the Invest button");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1050)", "");
        sleep(1000);
        driver.findElement(investBtn).click();
    }

    public void clickTeamBtn(){
        LOG.info("Click the Team hyperlink");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,99999)", "");
        sleep(1000);
        driver.findElement(teamBtn).click();
    }

    public void clickTermsAndConditionsBtn(){
        LOG.info("Click the Terms And Conditions hyperlink");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,99999)", "");
        sleep(1000);
        driver.findElement(termsAndConditionsBtn).click();
    }

    public void clickPrivacyBtn(){
        LOG.info("Click the Privacy hyperlink");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,99999)", "");
        sleep(1000);
        driver.findElement(privacyBtn).click();
    }

    public void clickFacebookIcon(){
        LOG.info("Click the Facebook icon");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,99999)", "");
        sleep(1000);
        driver.findElement(facebookIcon).click();
    }

    public void clickTwitterIcon(){
        LOG.info("Click the Twitter icon");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,99999)", "");
        sleep(1000);
        driver.findElement(twitterIcon).click();
    }

    public void clickInstagramIcon(){
        LOG.info("Click the Instagram icon");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,99999)", "");
        sleep(1000);
        driver.findElement(instagramIcon).click();
    }

    public void clickLinkedinIcon(){
        LOG.info("Click the Linkedin icon");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,99999)", "");
        sleep(1000);
        driver.findElement(linkedinIcon).click();
    }
}
