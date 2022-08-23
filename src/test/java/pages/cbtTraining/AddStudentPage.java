package pages.cbtTraining;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddStudentPage {

    public AddStudentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//label[.='Firstname']/../input")
    public WebElement firstNameField;

    @FindBy(xpath = "//label[.='Lastname']/../input")
    public WebElement lastNameField;

    @FindBy(xpath = "//label[.='Email']/../input")
    public WebElement emailField;

    @FindBy(xpath = "//label[.='Joining Date']/../input")
    public WebElement joinDateField;

    @FindBy(xpath = "//label[.='Password']/../input")
    public WebElement passwordField;

    @FindBy(xpath = "//label[.='Comfirm Password']/../input")
    public WebElement conformPasswordField;

    @FindBy(xpath = "//label[.='Subject']/../input")
    public WebElement subjectField;

    @FindBy(xpath = "//label[.='Mobile number']/../input")
    public WebElement mobileNumberField;

    @FindBy(xpath = "//label[.='Gender']/../select")
    public WebElement genderSelect;

    @FindBy(xpath = "//label[.='Admission No']/../input")
    public WebElement admissionNumber;

    @FindBy(xpath = "//label[.='Birth Date']/../input")
    public WebElement birthDateField;

    @FindBy(xpath = "//label[.='Major']/../input")
    public WebElement majorField;

    @FindBy(xpath = "//label[.='Batch']/../select")
    public WebElement batchSelect;

    @FindBy(xpath = "//label[.='Section']/../input")
    public WebElement sectionField;

    @FindBy(id = "message")
    public WebElement premanentAddressField;

    //Company information
    @FindBy(xpath = "//label[.='Company Name']/../input")
    public WebElement companyNameField;

    @FindBy(xpath = "//label[.='Title']/../input")
    public WebElement titleField;

    @FindBy(xpath = "//label[.='Start Date']/../input")
    public WebElement startDatefield;

    @FindBy(xpath = "//label[.='City']/../input")
    public WebElement cityField;

    @FindBy(xpath = "//label[.='Street (123 N. California, Apt 1)']/../input")
    public WebElement streetField;

    @FindBy(xpath = "//label[.='ZipCode']/../input")
    public WebElement zipcodeField;

    @FindBy(xpath = "//label[.='State']/../input")
    public WebElement stateField;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

}
