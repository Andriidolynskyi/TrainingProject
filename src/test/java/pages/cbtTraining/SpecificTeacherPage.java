package pages.cbtTraining;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SpecificTeacherPage {

    public SpecificTeacherPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h3[@class='user-name m-t-0']")
    public WebElement fullName;

    @FindBy(xpath = "//span[.='Phone:']/..//span[@class='text']//a")
    public WebElement phoneNumber;

    @FindBy(xpath = "//span[.='Email:']/..//span[@class='text']//a")
    public WebElement emailAddress;

    @FindBy(xpath = "//span[.='Batch:']/..//span[@class='text']//a")
    public WebElement batch;

    @FindBy(xpath = "//span[.='Birthday:']/..//span[@class='text']")
    public WebElement birthDay;

    @FindBy(xpath = "//span[.='Join Date:']/..//span[@class='text']")
    public WebElement joinDate;

    @FindBy(xpath = "//span[.='Address:']/..//span[@class='text']")
    public WebElement address;

    @FindBy(xpath = "//span[.='Gender:']/..//span[@class='text']")
    public WebElement gender;

    @FindBy(xpath = "//span[.='Salary:']/..//span[@class='text']")
    public WebElement salary;

    @FindBy(xpath = "//span[.='Section:']/..//span[@class='text']")
    public WebElement section;

    @FindBy(xpath = "//span[.='Subject:']/..//span[@class='text']")
    public WebElement subject;

}
