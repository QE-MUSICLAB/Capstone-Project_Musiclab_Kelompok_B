package starter.Schedule;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.URL;

public class ScheduleAPI {
    public static String POST_MENTOR_SCHEDULE =URL+ "mentors/schedules";
    public static String POST_MENTOR_SCHEDULE_INVALID =URL+ "mentors/schedulesS";
    public static String POST_MENTOR_SCHEDULE_CHECK =URL+ "schedules/check";
    public static String POST_MENTOR_SCHEDULE_CHECK_INVALID =URL+ "schedules/checkk";
    public static String GET_MENTOR_SCHEDULE =URL+ "mentors/{id}/schedules";
    public static String GET_MENTOR_SCHEDULE_INVALID =URL+ "mentors/{id}/scheduless";
    public static String DELETE_MENTOR_SCHEDULE_DELETE =URL+ "schedules/{id}";
    public static String DELETE_MENTOR_SCHEDULE_DELETE_INVALID =URL+ "scheduless/{id}";


    @Step("Post mentor schedule")
    public void setPostMentorSchedule( File json) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);}
    @Step("Post mentor schedule invalid")
    public void setPostMentorScheduleInvalid( File json) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);}

    @Step("Post mentor schedule check")
    public void setPostMentorScheduleCheck( File json) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);}

    @Step("Get mentor schedule")
    public void setGetMentorSchedule(String id) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id) ;}

    @Step("Get mentor schedule Invalid")
    public void setGetMentorScheduleInvalidPath( String id) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);}


    @Step("Delete mentor schedule valid path")
    public void setDeleteMentorScheduleValidPath(String id) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);}

    @Step("Delete mentor schedule invalid path")
    public void setDeleteMentorScheduleInvalidPath( String id) {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);}

}

