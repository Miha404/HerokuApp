package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ContextMenuPage extends BasePage {
    public static final By HOT_SPOT = By.id("hot-spot");
    Actions actions;

    public static final By CONTEXT_MENU_CONTENT = By.id("content");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CONTEXT_MENU_CONTENT));
        return true;
    }

    public void doubleClick(){
        actions = new Actions(driver);
        actions.contextClick(driver.findElement(HOT_SPOT)).perform();
    }

    public void alertTextValidation(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");
        alert.accept();
    }


}
