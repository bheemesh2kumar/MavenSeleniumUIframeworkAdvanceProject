package regressiontests;

import PageLayer.ZooplaHomePage;
import PageLayer.ZooplaLoginPage;
import base.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.ExcelUtility;

import java.time.Duration;

public class ZooplaLoginPageTest extends FrameworkIntialize {
    ExcelUtility ExcelUtility;


    @BeforeMethod
    public void setup() {
        intializeBrowser(BrowserType.Chrome);
        DriverContext.BrowserBase.launchUrl("https://www.zoopla.co.uk/");
        DriverContext.BrowserBase.maximizewindow();
        DriverContext.BrowserBase.pageLoadtimeout(10);
        ExcelUtility = new ExcelUtility(System.getProperty("user.dir") + "\\src\\main\\java\\testdata\\sampletestdata.xlsx", "Sheet1");

    }


    @Test
    public void validateifuserlogsintoZoopaHomepage() throws Exception {
        ZooplaLoginPage ZooplaLoginPageref = getInstance(ZooplaLoginPage.class);
        currentPage = ZooplaLoginPageref.logintoZoopla("manu.bheemesh@gmail.com", "@satyarao1");
        Thread.sleep(5000);
        String myzooplaLable = currentPage.as(ZooplaHomePage.class).MyZooplalableText.getText();
        System.out.println("Hello user you logged in successfully" + " " + myzooplaLable);
    }


    @Test
    public void validateversioList() throws Exception {
        ZooplaLoginPage zooplaLoginPage = getInstance(ZooplaLoginPage.class);
        currentPage = zooplaLoginPage.logintoZoopla("manu.bheemesh@gmail.com", "@satyarao1");
        Thread.sleep(5000);
        String myzooplaLable = currentPage.as(ZooplaHomePage.class).MyZooplalableText.getText();
        System.out.println("Hello user you logged in successfully and use me if your u want you out" + " " + myzooplaLable);
    }


    @AfterMethod
    public void teardown() {
        DriverContext.driver.quit();
    }


}
