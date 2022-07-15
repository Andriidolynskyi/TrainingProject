package pages.smartbearPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Config;
import utilities.Driver;

public class OrderModulePage {

    public OrderModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Product information objects
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropDown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement calculateButton;

    //Address information objects
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameField;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetField;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityField;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateField;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipcodeField;


    //Payment information
    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']/tbody/tr/td/label[.='visa']")
    public WebElement visaCard;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']/tbody/tr/td/label[.='MasterCard']")
    public WebElement masterCard;

    @FindBy(xpath = "//table[@id='ctl00_MainContent_fmwOrder_cardList']/tbody/tr/td/label[.='American Express']")
    public WebElement americanExpress;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberField;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDateField;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;






}
