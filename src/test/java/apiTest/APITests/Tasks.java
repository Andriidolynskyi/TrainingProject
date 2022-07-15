package apiTest.APITests;

import apiTest.ApiModels.student.Student;
import apiTest.ResponseBody;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

public class Tasks {

    @Test
    public void test1() throws JsonProcessingException {

        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.statusCode());
        System.out.println(response.asString());


        ObjectMapper objectMapper = new ObjectMapper();
        ResponseBody responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);

        int count = 0;

        for (Student student : responseBody.getStudents()) {
            if (student.getJoinDate().endsWith("2021")) {
                System.out.println(student.getFirstName());
                count++;
            }
        }
        System.out.println(count);
    }
}
