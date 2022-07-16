package apiTest.ApiModels.reqres;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class Testing {


    @Test
    public void test1() throws JsonProcessingException {

        Response response = RestAssured.get("https://reqres.in/api/users?page=2");


        System.out.println(response.statusCode());
        System.out.println(response.asString());

        ObjectMapper objectMapper = new ObjectMapper();

        ResponseBody responseBody = objectMapper.readValue(response.asString(),ResponseBody.class);

        for (Data data: responseBody.data){
            System.out.println(data.first_name);
        }

    }


}
