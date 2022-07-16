package apiTest.APITests;

import apiTest.ApiModels.RequestBody;
import apiTest.ApiModels.teacher.Teacher;
import apiTest.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import utilities.APIUtil;
import utilities.Config;


public class TeacherTest {

    @Test
    public void getAllTeachers() {

        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/all");

        Assert.assertEquals("Bad status code", 200, response.getStatusCode());

        System.out.println(response.getStatusCode());
        System.out.println(response.asString());

    }

    @Test
    public void postTeacher() throws JsonProcessingException {

        Teacher teacher = new Teacher();

        teacher.setFirstName("Leonel");
        teacher.setLastName("Messi");
        teacher.setEmailAddress("LeonelMessi@Gmail.com");
        teacher.setJoinDate("09/09/2009");
        teacher.setPassword("4545454545");
        teacher.setPhone("332-569-2488");
        teacher.setSubject("IT");
        teacher.setGender("Male");
        teacher.setDepartment("Trucking");
        teacher.setBirthDate("06/04/1987");
        teacher.setSalary(2000);
        teacher.setBatch(14);
        teacher.setSection("OK");
        teacher.setPremanentAddress("2424 W Oregon street, Des Plaines, IL 60016");

        ObjectMapper objectMapper = new ObjectMapper();
        String teacherJS = objectMapper.writeValueAsString(teacher);

        Response response = RestAssured
                .given().contentType(ContentType.JSON).body(teacherJS).when().post(Config.getProperty("baseURL") + "/teacher/create");
//                .baseUri()
//                .contentType("application/json")
//                .body(teacherJS).post();

        System.out.println(response.statusCode());
        System.out.println(response.prettyPrint());


    }

    @Test
    public void getOneTeacher() throws JsonProcessingException {

        Response response = RestAssured.get(Config.getProperty("baseURL") + "/teacher/21902");

        System.out.println(response.statusCode());
        System.out.println(response.asString());

        ObjectMapper objectMapper = new ObjectMapper();

        ResponseBody responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);

        System.out.println(responseBody.getTeachers().get(0).getFirstName());


    }

    @Test
    public void updateTeacher() throws JsonProcessingException {

        Response response = RestAssured.get(Config.getProperty("baseURL") + "/teacher/21902");

        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        responseBody.getTeachers().get(0).setFirstName("Leoneli");
        responseBody.getTeachers().get(0).setSalary(5000);

        Teacher teacher = new Teacher();

//        teacher.setFirstName("Leo");
//        teacher.setLastName("Messi");
//        teacher.setEmailAddress("LeonelMessi@Gmail.com");
//        teacher.setJoinDate("09/09/2009");
//        teacher.setPassword("4545454545");
//        teacher.setPhone("332-569-2488");
//        teacher.setSubject("IT");
//        teacher.setGender("Male");
//        teacher.setDepartment("Trucking");
//        teacher.setBirthDate("06/04/1987");
//        teacher.setSalary(2000);
//        teacher.setBatch(14);
//        teacher.setSection("OK");
//        teacher.setPremanentAddress("2424 W Oregon street, Des Plaines, IL 60016");
//        teacher.setTeacherId(21903);

//        objectMapper = new ObjectMapper();
        String teacherJS = objectMapper.writeValueAsString(responseBody.getTeachers().get(0));

        response = RestAssured.given()
                .contentType(ContentType.JSON).body(teacherJS).put(Config.getProperty("baseURL") + "/teacher/update");

        System.out.println(response.statusCode());
        System.out.println(response.asString());

    }

    @Test
    public void deleteTeacher() {

        Response response = RestAssured.delete(Config.getProperty("baseURL") + "/teacher/delete/21903");

        System.out.println(response.statusCode());
        System.out.println(response.asString());

    }

    @Test
    public void getOneTeacherUtility() {
        String resource = "/teacher/20671";
        APIUtil.hitGET(resource);
    }

    @Test
    public void getAllTeachersUtility(){
        String resource = "/teacher/all";
        APIUtil.hitGET(resource);
    }

    @Test
    public void deleteOneTeacher(){
        String resource = "/teacher/delete/20676";
        APIUtil.hitDELETE(resource);
    }

    @Test
    public void postTesting(){
        String resource = "/teacher/create";


        RequestBody teacher = new RequestBody();

        teacher.setFirstName("Leonel");
        teacher.setLastName("Messi");
        teacher.setEmailAddress("LeonelMessi@Gmail.com");
        teacher.setJoinDate("09/09/2009");
        teacher.setPassword("4545454545");
        teacher.setPhone("332-569-2488");
        teacher.setSubject("IT");
        teacher.setGender("Male");
        teacher.setDepartment("Trucking");
        teacher.setBirthDate("06/04/1987");
        teacher.setSalary(2000);
        teacher.setBatch(14);
        teacher.setSection("OK");
        teacher.setPremanentAddress("2424 W Oregon street, Des Plaines, IL 60016");

        APIUtil.hitPOST(resource,teacher);




    }

}
