package PageLayer;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZooplaForSalePage extends BasePage {

    @FindBy(how = How.CSS, using = "div.c-cFivTV>h1")
    public WebElement PropertiesForSaleLableText;


    public void isDisplayPropertiesForSaleLableText() {

        if (PropertiesForSaleLableText.isDisplayed()) {

            System.out.println("Welcome to page" + " " + PropertiesForSaleLableText.getText());


        }
    }


}
