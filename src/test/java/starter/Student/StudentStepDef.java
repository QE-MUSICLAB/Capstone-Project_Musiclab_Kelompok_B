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
}
