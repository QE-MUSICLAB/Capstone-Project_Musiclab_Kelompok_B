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

    @And("validate response body message {string}")
    public void validateResponseBodyMessagee(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
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
    // confirmation password
    @When("edit student password with empty confirmation password on request body")
    public void editStudentPasswordWithEmptyConfirmationPasswordOnRequestBody() {File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditemptyconfirmationpasswordstudent.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("request for empty confirmation password")
    public void requestForEmptyConfirmationPassword() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PASSWORD);
    }

    @And("Validate message confirmation Json schema")
    public void validateMessageConfirmationJsonSchema() {File json = new File(Constants.JSON_SCHEMA+"PUTeditemptyconfirmationpasswordJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // empty request body
    @When("edit student password with empty request body")
    public void editStudentPasswordWithEmptyRequestBody() {File json = new File(Constants.REQ_BODY_STUDENT+"/PUTeditemptyrequestbodypassword.json");
        studentAPI.puteditstudentprofile(json);
    }

    @And("request for empty request body")
    public void requestForEmptyRequestBody() {SerenityRest.when().put(StudentAPI.PUT_EDIT_STUDENT_PASSWORD);
    }

    @And("Validate message empty request body JSON Schema")
    public void validateMessageEmptyRequestBodyJSONSchema() {File json = new File(Constants.JSON_SCHEMA+"PUTeditemptybodyJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // delete valid path
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
