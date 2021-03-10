package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckBoxPage extends BasePage{

    public static final By CHECKBOX_CONTENT = By.id("content");

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CHECKBOX_CONTENT));
        return true;
    }

    public void CheckBoxSetOne(){
        driver.findElement(By.xpath("(//*/form/input)[1]")).click();
    }

}
