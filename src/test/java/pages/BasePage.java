package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(BasePage.class);
    public static WebDriver driver;

    public static void setUp() {
        LOG.info("Start test");
        System.setProperty("webdriver.chrome.driver", "C://Webdrivers/chromedriver111.exe");
        driver = new ChromeDriver();
        String url = "https://bizzfuse.herokuapp.com";
        driver.get(url);

        LOG.info("Open browser maximize");
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        LOG.info("Close the browser");
        driver.quit();
    }

    public static String returnBaseURL() {
        return "https://bizzfuse.herokuapp.com/";
    }

    public static String getBaseURL() {
        String baseURL = returnBaseURL();
        if (baseURL != null) {
            return baseURL.replace(".com/", "");
        }
        return baseURL;
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
