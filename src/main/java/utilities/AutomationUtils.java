package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutomationUtils {


    public void getWebCellDataBasedonColValue(WebElement table, String VerNo) {
        List<WebElement> versionList = table.findElements(By.cssSelector(".>tbody>tr>td:nth-of-type(2)>a"));

        for (WebElement verVal : versionList) {

            System.out.println("your version is " + " " + verVal.getText());


        }


    }


}



