package base;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BrowserBase {

    WebDriver _driver;

    public BrowserBase(WebDriver driver) {
        _driver = driver;
    }


    public void launchUrl(String url) {
        _driver.navigate().to(url);
    }

    public void maximizewindow() {
        _driver.manage().window().maximize();
    }

    public void pageLoadtimeout(int timeout) {
        _driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeout));
    }


}
