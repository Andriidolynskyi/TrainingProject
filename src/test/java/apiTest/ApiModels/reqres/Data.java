package apiTest.ApiModels.reqres;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@lombok.Data
public class Data {

    int id;
    String email;
    String first_name;
    String last_name;
    String avatar;

}
