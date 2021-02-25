package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest{

    @Test
    public void clickCheckBoxOne(){
        mainPage.openPage();
        checkBoxPage = mainPage.openCheckBox();
        checkBoxPage.CheckBoxSetOne();
    }

}
