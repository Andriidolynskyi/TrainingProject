package step_definitions.api_stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utilities.APIUtil;

public class TeacherGetOne_stepDefs {

    @Given("user get the teacher {string}")
    public void user_get_the_teacher(String resource) {
        APIUtil.hitGET(resource);
    }


    @Then("verify if the teacher have firstName and lastName")
    public void verify_if_the_teacher_have_firstName_and_lastName() {
        String actualFirstName = APIUtil.getResponseBody().getTeachers().get(0).getFirstName();
        String actualLastName = APIUtil.getResponseBody().getTeachers().get(0).getLastName();

        Assert.assertTrue("FirstName NOT valid", actualFirstName.length() > 0);
        Assert.assertTrue("LastName NOT valid", actualLastName.length() > 0);

    }

}
