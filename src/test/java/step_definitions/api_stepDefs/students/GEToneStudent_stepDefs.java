package step_definitions.api_stepDefs.students;

import apiTest.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Config;

public class GEToneStudent_stepDefs {

    private static apiTest.ResponseBody responseBody;
    private Response response;

    @When("user should be able to get one specific user {string}")
    public void user_should_be_able_to_get_one_specific_user(String resource) throws Exception {
        response = RestAssured.get(Config.getProperty("baseURL") + resource);

        ObjectMapper objectMapper = new ObjectMapper();

        responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);

    }

    @Then("print and verify all information about user")
    public void print_and_verify_all_information_about_user() {

        System.out.println(response.asString());

        Assert.assertEquals("FirstName NOT equal", "Inokentii", responseBody.getStudents().get(0).getFirstName());
        Assert.assertEquals("LastName NOT equal", "Best", responseBody.getStudents().get(0).getLastName());
        Assert.assertEquals("Batch NOT equal", 14, responseBody.getStudents().get(0).getBatch());
        Assert.assertEquals("JoinDate NOT equal", "12/09/2021", responseBody.getStudents().get(0).getJoinDate());
        Assert.assertEquals("Birthday NOT equal", "02/05/1988", responseBody.getStudents().get(0).getBirthDate());
        Assert.assertEquals("Password NOT equal", "test123456123456", responseBody.getStudents().get(0).getPassword());
        Assert.assertEquals("Subject NOT equal", "Math", responseBody.getStudents().get(0).getSubject());
        Assert.assertEquals("Gender NOT equal", "Male", responseBody.getStudents().get(0).getGender());
        Assert.assertEquals("AdmissionNo NOT equal", "123123", responseBody.getStudents().get(0).getAdmissionNo());
        Assert.assertEquals("Major NOT equal", "Major", responseBody.getStudents().get(0).getMajor());
        Assert.assertEquals("Section NOT euqal", "1000002000", responseBody.getStudents().get(0).getSection());
    }

}
