package tests;

import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest{

    @Test
    public void clickCheckBoxOne(){
        mainPage.openPage();
        mainPageSteps.openCheckboxPageStep();
        checkBoxSteps.clickCheckboxStep(1);
    }

}
