package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.DynamicControlPage;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void AllPageFunctionsTest() {
        mainPage.openPage();
        validateIsPageOpened(mainPage);
        mainPageSteps.openDynamicControlStep();
        validateIsPageOpened(dynamicControlPage);
        dynamicControlPageSteps.setCheckboxStep();
        dynamicControlPageSteps.removeCheckBoxStep();
        dynamicControlPageSteps.findInputStep();
        dynamicControlPageSteps.inputIsDisabledStep();
        //TODO sendkey после того как он будет disabled и проверить exception который будет выпадать
        //
        // попробовал sendkey но как проверить exception??
        dynamicControlPageSteps.enabledInputStep();
    }

}
