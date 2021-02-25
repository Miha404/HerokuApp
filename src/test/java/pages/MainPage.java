package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{

    public static final String URL = "https://the-internet.herokuapp.com/";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openPage(){
        driver.get(URL);
    }

}
