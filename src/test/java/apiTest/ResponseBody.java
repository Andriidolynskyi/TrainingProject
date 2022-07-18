package apiTest;

import apiTest.ApiModels.RequestBody;
import apiTest.ApiModels.student.Student;
import apiTest.ApiModels.teacher.Teacher;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBody {

    List<Student> students;
    List<Teacher> teachers;

    String message;


}
