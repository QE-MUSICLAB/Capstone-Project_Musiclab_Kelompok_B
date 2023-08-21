package starter.Genre;


import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.URL;

public class GenreAPI {

    public static String GET_ALL_GENRES =URL+ "genres";
    public static String GET_ALL_GENRES_WITH_INVALID_DATA  =URL+ "genres/1?id=100";
    public static String POST_GENRES_MENTOR_VALID_REQUEST  =URL+ "mentors/genres";
    public static String GET_MENTORS_ALL_GENRES_ID =URL+ "mentors/{id}/genres";
    public static String GET_MENTORS_ALL_GENRES_INVALID_PARAMS =URL+ "mentors/500";
    public static String GET_MENTORS_ALL_GENRES_INVALID_ID =URL+ "mentors/wadidaw/genres";



    public static String DELETE_ALL_MENTOR_WITH_ID =URL+ "mentors/{id}/genres";







    @Step("Get all genress")
    public void setGetAllGenres() {
        SerenityRest
                .given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR);}

    @Step("POST Mentor Genres")
    public void postmentorgenres(File json){
        SerenityRest.given().headers("Authorization","Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("POST Mentor Genres")
    public void postmentorgenresid(int id){
        SerenityRest.given().headers("Authorization","Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);
    }

}
