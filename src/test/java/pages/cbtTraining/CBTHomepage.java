package pages.cbtTraining;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CBTHomepage {

    public CBTHomepage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.=' Teachers']")
    public WebElement teachersModule;

    @FindBy(xpath = "//ul[@class='list-unstyled']/li/a[.='All Teacher']")
    public WebElement allTeachersModule;

    @FindBy(xpath = "//span[.=' Students']")
    public WebElement studentModule;

    @FindBy(xpath = "//a[.='All Students']")
    public WebElement allStudent;

    @FindBy(xpath = "//a[.='Add Student']")
    public WebElement addStudent;

}
