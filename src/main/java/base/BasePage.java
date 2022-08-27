package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage extends Base {

    public BasePage() {
        PageFactory.initElements(DriverContext.driver, this);
    }


    public <Tpage extends BasePage> Tpage as(Class<Tpage> page) {
        try {
            return (Tpage) this;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


    public void getsuggestedElementsbySearch(List<WebElement> ele) {

    }


}
