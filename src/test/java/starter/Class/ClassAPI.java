package starter.Class;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;


import static starter.Utils.Constants.URL;

public class ClassAPI {
    public static String POST_MAKE_CLASS =URL+ "mentors/classes";
    public static String POST_MAKE_CLASS_INVALID =URL+ "mentors/classes1111";
    public static String GET_MENTOR_CLASS =URL+ "class/{id}";
    public static String GET_MENTOR_CLASS_WITHOUT =URL+ "class";
    public static String GET_MENTOR_ALL_CLASS =URL+ "mentors/{id}/class";
    public static String GET_MENTOR_ALL_CLASS_EMPTY =URL+ "mentors//class";
    public static String PUT_UPDATE_MENTOR_CLASS =URL+ "class/{id}";
    public static String DELETE_CLASS = URL+"class/{id}";


    @Step("Post make class")
    public void setPostMakeClass( File json) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);}

    @Step("Get class mentors")
    public void setGetClassMentor( String id) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);}


    @Step("Get class mentors with empty path")
    public void setGetClassMentorWithEmptyPath() {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR);}

    @Step("Get all class mentors")
    public void setGetAllClassMentor( String id) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);}
    @Step("Get all class mentors without path")
    public void setGetAllClassMentorWithoutPath() {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR);}

    @Step("Put update mentors class")
    public void setPutUpdateMentorClass( File json,String id) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .pathParam("id", id)
                .body(json);}

    @Step("Delete class")
    public void setDeleteClass (String id) {
        SerenityRest
                .given()
                .header("Authorization", "Bearer "+ Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);

    }

}
