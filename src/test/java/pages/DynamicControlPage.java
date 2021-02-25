package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicControlPage extends BasePage{


    public DynamicControlPage(WebDriver driver) {
        super(driver);
    }

    public void DynamicControlPageSetCheckbox(){
        driver.findElement(By.id("checkbox")).click();
    }

}
