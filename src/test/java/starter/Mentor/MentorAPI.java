package starter.Mentor;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;
import java.lang.reflect.Field;

import static starter.Utils.Constants.URL;

public class MentorAPI {
    public static String GET_ALL_MENTOR =URL+ "mentors";
    public static String GET_ALL_MENTOR_INVALID =URL+ "mentor";
    public static String GET_ALL_MENTOR_WITHOUT_PATH =URL+ "";
    public static String GET_MENTOR_PROFILE_BYID =URL+ "mentors/{id}";
    public static String GET_MENTOR_PROFILE_INVALID_CHAR =URL+ "mentors/{character}";
    public static String GET_MENTOR_TOP_WEEK =URL+ "mentors/topweek";
    public static String GET_MENTOR_TOP_WEEK_INVALID =URL+ "mentors/topweekk";
    public static String GET_MENTOR_PROFILE =URL+ "mentors/profile";
    public static String GET_MENTOR_PROFILE_INVALID =URL+ "mentors/profilee";
    public static String PUT_EDIT_MENTOR_PROFILE =URL+ "mentors";
    public static String PUT_EDIT_MENTOR_PROFILE_INVALID =URL+ "mentorss";
    public static String PUT_EDIT_PASSWORD_MENTOR =URL+ "mentors/password";

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Step("Get all mentors ")
    public void setGetAllMentor() {
        SerenityRest
                .given();}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Step("Get mentors profile by id")
    public void setGetMentorProfileById(int id) {
    SerenityRest
            .given()
            .pathParam("id", id);}
    @Step("Get mentors profile with invalid id")
    public void setGetAllMentorProfileInvalid(String character) {
        SerenityRest
                .given()
                .pathParam("character",character);}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Step("Get mentors top week ")
    public void setGetMentorTopWeek() {
    SerenityRest
            .given();}
    @Step("Get mentors top week invalid path ")
    public void setGetMentorTopWeekInvalid() {
        SerenityRest
                .given();}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Step("Get mentors profile ")
    public void setGetMentorProfile() {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR);}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Step("Put update mentors profile ")
    public void setPutEditMentorProfile(File json) {
    SerenityRest
            .given()
            .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
            .contentType(ContentType.JSON)
            .body(json);}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Step("Put update edit mentors password ")
    public void setPutEditMentorPassword(File json) {
    SerenityRest
            .given()
            .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
            .contentType(ContentType.JSON)
            .body(json);}

}
