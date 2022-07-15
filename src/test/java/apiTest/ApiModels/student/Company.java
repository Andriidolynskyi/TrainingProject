package apiTest.ApiModels.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    /*
    "companyName": "string",
    "startDate": "string",
    "title": "string"
     */

    private int companyId;
    private String companyName;
    private String startDate;
    private String title;

    private Address address;

}
