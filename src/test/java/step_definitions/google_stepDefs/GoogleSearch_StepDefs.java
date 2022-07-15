package step_definitions.google_stepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.google_pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleSearch_StepDefs {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("User is on Google search page")
    public void user_is_on_Google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @When("User searches for wooden spoon")
    public void user_searches_for_wooden_spoon() {
        googleSearchPage.googleSearchField.sendKeys("wooden spoon" + Keys.ENTER);

    }

    @Then("User should see wooden spoon in title")
    public void user_should_see_wooden_spoon_in_title() {
        //implement the logic to compare
        String expectedTitle = "wooden spoon - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        System.out.println(expectedTitle);
        System.out.println(actualTitle);

        Assert.assertEquals("Title NOT same", expectedTitle, actualTitle);

        Driver.getDriver().close();
    }


}
