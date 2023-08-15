package starter.Mentor;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;

import java.io.File;

public class MentorStepDef {
    @Steps
    MentorAPI mentorAPI;
////////////////////////////////////////////// GET ALL MENTOR

    @Given("Get all mentor with valid path")
    public void getAllMentorWithValidPath() {
        mentorAPI.setGetAllMentor();
    }

    @When("Send request get for all mentor")
    public void sendRequestGetForAllMentor() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTOR);
    }

    @And("API should return response body message success show all mentor")
    public void apiShouldReturnResponseBodyMessageSuccessShowAllMentor() {
    }
    @And("Validate Get all mentor with json schema validator")
    public void validateGetAllMentorWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_MENTOR + "/GetAllMentorWithValidPathSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("Get all mentor with invalid path")
    public void getAllMentorWithInvalidPath() {
        mentorAPI.setGetAllMentor();
    }

    @When("Send request get for all mentor with invalid path")
    public void sendRequestGETForGetAllMentorWithInvalidPath() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTOR_INVALID);
    }
    @And("Validate Get all mentor using invalid path with json schema validator")
    public void validateGetAllMentorUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/GetAllMentorWithOutPathSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("Get all mentor Get all mentor without path")
    public void getAllMentorGetAllMentorWithoutPath() {
        mentorAPI.setGetAllMentor();
    }

    @When("Send request Get for get all mentor Get all mentor without path")
    public void sendRequestGetForGetAllMentorGetAllMentorWithoutPath() {
        SerenityRest.when().get(MentorAPI.GET_ALL_MENTOR_WITHOUT_PATH);
    }
    @And("Validate Get all mentor using without path with json schema validator")
    public void validateGetAllMentorUsingWithoutPathWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/GetAllMentorWithOutPathSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }

//////////////////////////////////// GET MENTOR PROFILE BY ID ///////////////////////////////////////////////////////////////////////
    @Given("Get mentor profile with valid path id {int}")
    public void getMentorProfileWithValidPathId(int id) {
    mentorAPI.setGetMentorProfileById(id);
}
    @When("Send request get for mentor profile valid path")
    public void sendRequestGetForGetMentorProfileValid() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_PROFILE_BYID);
    }

    @And("Validate get mentor profile with json schema validator")
    public void validateGetAllMentorProfileWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_MENTOR + "/GetMentorWithValidPathSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("Get mentor profile with invalid id path special character {}")
    public void getMentorProfileWithInvalidIdPathSpecialCharacter(String character) {
        mentorAPI.setGetAllMentorProfileInvalid(character);

    }

    @When("Send request get for get mentor profile with special character")
    public void sendRequestGetForGetMentorProfileWithSpecialCharacter() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_PROFILE_INVALID_CHAR);
    }
    @And("Validate get mentor profile by id using invalid path with json schema validator")
    public void validateGetMentorProfileByIdUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/GetMentorProfileByIndInvalidPathScehma.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("Get mentor profile with unavailable path id {int}")
    public void getMentorProfileWithUnavailablePathId(int id) {
        mentorAPI.setGetMentorProfileById(id);
    }

    @When("Send request get for mentor profile unavailable path")
    public void sendRequestGetForMentorProfileUnavailablePath() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_PROFILE_BYID);
    }
    @And("Validate get mentor profile by id with json schema validator")
    public void validateGetMentorProfileByIdkWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/GetMentorProfileByIndInvalidPathScehma.json");
        mentorAPI.setPutEditMentorProfile(json);}



///////////////////////////////////////////////////////////GET MENTOR TOP WEEK///////////////////////////////////////////////////////////////

    @Given("Get mentor top week with valid path")
    public void getMentorTopWeekWithValidPath() {
        mentorAPI.setGetMentorTopWeek();
    }

    @When("Send request get for get mentor top week")
    public void sendRequestGetForGetMentorTopWeek() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_TOP_WEEK);
    }
    @And("Validate get mentor top week with json schema validator")
    public void validateGetMentorTopWeekWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/GetMentorTopWeekSchema.json");
        mentorAPI.setPutEditMentorProfile(json);}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("Get mentor top week with invalid path")
    public void getMentorTopWeekWithInvalidPath() {
        mentorAPI.setGetMentorTopWeekInvalid();}

    @When("Send request get for get mentor top week with invalid path")
    public void sendRequestGetForGetMentorTopWeekWithInvalidPath() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_TOP_WEEK_INVALID);
    }
    @And("Validate get mentor top week using invalid path with json schema validator")
    public void validateGetMentorTopWeekUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/GetMentorTopWeekInvalidPathSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
