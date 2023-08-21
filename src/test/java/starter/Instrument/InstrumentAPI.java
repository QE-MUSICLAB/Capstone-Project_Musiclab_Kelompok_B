package starter.Instrument;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class InstrumentAPI {
    public static String INSTRUMENT_PATH = Constants.URL + "instruments";
    public static String INSTRUMENT_POST = Constants.URL + "mentors/instruments" ;
    public static String INSTRUMENT_BY_MENTORID = Constants.URL + "mentors/{mentor_id}/instruments";
    public static String MENTOR_INSTRUMENT_DELETE = Constants.URL + "mentors/instruments/{id}";

    @Step("Get all instruments")
    public void getAllInstruments(){
        SerenityRest.given();
    }

    @Step("Post mentor instruments")
    public void postMentorInstruments(File json){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get all instruments by mentor id")
    public void getAllInstrumentsByMentorId(Object mentor_id){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("mentor_id", mentor_id);
    }

    @Step("Delete mentor instrument")
    public void deleteMentorInstrument(Object id){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("id", id);
    }
}
