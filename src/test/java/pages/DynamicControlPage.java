package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicControlPage extends BasePage {


    public static final By CHECKBOX = By.cssSelector("#checkbox>input");
    public static final By REMOVE_BUTTON = By.cssSelector("#checkbox-example>button");
    public static final By INPUT = By.cssSelector("#input-example>input");
    public static final By ENABLE_BUTTON = By.cssSelector("#input-example>button");
    public static final By DYNAMIC_CONTROL_CONTENT = By.id("input-example");


    public DynamicControlPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DynamicControlPage.DYNAMIC_CONTROL_CONTENT));
        return true;
    }


    public boolean setCheckbox() {
        WebElement checkbox = driver.findElement(CHECKBOX);
        checkbox.click();
        return checkbox.isSelected();
    }

    public int removeCheckbox() {
        WebElement removeButton = driver.findElement(REMOVE_BUTTON);
        removeButton.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath
                ("//form[@id='checkbox-example']/p[@id='message'][contains(.,\"It's gone!\")]")));
        return wait.until(ExpectedConditions
                .numberOfElementsToBe(By.cssSelector("form #checkbox"), 0)).size();

    }

    public void clickEnableButton() {
        WebElement enabledButton = driver.findElement(ENABLE_BUTTON);
        enabledButton.click();

    }

    public boolean inputIsEnabled() {
        wait.until(ExpectedConditions
                .presenceOfElementLocated(By.
                        xpath("//form[@id='input-example']/p[@id='message'][contains(.,\"It's enabled!\")]")));
        return driver.findElement(INPUT).isEnabled();
    }

    public boolean findInput() {
        return driver.findElement(INPUT).isDisplayed();
    }

    public String inputIsDisabled() {
        return driver.findElement(INPUT).getAttribute("disabled");
    }

    public void DynamicControlPageFindElementByCss(String elementLocator) {
        driver.findElement(By.cssSelector(elementLocator));
    }

}
