package PageLayer;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZooplaHomePage extends BasePage {

    public ZooplaHomePage() {
    }


    @FindBy(how = How.CSS, using = "main#main-content>div:first-of-type>div>div>div>div:first-of-type>div>a>span")
    public WebElement MyZooplalableText;

    @FindBy(how = How.CSS, using = "div.c-PJLV.c-PJLV-icHtgLL-css>ul>li:first-of-type>a")
    public WebElement ForSaleLInk;

    public String getMyZooplalableText() {
        return MyZooplalableText.getText();
    }

    public BasePage clickForSaleLInk() {
        ForSaleLInk.click();
        return getInstance(ZooplaForSalePage.class);
    }


}
