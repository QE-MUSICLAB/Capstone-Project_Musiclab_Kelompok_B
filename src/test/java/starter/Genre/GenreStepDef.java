package starter.Genre;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.MusiclabResponses;
import starter.Utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GenreStepDef {

    @Steps
    GenreAPI genreAPI;

// with valid data
    @When("show all genres with valid params")
    public void showallgenresswithvalidparams(){
        genreAPI.setGetAllGenres();
    }

    @And("Send request for all genress with valid params")
    public void sendRequestForAllGenressWithValidParams() {
        SerenityRest.when().get(GenreAPI.GET_ALL_GENRES);
    }

    @And("Validate response genres body message {string}")
    public void validateResponseGenresBodyMessage(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate all genres JSON Schema")
    public void validateAllGenresJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA_GENRE+"GETshowallgenreswithvaliddataJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// with invalid data
    @When("show all genres with invalid params")
    public void showAllGenresWithInvalidParams() {genreAPI.setGetAllGenres();
    }

    @And("Send request for all genress inwith valid params")
    public void sendRequestForAllGenressInwithValidParams() {SerenityRest.when().get(GenreAPI.GET_ALL_GENRES_WITH_INVALID_DATA);
    }

    @And("Validate response invalid genres body message {string}")
    public void validateResponseInvalidGenresBodyMessage(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate all invalid genres JSON Schema")
    public void validateAllInvalidGenresJSONSchema() {File json = new File(Constants.JSON_SCHEMA_GENRE+"GETshowallgenresswithinvaliddataJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// mentors all genre
    @When("show all genress with valid paramater mentor id {int}")
    public void showAllGenressWithValidParamaterMentorId(int id) {genreAPI.postmentorgenresid(id);
    }

    @And("send request mentors all genres")
    public void sendRequestMentorsAllGenres() {SerenityRest.when().get(GenreAPI.GET_MENTORS_ALL_GENRES_ID);
    }

    @And("Validate response body message should be {string}")
    public void validateResponseBodyMessageShouldBe(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("validate mentors all genres JSON Schmea")
    public void validateMentorsAllGenresJSONSchmea() {File json = new File(Constants.JSON_SCHEMA_GENRE+"GETmentorallgenresJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// mentor with invalid params
    @When("show all genress with invalid paramater mentor")
    public void showAllGenressWithInvalidParamaterMentor() {genreAPI.setGetAllGenres();
    }

    @And("send request mentors all genres with invalid params")
    public void sendRequestMentorsAllGenresWithInvalidParams() {SerenityRest.when().get(GenreAPI.GET_MENTORS_ALL_GENRES_INVALID_PARAMS);
    }

    @And("Validate response invalid params message should be {string}")
    public void validateResponseInvalidParamsMessageShouldBe(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("validate invalid params mentors all genres JSON Schema")
    public void validateInvalidParamsMentorsAllGenresJSONSchema() {File json = new File(Constants.JSON_SCHEMA_GENRE+"GETmentorallgenreswithinvalidparamsJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// invalid ID
    @When("show all genress with invalid id mentor")
    public void showAllGenressWithInvalidIdMentor() {genreAPI.setGetAllGenres();
    }

    @And("send request mentors all genres with invalid id")
    public void sendRequestMentorsAllGenresWithInvalidId() {SerenityRest.when().get(GenreAPI.GET_MENTORS_ALL_GENRES_INVALID_ID);
    }

    @And("Validate response invalid id message should be {string}")
    public void validateResponseInvalidIdMessageShouldBe(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("validate invalid id mentors all genres JSON Schema")
    public void validateInvalidIdMentorsAllGenresJSONSchema() {File json = new File(Constants.JSON_SCHEMA_GENRE+"GETmentorallgenreswithinvalididJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // post mentor genress
    @When("Post mentor genress with valid request body")
    public void postmentorgenress(){
        File json = new File(Constants.REQ_BODY_GENRE+"/POSTmentorgenrewithvalidrequestbody.json");
        genreAPI.postmentorgenres(json);
    }

    @And("request mentor genress with valid request body")
    public void requestMentorGenressWithValidRequestBody() {SerenityRest.when().post(GenreAPI.POST_GENRES_MENTOR_VALID_REQUEST);

    }

    @And("Validate response body mentor genress message {string}")
    public void validateResponseBodyMentorGenressMessage(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate message JSON Schema mentor genress")
    public void validateMessageJSONSchemaMentorGenress() {File json = new File(Constants.JSON_SCHEMA_GENRE+"POSTmentorgenresJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // invalid request body
    @When("Post mentor genress with invalid request body")
    public void postMentorGenressWithInvalidRequestBody() {File json = new File(Constants.REQ_BODY_GENRE+"/POSTmentorgenrewithinvalidrequestbody.json");
        genreAPI.postmentorgenres(json);
    }

    @And("request mentor genress with invalid request body")
    public void requestMentorGenressWithInvalidRequestBody() {SerenityRest.when().post(GenreAPI.POST_GENRES_MENTOR_VALID_REQUEST);
    }

    @And("Validate response invalid body mentor genress message {string}")
    public void validateResponseInvalidBodyMentorGenressMessage(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate message JSON Schema invalid mentor genress")
    public void validateMessageJSONSchemaInvalidMentorGenress() {File json = new File(Constants.JSON_SCHEMA_GENRE+"POSTinvalidmentorgenresJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // valid data delete
    @When("Delete mentor with valid paramater id {int}")
    public void deletementorwithvalidparamaterid(int id){
        genreAPI.postmentorgenresid(id);
    }

    @And("request for delete mentor genre")
    public void requestForDeleteMentorGenre() {SerenityRest.when().delete(GenreAPI.DELETE_ALL_MENTOR_WITH_ID);
    }

    @And("Validate response body delete message should be {string}")
    public void validateResponseBodyDeleteMessageShouldBe(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate message delete JSON Schema")
    public void validateMessageDeleteJSONSchema() {File json = new File(Constants.JSON_SCHEMA_GENRE+"DELETEallmentorJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // invalid id delete
    @When("Delete mentor with invalid paramater id {}")
    public void deleteMentorWithInvalidParamater(int id) {genreAPI.postmentorgenresid(id);
    }

    @And("request for delete mentor genre with invalid params")
    public void requestForDeleteMentorGenreWithInvalidParams() {SerenityRest.when().delete(GenreAPI.DELETE_ALL_MENTOR_WITH_ID);
    }

    @And("Validate message invalid delete JSON Schema")
    public void validateMessageInvalidDeleteJSONSchema() {File json = new File(Constants.JSON_SCHEMA_GENRE+"DELETEallmentorJSONSchema.json");
    }
}
