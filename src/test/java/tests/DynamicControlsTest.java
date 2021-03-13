package tests;

import exceptions.DisabledInputException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.DynamicControlPage;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void AllPageFunctionsTest() throws DisabledInputException {
        mainPage.openPage();
        mainPageSteps.openDynamicControlStep();
        dynamicControlPageSteps
                .setCheckboxStep()
                .removeCheckBoxStep()
                .findInputStep()
                .inputIsDisabledStep()
                .enabledInputStep();

        //TODO статья про exception  в папке source создать пакет exceptions и создать свой exception для isInputDisabled
        //
        // попробовал sendkey но как проверить exception??

    }

}
