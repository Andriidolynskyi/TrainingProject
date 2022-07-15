package utilities;

import apiTest.ApiModels.RequestBody;
import apiTest.ResponseBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

public class APIUtil {

    private static ResponseBody responseBody;

    public static void hitPOST(String resource, RequestBody body) {

        String uri = Config.getProperty("baseURL") + resource;

        ObjectMapper objectMapper = new ObjectMapper();
        String bodyJSON = "";
        try {
            bodyJSON = objectMapper.writeValueAsString(body);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Response response = RestAssured.given().contentType(ContentType.JSON).body(bodyJSON).when().post(uri);

        System.out.println(response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hitGET(String resource) {
        String uri = Config.getProperty("baseURL") + resource;

        Response response = RestAssured.get(uri);

        System.out.println(response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void hitDELETE(String resource) {
        String uri = Config.getProperty("baseURL") + resource;

        Response response = RestAssured.delete(uri);

        System.out.println(response.asString());
        System.out.println("STATUS CODE: " + response.statusCode());

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ResponseBody getResponseBody() {
        return responseBody;
    }
}
