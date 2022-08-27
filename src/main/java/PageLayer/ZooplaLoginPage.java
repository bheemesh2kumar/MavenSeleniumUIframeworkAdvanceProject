package PageLayer;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ZooplaLoginPage extends BasePage {

    @FindBy(how = How.CSS, using = "nav[data-testid='header']>div:nth-of-type(3)>div:last-of-type>ul>li:nth-of-type(3)>a")
    public WebElement signlink;

    @FindBy(how = How.CSS, using = "input[data-testid='email-field-input']")
    public WebElement EmailTextbox;

    @FindBy(how = How.CSS, using = "input[data-testid='password-field']")
    public WebElement PwdTextbox;

    @FindBy(how = How.CSS, using = "button[data-testid='signin-button']")
    public WebElement Signbutton;


    public BasePage logintoZoopla(String userName, String pwd) {
        signlink.click();
        EmailTextbox.sendKeys(userName);
        PwdTextbox.sendKeys(pwd);
        Signbutton.click();
        return getInstance(ZooplaHomePage.class);
    }


}
