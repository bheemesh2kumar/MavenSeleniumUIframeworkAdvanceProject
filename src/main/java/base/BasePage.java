package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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





}
