package starter.Auth;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.URL;

public class AuthAPI {

    public static String POST_REGISTER_NEW_STUDENT =URL+ "register";
    public static String POST_REGISTER_NEW_STUDENT_INVALID_PATH =URL+ "registersss";
    public static String POST_REGISTER_NEW_MENTOR =URL+ "register";
    public static String POST_REGISTER_NEW_MENTOR_INVALID_PATH =URL+ "registers12";
    public static String POST_LOGIN_STUDENT =URL+ "login";
    public static String POST_LOGIN_STUDENT_INVALID_PATH =URL+ "loginn";
    public static String POST_LOGIN_MENTOR =URL+ "login";
    public static String POST_LOGIN_MENTOR_INVALID_PATH =URL+ "loginsss";


    @Step("Post Register New Student")
    public void setPostRegisterNewStudent( File json) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT)
                .contentType(ContentType.JSON)
                .body(json);

    }
    @Step("Post Register New Mentor")
    public void setPostRegisterNewMentor( File json) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);

    }
    @Step("Post Login Student")
    public void setPostLoginStudent( File json) {
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(json);

    }
    @Step("Post Login Mentor")
    public void setPostLoginMentor( File json) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);

    }

}
