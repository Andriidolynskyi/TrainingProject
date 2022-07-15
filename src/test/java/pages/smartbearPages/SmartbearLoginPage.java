package pages.smartbearPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SmartbearLoginPage {

    public SmartbearLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement loginField;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

}
