package step_definitions.api_stepDefs.students;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Config;

public class DELETEStudent_stepDefs {
    Response response;

    @When("user should be able to delete student {string}")
    public void user_should_be_able_to_delete_student(String resource) {

        response = RestAssured.delete(Config.getProperty("baseURL") + resource);

        System.out.println(response.asString());
        System.out.println(response.statusCode());

        Assert.assertEquals("Status code NOT 200", 200, response.statusCode());

    }

    @Then("checking if the student NOT exist {string}")
    public void checking_if_the_student_NOT_exist(String resource) {

        response = RestAssured.get(Config.getProperty("baseURL") + resource);

        System.out.println(response.asString());
        System.out.println(response.statusCode());

        Assert.assertEquals("User NOT deleted", 404, response.statusCode());

    }


}
