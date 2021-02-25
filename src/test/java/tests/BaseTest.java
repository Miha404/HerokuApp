package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import pages.MainPage;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    WebDriver driver;
    MainPage mainPage;
    ContextMenuPage contextMenuPage;
    Actions actions;



    public BaseTest() {
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        contextMenuPage = new ContextMenuPage(driver);

    }

    @AfterMethod
    public void close() {
        driver.quit();
    }
}
