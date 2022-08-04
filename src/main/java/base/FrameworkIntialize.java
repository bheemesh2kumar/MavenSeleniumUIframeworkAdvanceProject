package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FrameworkIntialize extends Base {

    WebDriver driver;


    public void intializeBrowser(BrowserType BrowserType) {
        switch (BrowserType) {
            case Firefox: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            case Chrome: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case IE: {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            }
            default: {
                System.out.println("your driver is not supported");
            }

        }

        DriverContext.setDriver(driver);
        DriverContext.setBrowserBase(new BrowserBase(driver));


    }


}
