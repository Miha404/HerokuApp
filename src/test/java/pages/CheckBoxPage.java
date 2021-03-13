package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CheckBoxPage extends BasePage{

    public static final By CHECKBOX_CONTENT = By.id("content");
    public static final By CHECKBOX_ONE = By.xpath("(//*/form/input)[1]");
    public static final By CHECKBOX_TWO = By.xpath("(//*/form/input)[2]");
    public static final By CHECKBOX_ONE_CHECKED = By.xpath("(//*/form/input)[1]['checked']");
    public static final By CHECKBOX_TWO_CHECKED = By.xpath("(//*/form/input)[2]['checked']");

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CHECKBOX_CONTENT));
        return true;
    }

    public boolean clickCheckbox(int checkboxNumber){
        if (checkboxNumber == 1) {
            driver.findElement(CHECKBOX_ONE).click();
            return driver.findElements(CHECKBOX_ONE_CHECKED) != null;
        }else {
            if (checkboxNumber == 2) {
                driver.findElement(CHECKBOX_TWO).click();
                return driver.findElements(CHECKBOX_TWO_CHECKED) != null;
            }
        }
        return false;
    }


}
