package starter.Student;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import static starter.Utils.Constants.URL;

public class StudentAPI {
    public static String GET_STUDENT_VALID =URL+ "students/profile";


    @Step("Get all students")
    public void setGetAllStudent() {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT);}
}
