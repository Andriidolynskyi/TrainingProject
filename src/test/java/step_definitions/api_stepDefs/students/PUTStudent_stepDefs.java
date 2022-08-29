package step_definitions.api_stepDefs.students;

import apiTest.ApiModels.student.Address;
import apiTest.ApiModels.student.Company;
import apiTest.ApiModels.student.Contact;
import apiTest.ApiModels.student.Student;
import apiTest.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.Config;

public class PUTStudent_stepDefs {

    Response response;
    ObjectMapper objectMapper = new ObjectMapper();
    private static ResponseBody responseBody;

    @When("GET and UPDATE student {string}")
    public void get_and_UPDATE_student(String resource) throws Exception{
        response = RestAssured.get(Config.getProperty("baseURL") + resource);

        System.out.println(response.asString());

        responseBody = objectMapper.readValue(response.asString(),ResponseBody.class);

        Address address = new Address();
        responseBody.getStudents().get(0).getCompany().getAddress().setCity("Los Angeles");
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

        int id = responseBody.getStudents().get(0).getStudentId();
        student.setStudentId(id);

        String jsBody = objectMapper.writeValueAsString(student);

        response = RestAssured.given()
                .contentType(ContentType.JSON).body(jsBody).put(Config.getProperty("baseURL") + "/student/update");

        System.out.println(response.asString());
        System.out.println(response.statusCode());


    }

    @Then("Check if the student was updated {string}")
    public void check_if_the_student_was_updated(String resource) throws Exception{
        response = RestAssured.get(Config.getProperty("baseURL") + resource);

        responseBody = objectMapper.readValue(response.asString(),ResponseBody.class);

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
