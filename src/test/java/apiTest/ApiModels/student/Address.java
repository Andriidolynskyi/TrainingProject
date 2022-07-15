package apiTest.ApiModels.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {

    /*
    "city": "string",
      "state": "string",
      "street": "string",
      "zipCode": 0
     */

    private int addressId;
    private String city;
    private String state;
    private String street;
    private int zipCode;
}
