package step_definitions.smartBear_StepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.smartbearPages.MainPage;
import pages.smartbearPages.OrderModulePage;
import utilities.Driver;

import java.util.List;

public class OrderMaking_StepDefs {

    MainPage mainPage = new MainPage();
    OrderModulePage orderModulePage = new OrderModulePage();

    @When("the user on a main page should be able go to the orders functionality")
    public void the_user_on_a_main_page_should_be_able_go_to_the_orders_functionality() {
        mainPage.orderModule.click();

        String actualTitle = "Web Orders";
        String expectedTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title of the Order module NOT the same", expectedTitle, actualTitle);
    }

    @When("user should be able fill all field to make the order")
    public void user_should_be_able_fill_all_field_to_make_the_order() {
        //Product information
        Select select = new Select(orderModulePage.productDropDown);
        select.selectByValue("FamilyAlbum");
        orderModulePage.quantity.clear();
        orderModulePage.quantity.sendKeys("2");
        orderModulePage.calculateButton.click();

        //Address Information
        orderModulePage.customerNameField.sendKeys("Cristiano Ronaldo");
        orderModulePage.streetField.sendKeys("1522 W Beach ave apt 306");
        orderModulePage.cityField.sendKeys("Kyiv");
        orderModulePage.stateField.sendKeys("Illinois");
        orderModulePage.zipcodeField.sendKeys("60012");

        //Payment information
        orderModulePage.masterCard.click();
        orderModulePage.cardNumberField.sendKeys("1234123412341234");
        orderModulePage.expireDateField.sendKeys("12/2024");

        orderModulePage.processButton.click();
    }

    @Then("Verify if the user did the order and able to see in a list on the main page")
    public void verify_if_the_user_did_the_order_and_able_to_see_in_a_list_on_the_main_page() {
        mainPage.viewAllOrders.click();

        List<WebElement> listOfNames = Driver.getDriver().findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        boolean check = false;

        for (int i = 0; i < listOfNames.size(); i++) {
            if (listOfNames.get(i).getText().equals("Cristiano Ronaldo")) {
                check = true;
            }
        }
        Assert.assertTrue("Order NOT on a list", check);

        Driver.quitDriver();
    }

    @When("user should be able fill all field to make the order {string} {string} {string} {string} {string} {string} {string}")
    public void user_should_be_able_fill_all_field_to_make_the_order(String customerName, String street, String city, String state, String zipCode, String cardNumber, String expirationDate) {
        //Product information
        Select select = new Select(orderModulePage.productDropDown);
        select.selectByValue("FamilyAlbum");
        orderModulePage.quantity.clear();
        orderModulePage.quantity.sendKeys("2");
        orderModulePage.calculateButton.click();

        //Address Information
        orderModulePage.customerNameField.sendKeys(customerName);
        orderModulePage.streetField.sendKeys(street);
        orderModulePage.cityField.sendKeys(city);
        orderModulePage.stateField.sendKeys(state);
        orderModulePage.zipcodeField.sendKeys(zipCode);

        //Payment information
        orderModulePage.masterCard.click();
        orderModulePage.cardNumberField.sendKeys(cardNumber);
        orderModulePage.expireDateField.sendKeys(expirationDate);

        orderModulePage.processButton.click();
    }

    @Then("Verify if the user did the order and able to see in a list on the main page {string}")
    public void verify_if_the_user_did_the_order_and_able_to_see_in_a_list_on_the_main_page(String customerName) {
        mainPage.viewAllOrders.click();

        List<WebElement> listOfNames = Driver.getDriver().findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));

        boolean check = false;

        for (int i = 0; i < listOfNames.size(); i++) {
            if (listOfNames.get(i).getText().equals(customerName)) {
                System.out.println(customerName);
                check = true;
            }
        }
        Assert.assertTrue("Order NOT on a list", check);

    }

}
