package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JavaScriptsAlertsPage extends BasePage{

    public static final By ALERT_CONTENT = By.id("content");

    public JavaScriptsAlertsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ALERT_CONTENT));
        return true;
    }
}
