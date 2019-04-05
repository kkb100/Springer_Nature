package uk.co.nature.browserConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {


    protected static WebDriver driver;

    public WebDriver initialiseBroswer(String browserName) {

        String systemPath = System.getProperty("user.dir");
        if (browserName.equalsIgnoreCase("firefox")) {
            String firefoxPath = systemPath + "/Drivers/Firefox/geckodriver-v0.11.1-win64/geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", firefoxPath);
            driver = new FirefoxDriver();

        } else if (browserName.equalsIgnoreCase("chrome")) {
            String chromePath = systemPath + "/Drivers/Chrome/chromedriver_win32/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
        }
        // driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

        return driver;
    }


    public void tearDown() {
        if (driver != null)
            driver.quit();
    }


}
