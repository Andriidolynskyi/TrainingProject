package step_definitions.api_stepDefs.lessonsTraining_stepDefs;

import apiTest.ResponseBody;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pages.cbtTraining.AllTeachersPage;
import pages.cbtTraining.CBTHomepage;
import pages.cbtTraining.SpecificTeacherPage;
import utilities.APIUtil;
import utilities.Config;
import utilities.Driver;

public class TeacherDetailsE2E_stepDefs {

    CBTHomepage cbtHomepage = new CBTHomepage();
    AllTeachersPage allTeachersPage = new AllTeachersPage();
    SpecificTeacherPage specificTeacherPage = new SpecificTeacherPage();

    @Given("user goes to cybertek training application")
    public void user_goes_to_cybertek_training_application() {
        Driver.getDriver().get(Config.getProperty("schoolTrainingURL"));



    }

    @Then("user opens teacher profile details page {string}")
    public void user_opens_teacher_profile_details_page(String teacherId) throws InterruptedException {

        Thread.sleep(1000);
        cbtHomepage.teachersModule.click();
        Thread.sleep(1000);
        cbtHomepage.allTeachersModule.click();

        allTeachersPage.teacherIdSearchField.sendKeys(teacherId);
        allTeachersPage.searchButton.click();

        allTeachersPage.avatar.click();
    }

    @Then("user cross validates teacher details on API and on UI")
    public void user_cross_validates_teacher_details_on_API_and_on_UI() {
        String fullName = APIUtil.getResponseBody().getTeachers().get(0).getFirstName() + " " + APIUtil.getResponseBody().getTeachers().get(0).getLastName();
        String uiFullname = specificTeacherPage.fullName.getText();

        Assert.assertEquals("Full name NOT equal",fullName,uiFullname);
        Assert.assertEquals("e2e phone verification failed", APIUtil.getResponseBody().getTeachers().get(0).getPhone(),specificTeacherPage.phoneNumber.getText());
        Assert.assertEquals("e2e email verification failed", APIUtil.getResponseBody().getTeachers().get(0).getEmailAddress(),specificTeacherPage.emailAddress.getText());
        Assert.assertEquals("e2e batch verification failed", APIUtil.getResponseBody().getTeachers().get(0).getBatch(),Integer.parseInt(specificTeacherPage.batch.getText()));
        Assert.assertEquals("e2e batch verification failed", APIUtil.getResponseBody().getTeachers().get(0).getBirthDate(),specificTeacherPage.birthDay.getText());
        Assert.assertEquals("e2e birthday verification failed", APIUtil.getResponseBody().getTeachers().get(0).getBirthDate(),specificTeacherPage.birthDay.getText());
        Assert.assertEquals("e2e join date verification failed", APIUtil.getResponseBody().getTeachers().get(0).getJoinDate(),specificTeacherPage.joinDate.getText());
        Assert.assertEquals("e2e address verification failed", APIUtil.getResponseBody().getTeachers().get(0).getPremanentAddress(),specificTeacherPage.address.getText());
        Assert.assertEquals("e2e gender verification failed", APIUtil.getResponseBody().getTeachers().get(0).getGender(),specificTeacherPage.gender.getText());
        Assert.assertEquals("e2e salary verification failed", APIUtil.getResponseBody().getTeachers().get(0).getSalary(),Integer.parseInt(specificTeacherPage.salary.getText()));
        Assert.assertEquals("e2e section verification failed", APIUtil.getResponseBody().getTeachers().get(0).getSection(),specificTeacherPage.section.getText());
        Assert.assertEquals("e2e subject verification failed", APIUtil.getResponseBody().getTeachers().get(0).getSubject(),specificTeacherPage.subject.getText());

    }

    @Test
    public void task1(){

        String str = "abcd";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(str.charAt(i) + str.charAt(j) + ",");
            }

        }

    }

}
