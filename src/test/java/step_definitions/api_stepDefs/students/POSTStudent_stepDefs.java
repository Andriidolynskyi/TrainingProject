package step_definitions.api_stepDefs.students;

import apiTest.ApiModels.RequestBody;
import apiTest.ApiModels.student.Address;
import apiTest.ApiModels.student.Company;
import apiTest.ApiModels.student.Contact;
import apiTest.ApiModels.student.Student;
import apiTest.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Config;

public class POSTStudent_stepDefs {

    Response response;
    ResponseBody responseBody;
    ObjectMapper objectMapper;

    @Given("create user with POST request {string}")
    public void create_user_with_POST_request(String resource) throws Exception {
        Address address = new Address();
        address.setZipCode(60062);
        address.setState("California");
        address.setCity("Los Angeles");
        address.setStreet("1212 Larson ave");

        Company company = new Company();
        company.setAddress(address);

        company.setStartDate("10/06/2020");
        company.setTitle("Mechanic");
        company.setCompanyName("Jeep");

        Contact contact = new Contact();

        contact.setPremanentAddress("1436 E Thacker street");
        contact.setEmailAddress("VasiliiPipko@gmail.com");
        contact.setPhone("9991111111");

        Student student = new Student();
        student.setCompany(company);
        student.setContact(contact);

        student.setFirstName("Vasilii");
        student.setLastName("Pipka");
        student.setBatch(14);
        student.setJoinDate("04/04/2019");
        student.setBirthDate("05/05/1988");
        student.setPassword("12341234");
        student.setSubject("Math");
        student.setGender("Male");
        student.setAdmissionNo("123");
        student.setMajor("Major");
        student.setSection("123");

        objectMapper = new ObjectMapper();

        String jsonBody = objectMapper.writeValueAsString(student);

        response = RestAssured.given()
                .contentType(ContentType.JSON).body(jsonBody).post(Config.getProperty("baseURL") + resource);
        System.out.println(response.asString());
        Assert.assertEquals("StatusCode NOT 200", response.statusCode(), 200);

    }

    @Then("user should be able to get this student")
    public void user_should_be_able_to_get_this_student() throws Exception {
        JsonPath jsonPath = response.jsonPath();
        response = RestAssured.get(Config.getProperty("baseURL") + "/student/" + jsonPath.getInt("studentId"));
        responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);

        Assert.assertEquals("StatusCode NOT 200", response.statusCode(), 200);
        System.out.println(response.asString());

        Assert.assertEquals("FirstName NOT equal", "Vasilii", responseBody.getStudents().get(0).getFirstName());
        Assert.assertEquals("LastName NOT equal", "Pipka", responseBody.getStudents().get(0).getLastName());
        Assert.assertEquals("Batch NOT equal", 14, responseBody.getStudents().get(0).getBatch());
        Assert.assertEquals("JoinDate NOT equal", "04/04/2019", responseBody.getStudents().get(0).getJoinDate());
        Assert.assertEquals("Birthday NOT equal", "05/05/1988", responseBody.getStudents().get(0).getBirthDate());
        Assert.assertEquals("Password NOT equal", "12341234", responseBody.getStudents().get(0).getPassword());
        Assert.assertEquals("Subject NOT equal", "Math", responseBody.getStudents().get(0).getSubject());
        Assert.assertEquals("Gender NOT equal", "Male", responseBody.getStudents().get(0).getGender());
        Assert.assertEquals("AdmissionNo NOT equal", "123", responseBody.getStudents().get(0).getAdmissionNo());
        Assert.assertEquals("Major NOT equal", "Major", responseBody.getStudents().get(0).getMajor());
        Assert.assertEquals("Section NOT euqal", "123", responseBody.getStudents().get(0).getSection());

    }


}
