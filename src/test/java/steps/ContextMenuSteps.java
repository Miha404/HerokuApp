package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.ContextMenuPage;

public class ContextMenuSteps {
    ContextMenuPage contextMenuPage;

    public ContextMenuSteps(ContextMenuPage contextMenuPage) {
        this.contextMenuPage = contextMenuPage;
    }

    public void doubleClickStep(){
        contextMenuPage.doubleClick();
        contextMenuPage.alertTextValidation();
    }
}
