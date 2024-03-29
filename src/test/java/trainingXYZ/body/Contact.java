package trainingXYZ.body;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {

    String _id;
    String firstName;
    String lastName;
    String email;

    Location location;
    Employer employer;

    int __v;


}
