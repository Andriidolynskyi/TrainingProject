package step_definitions.cbtStep_defs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.cbtTraining.AddStudentPage;
import pages.cbtTraining.AllStudentPage;
import pages.cbtTraining.CBTHomepage;
import utilities.Config;
import utilities.Driver;

import java.time.Duration;

public class CreatingStudent_StepDefs {
    Select select;

    CBTHomepage cbtHomepage = new CBTHomepage();
    AddStudentPage addStudentPage = new AddStudentPage();
    AllStudentPage allStudentPage = new AllStudentPage();

    @Given("user should be able go to the website <cbt>")
    public void user_should_be_able_go_to_the_website_cbt() {
        Driver.getDriver().get(Config.getProperty("cbtURL"));
    }

    @When("user on a main page should be see student module, click it drop down and click create student")
    public void user_on_a_main_page_should_be_see_student_module_click_it_drop_down_and_click_create_student() {
        Assert.assertTrue("Student module NOT present", cbtHomepage.studentModule.isDisplayed());
        cbtHomepage.studentModule.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cbtHomepage.addStudent));
        cbtHomepage.addStudent.click();
    }

    @When("user should fill out all field in application")
    public void user_should_fill_out_all_field_in_application() {
        addStudentPage.firstNameField.sendKeys("Inokentii");
        addStudentPage.lastNameField.sendKeys("Best");
        addStudentPage.emailField.sendKeys("InokentiiBest@gmail.com");
        addStudentPage.joinDateField.sendKeys("12/09/2021");
        addStudentPage.passwordField.sendKeys("123456");
        addStudentPage.conformPasswordField.sendKeys("123456");
        addStudentPage.subjectField.sendKeys("Math");
        addStudentPage.mobileNumberField.sendKeys("9998881212");

        select = new Select(addStudentPage.genderSelect);
        select.selectByVisibleText("Male");

        addStudentPage.admissionNumber.sendKeys("123");
        addStudentPage.birthDateField.sendKeys("02/05/1988");
        addStudentPage.majorField.sendKeys("Major");

        select = new Select(addStudentPage.batchSelect);
        select.selectByVisibleText("14");

        addStudentPage.sectionField.sendKeys("2000");
        addStudentPage.premanentAddressField.sendKeys("2203 W Belmont ave, Los Angeles CA 12312");
        addStudentPage.companyNameField.sendKeys("Moto");
        addStudentPage.titleField.sendKeys("Mechanic");
        addStudentPage.startDatefield.sendKeys("12/05/2020");
        addStudentPage.cityField.sendKeys("Los Angeles");
        addStudentPage.streetField.sendKeys("1212 Larson ave");
        addStudentPage.zipcodeField.sendKeys("12312");
        addStudentPage.stateField.sendKeys("California");



    }

    @Then("click submit and virify if user on a list")
    public void click_submit_and_virify_if_user_on_a_list() {
        addStudentPage.submitButton.click();

        cbtHomepage.studentModule.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cbtHomepage.allStudent));
        cbtHomepage.allStudent.click();

        wait.until(ExpectedConditions.visibilityOf(allStudentPage.userName));
        allStudentPage.userName.click();


    }


}
