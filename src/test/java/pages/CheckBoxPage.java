package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends BasePage{

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public void CheckBoxSetOne(){
        driver.findElement(By.xpath("(//*/form/input)[1]")).click();
    }

}
