package starter.Review;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.URL;

public class ReviewAPI {
    public static String POST_REVIEW_MENTOR =URL+ "mentors/{id}/reviews";
    public static String GET_REVIEW_MENTOR=URL+ "mentors/{id}/reviews";
    public static String GET_REVIEW_MENTOR_EMPTY=URL+ "mentorsreviews";

    @Step("Post review mentors")
    public void setPostReviewMentorValid( int id, File json) {
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT)
                .contentType(ContentType.JSON)
                .pathParam("id", id)
                .body(json);}

    @Step("Get review mentors")
    public void setGetReviewMentor( int id) {
        SerenityRest
                .given()
                .pathParam("id", id);}

    @Step("Get review mentors with empty path")
    public void setGetReviewMentorEmpty() {
        SerenityRest
                .given();}

















}
