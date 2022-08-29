package trainingXYZ;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import trainingXYZ.body.ResponseBody;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    public void getContactList() {

        String endpoint = "http://3.13.86.142:3000/contacts";

        Response response = RestAssured.get(endpoint);

        System.out.println(response.statusCode());
        System.out.println(response.asString());
        System.out.println(response.time());


        Assert.assertEquals("Status code NOT 200",200,response.statusCode());

    }

    @Test
    public void getOneContact() {

        String endPoint = "http://3.13.86.142:3000/contacts/62f81574e48c43062f4214a0";

        Response response = RestAssured.get(endPoint);

        System.out.println(response.asString());
        System.out.println(response.statusCode());

    }

    @Test
    public void createContact() throws Exception{

        String endPoint = "http://3.13.86.142:3000/contacts/62f81574e48c43062f4214a0";

        Response response = RestAssured.get(endPoint);

        ObjectMapper objectMapper = new ObjectMapper();

        ResponseBody responseBody = objectMapper.readValue(response.asString(),ResponseBody.class);

        System.out.println(response.asString());
        System.out.println(responseBody.getContacts().get(0).getFirstName());


    }


}
