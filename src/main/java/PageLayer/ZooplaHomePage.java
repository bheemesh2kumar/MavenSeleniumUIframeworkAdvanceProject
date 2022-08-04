package PageLayer;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZooplaHomePage extends BasePage {

    public ZooplaHomePage() {
    }


    @FindBy(how = How.CSS, using = "div.PJLV.PJLV-ieDcChf-css>div>ul>li:last-of-type>a>span")
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
