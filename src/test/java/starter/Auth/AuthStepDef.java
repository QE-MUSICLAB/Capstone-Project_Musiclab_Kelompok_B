package starter.Auth;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Utils.MusiclabResponses;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class AuthStepDef {

    @Steps
    AuthAPI authAPI;
    ///////////////////////////////////////////////////////////////////////// REGISTER STUDENT
    @Given("Register new student with valid data")
    public void registerNewStudentWithValidData() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewStudent.json");
    authAPI.setPostRegisterNewStudent(json);
    }

    @When("Send request body for register new student")
    public void setRequestBodyForRegisterStudent() {
    SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_STUDENT);
    }


    @And("Validate register student with json schema validator")
    public void validateRegisterStudentWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/PostRegisterNewStudentSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    @Given("Register new student with invalid data")
    public void registerNewStudentWithInvalidData() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewStudentWithInvalidData.json");
    authAPI.setPostRegisterNewStudent(json);
    }

    @When("Send request body for register student with invalid data")
    public void sendRequestBodyForRegisterStudentWithInvalidData() {
        SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_STUDENT);
    }

    @And("Validate register student using invalid data with json schema validator")
    public void validateRegisterStudentUsingInvalidDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/PostRegisterNewStudentWithInvalidDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new student without data")
    public void registerNewStudentWithoutData() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewStudentWithoutData.json");
    authAPI.setPostRegisterNewStudent(json);
    }

    @When("Send request body for register new student without data")
    public void validateRegisterClassUsingWithoutDataWithJsonSchemaValidator() {
     SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_STUDENT);
    }

    @And("Validate register student without data with json schema validator")
    public void apiShouldReturnResponseBodyMessageErrorBindData() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/RegisterNewStudentWithoutDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new student with invalid path")
    public void registerNewStudentWithInvalidPath() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewStudentWithInvalidPath.json");
    authAPI.setPostRegisterNewStudent(json);
    }

    @When("Send request body for register new student with invalid path")
    public void setRequestBodyForRegisterNewStudentWithInvalidPath() {
    SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_STUDENT_INVALID_PATH);}

    @And("Validate register student using invalid path data with json schema validator")
    public void validateRegisterStudentUsingInvalidPathDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/RegisterNewStudentWithInvalidPathSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new student with incomplete data")
    public void registerNewStudentWithIncompleteData() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewStudentWithIncompleteData.json");
   authAPI.setPostRegisterNewStudent(json);
    }

    @When("Send request body for register new student with incomplete data")
    public void sendRequestBodyForRegisterNewStudentWithIncompleteData() {
    SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_STUDENT);
    }
    @And("Validate register student using incomplete data with json schema validator")
    public void validateRegisterStudentUsingIncompleteDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/RegisterNewStudentWithIncompleteDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new student with data has been used")
    public void registerNewStudentWithDataHasBeenUsed() {
    File json = new File(Constants.REQ_BODY + "/RegisterNewStudentWithDataHasBeenUsed.json");
    authAPI.setPostRegisterNewStudent(json);
    }

    @When("Send request body for register new student with data has been used")
    public void sendRequestBodyForRegisterNewStudentWithDataHasBeenUsed() {
        SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_STUDENT);
    }

    @And("Validate register student using data has been used with json schema validator")
    public void validateRegisterStudentUsingDataHasBeenUsedWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/RegisterNewStudentWithIncompleteDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
