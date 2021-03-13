package steps;

import pages.*;

public class MainPageSteps extends BaseSteps{
    public MainPageSteps(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    MainPage mainPage;

    public MainPage openMainPageStep(){
        mainPage.openPage();
        validateIsPageOpened(mainPage);
        return mainPage;
    }

    public DynamicControlPage openDynamicControlStep() {
        DynamicControlPage dynamicControlPage = mainPage.openDynamicControls();
        validateIsPageOpened(dynamicControlPage);
        return dynamicControlPage;
    }

    public FileUploadPage openFileUploadPageStep() {
        return mainPage.openFileUploadPage();
    }

    public ContextMenuPage openContextMenuPageStep() {
        return mainPage.openContextMenu();
    }

    public CheckBoxPage openCheckboxPageStep(){
        return mainPage.openCheckBox();
    }

    //TODO improve with abstract Base class

}
