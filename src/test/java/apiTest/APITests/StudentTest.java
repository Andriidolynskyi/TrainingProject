package apiTest.APITests;

import apiTest.ApiModels.student.Student;
import apiTest.ResponseBody;
import org.junit.Test;
import utilities.APIUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    @Test
    public void getAllStudents() {

        String resource = "/student/all";

        APIUtil.hitGET(resource);

    }

    @Test
    public void deleteHalfStudent() {

        String resource1 = "/student/all";
        String resource2 = "/student/delete/";

        APIUtil.hitGET(resource1);

        for (int i = 0; i < APIUtil.getResponseBody().getStudents().size() - 30; i++) {

            APIUtil.hitDELETE(resource2 + APIUtil.getResponseBody().getStudents().get(i).getStudentId());

        }

    }

    @Test
    public void getStudentWhoBatch14() {
        String resource = "/student/all";

        APIUtil.hitGET(resource);

        for (Student student : APIUtil.getResponseBody().getStudents()) {
            if (student.getBatch() == 14) {
                System.out.println(student.getFirstName() + " " + student.getStudentId());
            }

        }


    }

}
