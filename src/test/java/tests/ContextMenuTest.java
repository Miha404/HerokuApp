package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import pages.MainPage;

public class ContextMenuTest extends BaseTest{

    @Test
    public void contextMenuDoubleClick(){
        mainPage.openPage();
        mainPageSteps.openContextMenuPageStep();

        contextMenuSteps.doubleClickStep();
    }

}
