package starter.Student;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Utils.MusiclabResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;
public class DELETEdeactivestudentStepDef {

    @Steps
    StudentAPI studentAPI;

    @When("Delete student with valid path")
    public void deletestudentwithvalidpath(){
        studentAPI.setGetAllStudent();
    }

    @And("request for delete student")
    public void requestForDeleteStudent() {
        SerenityRest.when().delete(StudentAPI.DELETE_STUDENT_WITH_VALID_PATH);
    }

    @And("Validate response message {string}")
    public void validateResponseMessage(String message) {
        SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate JSON Schema")
    public void validateJSONSchema() {
        File json = new File(Constants.JSON_SCHEMA+"DELETEstudentwithvalidpathJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// invalid path
    @When("Delete student with invalid path")
    public void deleteStudentWithInvalidPath() {studentAPI.setGetAllStudent();
    }

    @And("request for delete student with invalid path")
    public void requestForDeleteStudentWithInvalidPath() {SerenityRest.when().delete(StudentAPI.DELETE_STUDENT_WITH_INVALID_PATH);
    }
}
