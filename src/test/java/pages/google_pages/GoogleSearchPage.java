package pages.google_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleSearchPage {
    //Create connection in between the driver and object of the class
    public GoogleSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //We nee to locate webElements
    @FindBy(name = "q")
    public WebElement googleSearchField;


}
