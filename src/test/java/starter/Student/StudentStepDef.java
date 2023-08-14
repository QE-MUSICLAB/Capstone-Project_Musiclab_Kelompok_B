package starter.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.specification.Argument;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Utils.MusiclabResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;


public class StudentStepDef {

    @Steps
    StudentAPI studentAPI;

    @When("show student profile with valid params")
    public void showStudentProfileWithValidParams() {
        studentAPI.setGetAllStudent();
    }

    @And("request for show student profile with valid params")
    public void requestForShowStudentProfileWithValidParams() {
        SerenityRest.when().get(StudentAPI.GET_STUDENT_VALID);
    }

    @And("Validate response body for message should be {string}")
    public void validateResponseBodyForMessageShouldBe(String message) {
        SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate get student profile JSON Schema")
    public void validateGetStudentProfileJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA+ "GetStudentProfileJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// get invalid method
    @When("show student profile with invalid method")
    public void showStudentProfileWithInvalidMethod() {studentAPI.setGetAllStudent();
    }

    @And("request for show student profile with invalid method")
    public void requestForShowStudentProfileWithInvalidMethod() {SerenityRest.when().get(StudentAPI.GET_STUDENT_INVALID);
    }

    @And("Validate response invalid method body for message should be {string}")
    public void validateResponseInvalidmethodBodyForMessageShouldBe(String message) {
        SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate get student profile invalid method JSON Schema")
    public void validateGetStudentProfileInvalidmethodJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA+"GetProfileMethodNotAllowedJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// get student invalid params
    @When("show student profile with invalid params")
    public void showStudentProfileWithInvalidParams() {studentAPI.setGetAllStudent();
    }

    @And("request for show student profile with invalid params")
    public void requestForShowStudentProfileWithInvalidParams() {SerenityRest.when().get(StudentAPI.GET_STUDENT_INVALID_PARAMS);

    }

    @And("Validate response invalid params body for message should be {string}")
    public void validateResponseInvalidParamsBodyForMessageShouldBe(String message) {
        SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));

    }

    @And("Validate get student profile invalid params JSON Schema")
    public void validateGetStudentProfileInvalidParamsJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA+"GETJSONSchemainvalidParams.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
