package apiTest.APITests;

import apiTest.ApiModels.student.Address;
import apiTest.ApiModels.student.Company;
import apiTest.ApiModels.student.Contact;
import apiTest.ApiModels.student.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class Creating {

    //jhvghygv
    
    @Test
    public void studentTest() throws JsonProcessingException {
        Address address = new Address();
        address.setCity("Chicago");
        address.setState("IL");
        address.setStreet("London ave");
        address.setZipCode(60016);

        Company company = new Company();
        company.setCompanyName("Chase");
        company.setStartDate("03/18/2020");
        company.setTitle("Engineer");
        company.setAddress(address);


        Contact contact = new Contact();
        contact.setEmailAddress("test@gmail.com");
        contact.setPhone("9999991234");
        contact.setPremanentAddress("1212 W Beach ave");

        Student student = new Student();
        student.setFirstName("Cristiano");
        student.setLastName("Ronaldo");
        student.setBatch(14);
        student.setEmailAddress("testtttt@gmail.com");
        student.setJoinDate("10/10/2016");
        student.setMajor("major");
        student.setBirthDate("03/03/1993");
        student.setPassword("1234567890");
        student.setSubject("Math");
        student.setGender("Male");
        student.setEmailAddress("addmisiion");
        student.setSection("section");
        student.setAdmissionNo("addNo");


        student.setCompany(company);
        student.setContact(contact);

        ObjectMapper objectMapper = new ObjectMapper();
        String studentJson = objectMapper.writeValueAsString(student);

        System.out.println(studentJson);



    }

}
