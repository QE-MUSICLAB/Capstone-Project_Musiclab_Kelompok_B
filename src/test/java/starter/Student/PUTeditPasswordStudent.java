package starter.Student;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Utils.MusiclabResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;
public class PUTeditPasswordStudent {
    @Steps
    StudentAPI studentAPI;

    // put edit password with valid request body
    @When("edit student password with valid request body")
    public void editstudentpassword(){
        File json =new File(Constants.REQ_BODY_STUDENT+"/PUTeditpasswordstudent.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("request for edit student password")
    public void requestForEditStudentPassword() {
        SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PASSWORD);
    }

    @And("Validate response body message {string}")
    public void validateResponseBodyMessage(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate message JSON Schema")
    public void validateMessageJSONSchema() {File json = new File(Constants.JSON_SCHEMA+"PUTeditpasswordJSONSchema.json");
       SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// invalid request body
    @When("edit student password with wrong old password on request body")
    public void editStudentPasswordWithWrongOldPasswordOnRequestBody() {File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditinvalidpasswordstudent.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("request for wrong old password")
    public void requestForWrongOldPassword() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PASSWORD);
    }

    @And("Validate respon body message {string}")
    public void validateResponBodyMessage(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate message Json schema")
    public void validateMessageJsonSchema() {File json = new File(Constants.JSON_SCHEMA+"PUTeditinvalidpasswordJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// empty old password
    @When("edit student password with empty old password on request body")
    public void editStudentPasswordWithEmptyOldPasswordOnRequestBody() {File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditemptyoldpasswordstudent.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("request for empty old password")
    public void requestForEmptyOldPassword() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PASSWORD);
    }

    @And("Validate message Json schemas")
    public void validateMessageJsonSchemas() {File json = new File(Constants.JSON_SCHEMA+"PUTeditemptyoldpasswordJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// empty new password
    @When("edit student password with empty new password on request body")
    public void editStudentPasswordWithEmptyNewPasswordOnRequestBody() {File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditemptynewpasswordstudent.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("request for empty new password")
    public void requestForEmptyNewPassword() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PASSWORD);
    }
}