////////////////////////////////////////////////GET MENTOR TOP PROFILE//////////////////////////////////////////////////////////////////
    @Given("Get mentor profile with valid path")
    public void getMentorProfileWithValidPath() {
        mentorAPI.setGetMentorProfile();
    }

    @And("Send request get for mentor profile")
    public void sendRequestGetForMentorProfile() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_PROFILE);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Get mentor profile with invalid path")
    public void getMentorProfileWithInvalidPath() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_PROFILE_INVALID);
    }

    @And("Send request get for mentor profile with invalid path")
    public void sendRequestGetForMentorProfileWithInvalidPath() {
        SerenityRest.when().get(MentorAPI.GET_MENTOR_PROFILE_INVALID);
    }
    @And("Validate get mentor profile using invalid path with json schema validator")
    public void validateGetMentorProfileUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/GetMentorProfileInvalidPathSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
///////////////////////////////////////////////PUT EDIT MENTOR PROFILE//////////////////////////////////////////////////////////////////////////////////////
    @When("Put Update mentor profile with valid request body")
    public void putUpdateMentorProfileWithValidRequestBody() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/EditMentorProfileReqBody.json");
        mentorAPI.setPutEditMentorProfile(json);
    }

    @And("Send request put for edit mentor profile")
    public void sendRequestPutForEditMentorProfile() {
        SerenityRest.when().put(MentorAPI.PUT_EDIT_MENTOR_PROFILE);
    }

    @And("Validate put mentor profile with json schema validator")
    public void validatePutMentorProfileWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_MENTOR + "/PutEditMentorProfileSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    @And("Validate put mentor profile using empty value body with json schema validator")
    public void validatePutMentorProfileUsingEmptyValueBodyWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditMentorProfileWithEmptyValueSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put Update mentor profile with invalid request body")
    public void putUpdateMentorProfileWithInvalidRequestBody() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditMentorProfileInvalidPath.json");
        mentorAPI.setPutEditMentorProfile(json);
    }

    @And("Send request put for edit mentor profile with invalid request body")
    public void sendRequestPutForEditMentorProfileWithInvalidRequestBody() {
        SerenityRest.when().put(MentorAPI.PUT_EDIT_MENTOR_PROFILE_INVALID);
    }
    @And("Validate put mentor profile using invalid request body with json schema validator")
    public void validatePutMentorProfileUsingInvalidRequestBodyWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_MENTOR + "/PutEditMentorProfileWithInvalidReqSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put Update mentor profile with empty value body")
    public void putUpdateMentorProfileWithEmptyValueBody() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditMentorProfileWithEmptyValue.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
//////////////////////////////////////////////////////PUT EDIT PASSWORD MENTOR//////////////////////////////////////////////////////////////////////////////////
    @When("Put edit mentor password with valid request body")
    public void putEditMentorPasswordWithValidRequestBody() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorValidReqBody.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
    @And("Send request body for update mentor password")
    public void sendRequestBodyForUpdateMentorPassword() {
        SerenityRest.when().put(MentorAPI.PUT_EDIT_PASSWORD_MENTOR);
    }

    @And("Validate put edit password with json schema validator")
    public void validatePutEditPasswordWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_MENTOR + "/PutEditPasswordMentorSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    @And("Validate put edit password using invalid request body with json schema validator")
    public void validatePutEditPasswordUsingInvalidRequestBodyWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorInvalidReqSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
    @And("Validate put edit password using empty old password with json schema validator")
    public void validatePutEditPasswordUsingEmptyOldPasswordWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorEmptyPassSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
    @And("Validate put edit password using empty new password with json schema validator")
    public void validatePutEditPasswordUsingEmptyNewPasswordWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorEmptyPassSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
    @And("Validate put edit password using empty confirmation password with json schema validator")
    public void validatePutEditPasswordUsingEmptyConfirmationPasswordWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorEmptyPassSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
    @And("Validate put edit password using all empty value of password with json schema validator")
    public void validatePutEditPasswordUsingAllEmptyValueOfPasswordWithJsonSchemaValidator() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorEmptyPassSchema.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put edit mentor password with invalid request body")
    public void putEditMentorPasswordWithInvalidRequestBody() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorInvalidReqBody.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put edit mentor password with empty old password")
    public void putEditMentorPasswordWithEmptyOldPassword() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditMentorPasswordEmptyOldPass.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put edit mentor password with empty new old password")
    public void putEditMentorPasswordWithNewOldPassword() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordEmptyNewPass.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put edit mentor password with empty confirmation old password")
    public void putEditMentorPasswordWithEmptyConfirmationOldPassword() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordEmptyConfirmationPass.json");
        mentorAPI.setPutEditMentorProfile(json);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put edit mentor password with all empty value of password")
    public void putEditMentorPasswordWithAllEmptyValueOfPassword() {
        File json = new File(Constants.REQ_BODY_MENTOR + "/PutEditPasswordMentorWithAllValueEmpty.json");
        mentorAPI.setPutEditMentorProfile(json);
    }



}

