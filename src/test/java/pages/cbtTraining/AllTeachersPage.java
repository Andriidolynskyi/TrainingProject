package pages.cbtTraining;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AllTeachersPage {

    public AllTeachersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//div[@class='form-group custom-mt-form-group'])[1]/input")
    public WebElement teacherIdSearchField;

    @FindBy(xpath = "//a[.=' Search ']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@class='avatar']")
    public WebElement avatar;

}
