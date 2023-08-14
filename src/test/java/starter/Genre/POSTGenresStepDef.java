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

public class POSTGenresStepDef {

    @Steps
    GenreAPI genreAPI;
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
}
