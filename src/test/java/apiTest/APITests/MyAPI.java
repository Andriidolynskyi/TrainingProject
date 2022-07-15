package apiTest.APITests;

import apiTest.ApiModels.teacher.Subject;
import apiTest.ApiModels.teacher.Teacher;
import apiTest.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

public class MyAPI {

    @Test
    public void getTeacherList() {

        // Hit API
        //HTTP method, Endpoint, body, header
        RestAssured.get("http://api.cybertektraining.com/teacher/21261");

        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/21261");

        System.out.println(response.statusCode());
        System.out.println(response.asString());

        JsonPath jsonPath = response.jsonPath();
        String firstName = jsonPath.get("teachers[0].firstName");
        System.out.println(firstName);

    }

    @Test
    public void getAllTeachers() {

        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");

        System.out.println(response.statusCode());
//        System.out.println(response.asString());

        JsonPath jsonPath = response.jsonPath();

        List<Object> teachers = jsonPath.getList("teachers");

        System.out.println(teachers.size());
        System.out.println(teachers.get(0).toString());

    }

    @Test
    public void jackson() throws JsonProcessingException {
        Teacher teacher = new Teacher();

        teacher.setEmailAddress("gson@gmail.com");
        teacher.setFirstName("Jenifer");
        teacher.setLastName("Lawrence");
        teacher.setJoinDate("10/10/2021");
        teacher.setSalary(5000);

        Subject subject = new Subject();
        subject.setBatch(14);
        subject.setName("Automation");
        subject.setYear(2020);

//        teacher.setSubject(subject);

        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJson = objectMapper.writeValueAsString(teacher);

        System.out.println(teacherJson);


        System.out.println();


    }

    @Test
    public void studentGet() throws JsonProcessingException {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/24664");

        System.out.println(response.asString());

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);

        String firstName = responseBody.getStudents().get(0).getFirstName();

        System.out.println(firstName);

        System.out.println(responseBody.getStudents().get(0).getStudentId());
        System.out.println(responseBody.getStudents().get(0).getContact().getContactId());
        System.out.println(responseBody.getStudents().get(0).getCompany().getCompanyId());


    }

}
