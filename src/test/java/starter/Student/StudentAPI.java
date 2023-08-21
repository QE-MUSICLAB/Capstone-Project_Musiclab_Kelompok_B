package starter.Student;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.URL;

public class StudentAPI {
    public static String GET_STUDENT_VALID =URL+ "students/profile";
    public static String GET_STUDENT_INVALID =URL+ "students";
    public static String GET_STUDENT_INVALID_PARAMS =URL+ "students/profile/id?id=1";
    public static String PUT_EDIT_STUDENT_PROFILE = URL+"students";
    public static String PUT_EDIT_STUDENT_PROFILE_EMPTY_NAME = URL+"students";
    public static String PUT_EDIT_STUDENT_PROFIE_INVALID_PARAMS = URL+"studentsss";
    public static String PUT_EDIT_STUDENT_PASSWORD = URL+"students/password";
    public static String DELETE_STUDENT_WITH_VALID_PATH = URL+"students";
    public static String DELETE_STUDENT_WITH_INVALID_PATH = URL+"studentssss";



    @Step("Put edit student profile")
    public void puteditstudentprofile(File json){
        SerenityRest.given().headers("Authorization","Bearer " + Constants.BEARER_TOKEN_STUDENT)
        .contentType(ContentType.JSON).body(json);
    }


    @Step("Get all students")
    public void setGetAllStudent() {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT);}
}
