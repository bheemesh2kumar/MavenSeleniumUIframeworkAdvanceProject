package PageLayer;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZooplaRealtimeListingsServicePage extends BasePage {

    public ZooplaRealtimeListingsServicePage() {
    }

    @FindBy(how = How.CSS, using = "div.container>h1")
    public WebElement RealtimeListingsServicepageHeadingtext;


}
