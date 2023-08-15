package starter.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Utils.MusiclabResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class PUTStudentProfileStepDef {
    @Steps
    StudentAPI studentAPI;
    // put update student profile
    @When("put edit student profile with valid request body")
    public void editStudentProfile(){
        File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditstudentprofile.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("send put request for body student profile")
    public void sendPutRequestForBodyStudentProfile() {
        SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PROFILE);
    }

    @And("Validate response body update student profile for message should be {string}")
    public void validateResponseBodyUpdateStudentProfileForMessageShouldBe(String message) {
        SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }
    @And("Validate message respon body JSON Schema")
    public void validateMessageResponBodyJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA+"PUTeditprofilestudentJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// invalid
    @When("put edit student profile with empty name on request body")
    public void putEditStudentProfileWithEmptyNameOnRequestBody() {
        File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditstudentprofileemptyname.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("send put request for body empty name")
    public void sendPutRequestForBodyEmptyName() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PROFILE_EMPTY_NAME);
    }

    @And("Validate respon body {string}")
    public void validateResponBody(String message) { SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }
//invalid params
    @When("put edit student profile with invalid params")
    public void putEditStudentProfileWithInvalidParams() {
        File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditstudentprofile.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("send put request for invalid params")
    public void sendPutRequestForInvalidParams() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PROFIE_INVALID_PARAMS);
    }

    @And("Validate response body for message {string}")
    public void validateResponseBodyForMessage(String message) {
        SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }
//with empty body request
    @When("put edit studet profile with empty request body")
    public void putEditStudetProfileWithEmptyRequestBody() {File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditstudentprofileEmptyBody.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("send put request for empty request body")
    public void sendPutRequestForEmptyRequestBody() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PROFILE);
    }

    @And("Validate response JSON Schema")
    public void validateResponseMessage() {
        File json = new File(Constants.JSON_SCHEMA+"/PUTeditprofilestudentEmptyJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
