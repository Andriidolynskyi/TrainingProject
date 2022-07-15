package apiTest.ApiModels.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {

    /*
    "emailAddress": "string",
    "phone": "string",
    "premanentAddress": "string"
     */

    private int contactId;
    private String emailAddress;
    private String phone;
    private String premanentAddress;



}
