package step_definitions.api_stepDefs;

import apiTest.ApiModels.RequestBody;
import apiTest.ApiModels.teacher.Teacher;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utilities.APIUtil;
import utilities.Config;

import java.util.List;

public class TeacherCreating_stepDefs {

    RequestBody requestBody;
    Response response;

    @Given("creating teacher in java object")
    public void creating_teacher_in_java_object() {
        requestBody = new RequestBody();

/*
private String firstName;
    private String lastName;
    private String emailAddress;
    private String joinDate;
    private String password;
    private String phone;
    private String subject;
    private String gender;
    private String department;
    private String birthDate;
    private int salary;
    private int batch;
    private String section;
    private String premanentAddress;
    private int teacherId;
 */
        requestBody.setFirstName("Anreas");
        requestBody.setLastName("De Gonzales");
        requestBody.setEmailAddress("andreasDeGonzales@gmail.com");
        requestBody.setJoinDate("10/23/2020");
        requestBody.setPassword("123412341234");
        requestBody.setPhone("123-123-1234");
        requestBody.setSubject("Math");
        requestBody.setGender("Male");
        requestBody.setDepartment("IT");
        requestBody.setBirthDate("12/09/1991");
        requestBody.setSalary(4000);
        requestBody.setBatch(14);
        requestBody.setSection("Section");
        requestBody.setPremanentAddress("1324 E Thacker street");


    }

    @Given("hit POST methode {string} to create a teacher")
    public void hit_POST_methode_to_create_a_teacher(String resource) {
        response = RestAssured.given().contentType(ContentType.JSON).body(requestBody).post(Config.getProperty("baseURL") + resource);
        System.out.println(response.asString());
        System.out.println(response.statusCode());
    }

    @Then("verify if a teacher was created")
    public void verify_if_a_teacher_was_created() {
        JsonPath jsonPath = response.jsonPath();

        int id = jsonPath.getInt("teacherId");

        System.out.println(id);
    }

}
