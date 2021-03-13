package tests;

import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.reporters.jq.BasePanel;
import pages.*;
import steps.*;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    MainPage mainPage;
    ContextMenuPage contextMenuPage;
    Actions actions;
    CheckBoxPage checkBoxPage;
    DynamicControlPage dynamicControlPage;
    WebDriverWait wait;
    FileUploadPage fileUploadPage;
    DynamicControlPageSteps dynamicControlPageSteps;
    MainPageSteps mainPageSteps;
    FileUploadPageSteps fileUploadPageSteps;
    ContextMenuSteps contextMenuSteps;
    CheckBoxSteps checkBoxSteps;


    public BaseTest() {
    }



    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        contextMenuPage = new ContextMenuPage(driver);
        dynamicControlPage = new DynamicControlPage(driver);
        wait = new WebDriverWait(driver, 10);
        fileUploadPage = new FileUploadPage(driver);
        dynamicControlPageSteps = new DynamicControlPageSteps(dynamicControlPage);
        mainPageSteps = new MainPageSteps(mainPage);
        fileUploadPageSteps = new FileUploadPageSteps(fileUploadPage);
        contextMenuSteps = new ContextMenuSteps(contextMenuPage);
        checkBoxSteps = new CheckBoxSteps(checkBoxPage);
    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
