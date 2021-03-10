package steps;

import pages.ContextMenuPage;
import pages.DynamicControlPage;
import pages.FileUploadPage;
import pages.MainPage;

public class MainPageSteps {
    public MainPageSteps(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    MainPage mainPage;

    public DynamicControlPage openDynamicControlStep() {
        return mainPage.openDynamicControls();
    }

    public FileUploadPage openFileUploadPageStep() {
        return mainPage.openFileUploadPage();
    }

    public ContextMenuPage openContextMenuPageStep() {
        return mainPage.openContextMenu();
    }

    //TODO improve with abstract Base class

}
