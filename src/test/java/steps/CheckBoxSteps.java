package steps;

import org.testng.Assert;
import pages.CheckBoxPage;

public class CheckBoxSteps {
    CheckBoxPage checkBoxPage;

    public CheckBoxSteps(CheckBoxPage checkBoxPage) {
        this.checkBoxPage = checkBoxPage;
    }

    public void clickCheckboxStep(int checkboxNumber){
      //  checkBoxPage.isPageLoaded();
        Assert.assertTrue(checkBoxPage.clickCheckbox(checkboxNumber), "Checkbox is not checked");
    }

}
