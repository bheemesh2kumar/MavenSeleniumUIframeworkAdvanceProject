package base;

import org.openqa.selenium.WebDriver;

public class DriverContext {

    public static WebDriver driver;
    public static BrowserBase BrowserBase;

    public static void setBrowserBase(base.BrowserBase browserBase) {
        BrowserBase = browserBase;
    }


    public static void setDriver(WebDriver driver) {
        DriverContext.driver = driver;
    }


}
