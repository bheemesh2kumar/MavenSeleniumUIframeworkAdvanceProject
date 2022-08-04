package base;

import org.openqa.selenium.support.PageFactory;

public class Base {

    public static BasePage currentPage;


    public <Tpage extends BasePage> Tpage getInstance(Class<Tpage> page) {
        try {

            Object obj = PageFactory.initElements(DriverContext.driver, page);
            return page.cast(obj);

        } catch (Exception ex) {
           ex.printStackTrace();
        }

        return null;
    }


}
