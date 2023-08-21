package starter.Instrument;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Utils.MusiclabResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class InstrumentStepDef {
    @Steps
    InstrumentAPI instrumentAPI;

    //GET INSTRUMENTS WITH VALID PATH
    @Given("Get list instruments data")
    public void getListInstrumentsData() {
        instrumentAPI.getAllInstruments();
    }
    @When("User send request get list instruments with valid path")
    public void userSendRequestGetListInstruments() {
        SerenityRest.when()
                .get(InstrumentAPI.INSTRUMENT_PATH);
    }
    @And("Validate get list instruments schema")
    public void validateGetListUsersSchema() {
        File json = new File(Constants.JSON_SCHEMA_INSTRUMENTS + "/GetListInstruments.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //GET INSTRUMENTS WITH INVALID PATH
    @When("User send request get list instruments with invalid path")
    public void userSendRequestGetListInstrumentsWithInvalidPath() {
        SerenityRest.when()
                .get(InstrumentAPI.INSTRUMENT_PATH + "123");
    }

    //POST MENTOR INSTRUMENT WITH VALID DATA
    @And("Post mentor instrument with valid json")
    public void postMentorInstrumentWithValidJson() {
        File json = new File(Constants.REQ_BODY_INSTRUMENTS + "/ValidPostMentorInstrument.json");
        instrumentAPI.postMentorInstruments(json);
    }
    @When("Send request post mentor instrument")
    public void sendRequestPostMentorInstrumentWithData() {
        SerenityRest.when().post(InstrumentAPI.INSTRUMENT_POST);
    }

    //POST MENTOR INSTRUMENT WITH INVALID DATA
    @And("Post mentor instrument with invalid json")
    public void postMentorInstrumentWithInvalidJson() {
        File json = new File(Constants.REQ_BODY_INSTRUMENTS + "/InvalidPostMentorInstrument.json");
        instrumentAPI.postMentorInstruments(json);
    }
    @And("Validate response body message {string}")
    public void validateResponseBodyMessage(String message) {
        SerenityRest.and()
                .body(MusiclabResponses.MESSAGE, equalTo(message));
    }

    //POST MENTOR INSTRUMENT WITH INVALID PATH
    @When("Send request post mentor instrument with invalid path")
    public void sendRequestPostMentorInstrumentWithInvalidPath() {
        SerenityRest.when().post(InstrumentAPI.INSTRUMENT_POST + "apaya");
    }

    //GET INSTRUMENT WITH VALID ID MENTOR
    @And("Get list instruments with valid mentor id {int}")
    public void getListInstrumentsByMentorId(int mentor_id) {
        instrumentAPI.getAllInstrumentsByMentorId(mentor_id);
    }
    @When("User send request list instruments by mentor id")
    public void userSendRequestListInstrumentsByMentorIdWithValidPath() {
        SerenityRest.when().get(InstrumentAPI.INSTRUMENT_BY_MENTORID);
    }
    @And("Validate get list instruments by mentor id schema")
    public void validateGetListInstrumentsByMentorIdSchema() {
        File json = new File(Constants.JSON_SCHEMA_INSTRUMENTS + "/GetListInstrumentsByMentorID.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //GET INSTRUMENT WITH INVALID ID MENTOR
    @And("Get list instruments with invalid mentor id {string}")
    public void getListInstrumentsWithInvalidMentorId(String id) {
        instrumentAPI.getAllInstrumentsByMentorId(id);
    }

    //GET INSTRUMENT WITH EMPTY ID MENTOR
    @And("Get list instruments with empty mentor id {}")
    public void getListInstrumentsWithEmptyMentorId(String id) {
        instrumentAPI.getAllInstrumentsByMentorId(id);
    }

    //DELETE MENTOR INSTRUMENT WITH VALID ID
    @And("Delete instrument with valid id {int}")
    public void deleteInstrumentWithValidId(int id) {
        instrumentAPI.deleteMentorInstrument(id);
    }
    @When("User send request delete instrument")
    public void userSendRequestDeleteInstrument() {
        SerenityRest.when().delete(InstrumentAPI.MENTOR_INSTRUMENT_DELETE);
    }

    //DELETE MENTOR INSTRUMENT WITH INVALID ID
    @And("Delete instrument with invalid id {string}")
    public void deleteInstrumentWithInvalidId(String id) {
        instrumentAPI.deleteMentorInstrument(id);
    }

    //DELETE MENTOR INSTRUMENT WITH EMPTY ID
    @And("Delete instrument with empty id {}")
    public void deleteInstrumentWithEmptyId(String id) {
        instrumentAPI.deleteMentorInstrument(id);
    }



}
