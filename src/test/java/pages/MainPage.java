package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public static final String URL = "https://the-internet.herokuapp.com/";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.get(URL);
    }

    public CheckBoxPage openCheckBox(){
        driver.findElement(By.xpath("//*[contains(text(),'Checkboxes')]")).click();
        return new CheckBoxPage(driver);
    }

    public DynamicControlPage openDynamicControls(){
        driver.findElement(By.xpath("//*[contains(text(),'Dynamic Controls')]")).click();
        return new DynamicControlPage(driver);
    }

}
