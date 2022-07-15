package apiTest.ApiModels.student;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private int batch;
    private String emailAddress;
    private String joinDate;
    private String major;
    private String birthDate;
    private String password;
    private String subject;
    private String gender;
    private String admissionNo;
    private String section;

    private Contact contact;
    private Company company;

}
