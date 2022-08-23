package step_definitions.smartBear_StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.smartbearPages.SmartbearLoginPage;
import utilities.Config;
import utilities.Driver;

public class LoginSmartBear_StepDefs {

    SmartbearLoginPage smartbearLoginPage = new SmartbearLoginPage();

    @Given("user should be able go to the website")
    public void user_should_be_able_go_to_the_website() {
        Driver.getDriver().get(Config.getProperty("smartbearWebsite"));
    }

    @When("user should be able to enter valid credential")
    public void user_should_be_able_to_enter_valid_credential() {
        smartbearLoginPage.loginField.sendKeys(Config.getProperty("smartbearUsername"));
        smartbearLoginPage.passwordField.sendKeys(Config.getProperty("smartbearPassword"));
        smartbearLoginPage.loginButton.click();
    }

    @Then("after entered login credentials user should be on a main page")
    public void after_entered_login_credentials_user_should_be_on_a_main_page() {
        String expectedTitle = "Web Orders";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertNotEquals("Titles NOT hte same",expectedTitle,actualTitle);
    }

}
