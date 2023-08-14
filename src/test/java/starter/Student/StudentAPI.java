package starter.Student;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import static starter.Utils.Constants.URL;

public class StudentAPI {
    public static String GET_STUDENT_VALID =URL+ "students/profile";
    public static String GET_STUDENT_INVALID =URL+ "students";
    public static String GET_STUDENT_INVALID_PARAMS =URL+ "students/profile/id?id=1";


    @Step("Get all students")
    public void setGetAllStudent() {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT);}
}
