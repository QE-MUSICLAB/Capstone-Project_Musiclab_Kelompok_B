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

public class DELETEgenresStepDef {

    @Steps
    GenreAPI genreAPI;

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