///////////////////////////////////////// REGISTER MENTOR
    @Given("Register new mentor with valid data")
    public void registerNewMentorWithValidData() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewMentorWithValidData.json");
    authAPI.setPostRegisterNewMentor(json);
    }

    @When("Send request body for register new mentor")
    public void sendRequestBodyForRegisterNewMentor() {
    SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_MENTOR);
    }
    @And("Validate register mentor with json schema validator")
    public void validateRegisterMentorWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/PostRegisterNewStudentSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new mentor with invalid data")
    public void registerNewMentorWithInvalidData() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewMentorWithInvalidData.json");
    authAPI.setPostRegisterNewMentor(json);
    }

    @When("Send request body for register new mentor with invalid data")
    public void sendRequestBodyForRegisterNewMentorWithInvalidData() {
   SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_MENTOR);
    }
    @And("Validate register mentor using invalid data with json schema validator")
    public void validateRegisterMentorUsingInvalidDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/PostRegisterNewStudentWithInvalidDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new mentor without data")
    public void registerNewMentorWithoutData() {
   File json = new File(Constants.REQ_BODY + "/PostRegisterNewMentorWithoutData.json");
   authAPI.setPostRegisterNewMentor(json);
    }

    @When("Send request body for register new mentor without data")
    public void sendRequestBodyForRegisterNewMentorWithoutData() {
        SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_MENTOR);
    }
    @And("Validate register mentor without data with json schema validator")
    public void validateRegisterMentorWithoutDataWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/RegisterNewStudentWithoutDataSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new mentor with invalid path")
    public void registerNewMentorWithInvalidPath() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewMentorWithInvalidPath.json");
    authAPI.setPostRegisterNewMentor(json);
    }

    @When("Send request body for register new mentor with invalid path")
    public void sendRequestBodyForRegisterNewMentorWithInvalidPath() {
    SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_MENTOR_INVALID_PATH);
    }
    @And("Validate register mentor using invalid path data with json schema validator")
    public void validateRegisterMentorUsingInvalidPathDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/RegisterNewStudentWithInvalidPathSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new Mentor with incomplete data")
    public void registerNewMentorWithIncompleteData() {
     File json = new File(Constants.REQ_BODY + "/PostRegisterNewMentorWithIncompleteData.json");
     authAPI.setPostRegisterNewMentor(json);
    }

    @When("Send request body for register new Mentor with incomplete data")
    public void sendRequestBodyForRegisterNewMentorWithIncompleteData() {
    SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_MENTOR);
    }
    @And("Validate register mentor using incomplete data with json schema validator")
    public void validateRegisterMentorUsingIncompleteDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/RegisterNewStudentWithIncompleteDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Register new Mentor with data has been used")
    public void registerNewMentorWithDataHasBeenUsed() {
    File json = new File(Constants.REQ_BODY + "/PostRegisterNewMentorWithDataHasBeenUsed.json");
    authAPI.setPostRegisterNewMentor(json);
    }

    @When("Send request body for register new Mentor with data has been used")
    public void sendRequestBodyForRegisterNewMentorWithDataHasBeenUsed() {
    SerenityRest.when().post(AuthAPI.POST_REGISTER_NEW_MENTOR);
    }
    @And("Validate register mentor using data has been used with json schema validator")
    public void validateRegisterMentorUsingDataHasBeenUsedWithJsonSchemaValidator() {
     File json = new File(Constants.JSON_SCHEMA_AUTH_REGIST_STUDENT + "/RegisterNewStudentWithIncompleteDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    ///////////////////////////////////////////////////////////////////////LOGIN STUDENTS
    @Given("Login student with valid data")
    public void loginStudentWithValidData() {
    File json = new File(Constants.REQ_BODY + "/LoginStudentWithValidData.json");
    authAPI.setPostLoginStudent(json);
    }

    @When("Send request body for login student")
    public void sendRequestBodyForLoginStudent() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_STUDENT);
    }

    @And("Validate login student with json schema validator")
    public void validateLoginStudentWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithValidDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Login student with invalid data using unregistered student")
    public void loginStudentWithInvalidDataUsingUnregisteredStudent() {
    File json = new File(Constants.REQ_BODY + "/LoginStudentWithUnregisteredStudent.json");
    authAPI.setPostLoginStudent(json);
    }

    @When("Send request body for login student using unregistered student")
    public void sendRequestBodyForLoginStudentUsingUnregisteredStudent() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_STUDENT);
    }

    @And("Validate login student using invalid data with json schema validator")
    public void validateLoginStudentUsingInvalidDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithUnregisteredStudentSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Login student without request body")
    public void loginStudentWithoutRequestBody() {
    File json = new File(Constants.REQ_BODY + "/LoginStudentWithoutRequestBody.json");
    authAPI.setPostLoginStudent(json);
    }

    @When("Send request body for login student without data")
    public void sendRequestBodyForLoginStudentWithoutData() {
   SerenityRest.when().post(AuthAPI.POST_LOGIN_STUDENT);
    }

    @And("Validate login student without request body data with json schema validator")
    public void validateLoginStudentWithoutRequestBodyDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithoutReqBodySchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Login student with invalid path")
    public void loginStudentWithInvalidPath() {
    File json = new File(Constants.REQ_BODY + "/LoginStudentWithValidData.json");
    authAPI.setPostLoginStudent(json);
    }

    @When("Send request body for login student with invalid path")
    public void sendRequestBodyForLoginStudentWithInvalidPath() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_STUDENT_INVALID_PATH);
    }

    @And("Validate login student using invalid path data with json schema validator")
    public void validateLoginStudentUsingInvalidPathDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithInvalidPathSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Login student with incomplete data")
    public void loginStudentWithIncompleteData() {
    File json = new File(Constants.REQ_BODY + "/LoginStudentWithIncompleteData.json");
    authAPI.setPostLoginStudent(json);
    }

    @When("Send request body for login student with incomplete data")
    public void sendRequestBodyForLoginStudentWithIncompleteData() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_STUDENT);
    }
    @And("Validate login student using incomplete data data with json schema validator")
    public void validateLoginStudentUsingIncompleteDataDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithIncompleteDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    ///////////////////////////////////////////////////////////////////////LOGIN MENTOR
    @Given("Login Mentor with valid data")
    public void loginMentorWithValidData() {
    File json = new File(Constants.REQ_BODY + "/LoginMentorWithValidData.json");
    authAPI.setPostLoginMentor(json);
    }

    @When("Send request body for login Mentor")
    public void sendRequestBodyForLoginMentor() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_MENTOR);
    }
    @And("Validate login mentor with json schema validator")
    public void validateLoginMentorWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithValidDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Login mentor with invalid data using unregistered mentor")
    public void loginMentorWithInvalidDataUsingUnregisteredMentor() {
    File json = new File(Constants.REQ_BODY + "/LoginMentorWithUnregisteredMentor.json");
    authAPI.setPostLoginMentor(json);
    }

    @When("Send request body for login mentor using unregistered mentor")
    public void sendRequestBodyForLoginMentorUsingUnregisteredMentor() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_MENTOR);
    }
    @And("Validate login mentor using invalid data with json schema validator")
    public void validateLoginMentorUsingInvalidDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithUnregisteredStudentSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }


    @Given("Login mentor without request body")
    public void loginMentorWithoutRequestBody() {
    File json = new File(Constants.REQ_BODY + "/LoginMentorWithoutRequestBody.json");
    authAPI.setPostLoginMentor(json);
    }

    @When("Send request body for login mentor without data")
    public void sendRequestBodyForLoginMentorWithoutData() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_MENTOR);
    }
    @And("Validate login mentor without request body data with json schema validator")
    public void validateLoginMentorWithoutRequestBodyDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithoutReqBodySchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Login mentor with invalid path")
    public void loginMentorWithInvalidPath() {
    File json = new File(Constants.REQ_BODY + "/LoginMentorWithValidData.json");
    authAPI.setPostLoginMentor(json);
    }

    @When("Send request body for login mentor with invalid path")
    public void sendRequestBodyForLoginMentorWithInvalidPath() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_MENTOR_INVALID_PATH);}

    @And("Validate login mentor using invalid path data with json schema validator")
    public void validateLoginMentorUsingInvalidPathDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithInvalidPathSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Login mentor with incomplete data")
    public void loginMentorWithIncompleteData() {
    File json = new File(Constants.REQ_BODY + "/LoginMentorIncompleteData.json");
    authAPI.setPostLoginMentor(json);
    }

    @When("Send request body for login mentor with incomplete data")
    public void sendRequestBodyForLoginMentorWithIncompleteData() {
    SerenityRest.when().post(AuthAPI.POST_LOGIN_MENTOR);}

    @And("Validate login mentor using incomplete data data with json schema validator")
    public void validateLoginMentorUsingIncompleteDataDataWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_AUTH_LOGIN + "/LoginStudentWithIncompleteDataSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}




