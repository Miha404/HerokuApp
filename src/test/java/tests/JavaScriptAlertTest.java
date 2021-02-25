package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JavaScriptAlertTest extends BaseTest {

    @Test
    public void javaScriptAlertTextValidation(){
        mainPage.openPage();
        driver.findElement(By.xpath("//*[contains(text(),'JavaScript Alerts')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alertText.equals("I am a JS Alert");
    }
    @Test
    public void javaScriptAlertConfirm(){
        mainPage.openPage();
        driver.findElement(By.xpath("//*[contains(text(),'JavaScript Alerts')]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Click for JS Alert')]")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alertText.equals("I am a JS Alert");
        alert.accept();
    }

}
