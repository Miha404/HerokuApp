package tests;

import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest{

    @Test
    public void DynamicControlSetCheckbox(){
        mainPage.openPage();
        dynamicControlPage = mainPage.openDynamicControls();
        dynamicControlPage.DynamicControlPageSetCheckbox();
    }

}
