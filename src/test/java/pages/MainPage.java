package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{

    public static final String URL = "https://the-internet.herokuapp.com/";
    public static final By MAINPAGE_CONTENT = By.id("page-footer");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageLoaded() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(MAINPAGE_CONTENT));
        return true;
    }

    public void openPage(){
        driver.get(URL);
    }

    public ContextMenuPage openContextMenu(){
        driver.findElement(By.xpath("//*[contains(text(),'Context Menu')]")).click();
        return new ContextMenuPage(driver);
    }

    public CheckBoxPage openCheckBox(){
        driver.findElement(By.xpath("//*[contains(text(),'Checkboxes')]")).click();
        return new CheckBoxPage(driver);
    }

    public DynamicControlPage openDynamicControls(){
        driver.findElement(By.xpath("//*[contains(text(),'Dynamic Controls')]")).click();
        return new DynamicControlPage(driver);
    }

    public FileUploadPage openFileUploadPage(){
        driver.findElement(By.xpath("//*[contains(text(),'File Upload')]")).click();
        return new FileUploadPage(driver);
    }

}
