package step_definitions.api_stepDefs.students;

import apiTest.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utilities.APIUtil;
import utilities.Config;

public class StudentGETall_stepDefs {

    private static ResponseBody responseBody;

    @When("user should be able to get all student {string}")
    public void user_should_be_able_to_get_all_student(String resource) throws Exception {
        Response response = RestAssured.get(Config.getProperty("baseURL") + resource);

        ObjectMapper objectMapper = new ObjectMapper();

        responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);

        System.out.println(responseBody.getStudents().get(162).getStudentId());

    }

    @Then("print all student names and lastnames")
    public void print_all_student_names_and_lastnames() {
        for (int i = 0; i < responseBody.getStudents().size(); i++) {
            System.out.println(i + 1 + " : " + responseBody.getStudents().get(i).getFirstName() + " " +
                    responseBody.getStudents().get(i).getLastName());
        }

    }
}
