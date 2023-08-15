package starter.Review;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Auth.AuthAPI;
import starter.Utils.Constants;

import java.io.File;

public class ReviewStepDef {
    @Steps
    ReviewAPI reviewAPI;
/////////////////////////////////////////POST REVIEW CLASS ///////////////////////////////////////////////////////////////////////////
    @When("Post make review class with valid request body using valid path {int}")
    public void postMakeReviewClassWithValidRequestBodyUsingValidPath(int id) {
        File json = new File(Constants.REQ_BODY_REVIEW + "/PostCreateReviewValidReq.json");
        reviewAPI.setPostReviewMentorValid(id,json);
    }
    @And("Send request body for create review mentor")
    public void sendRequestBodyForCreateReviewMentor() {
        SerenityRest.when().post(ReviewAPI.POST_REVIEW_MENTOR);
    }
    @And("Validate Post make review class with json schema validator")
    public void validatePostMakeReviewClassWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_REVIEW + "/ReviewValidMentorSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Post make review class with invalid request body using invalid path {int}")
    public void postMakeReviewClassWithInvalidRequestBodyUsingInvalidPath(int id) {
        File json = new File(Constants.REQ_BODY_REVIEW + "/PostCreateReviewInvalidReqBody.json");
        reviewAPI.setPostReviewMentorValid(id,json);
    }
    @And("Validate Post make review class invalid request body using invalid path with json schema validator")
    public void validatePostMakeReviewClassInvalidRequestBodyUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_REVIEW + "/PostCreateReviewInvalidReqBodySchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Post make review class with empty request body using valid path {int}")
    public void postMakeReviewClassWithEmptyRequestBodyUsingValidPath(int id) {
        File json = new File(Constants.REQ_BODY_REVIEW + "/PostCreateReviewEmptyReqBody.json");
        reviewAPI.setPostReviewMentorValid(id,json);}
        @And("Validate Post make review class empty request body using invalid path with json schema validator")
        public void validatePostMakeReviewClassEmptyRequestBodyUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_REVIEW + "/PostCreateReviewInvalidReqBodySchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
        }

/////////////////////////////////////////////////////GET MENTOR REVIEW /////////////////////////////////////////////////////////////////////////
    @When("Get mentor review class with valid path {int}")
    public void getMentorReviewClassWithValidPath(int id) {
    reviewAPI.setGetReviewMentor(id);
    }

    @And("Send get request for review mentor")
    public void sendGetRequestForReviewMentor() {
        SerenityRest.when().get(ReviewAPI.GET_REVIEW_MENTOR);
    }

    @And("Validate get review mentor with json schema validator")
    public void validateGetReviewMentorWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_REVIEW + "/ReviewGetMentorSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @When("Get mentor review class with invalid path {int}")
    public void getMentorReviewClassWithInvalidPath(int id) {
        reviewAPI.setGetReviewMentor(id);
    }
    @And("Validate get review class using invalid path with json schema validator")
    public void validateGetReviewClassUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_REVIEW + "/GetMentorReviewWithInvalidPathSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));

    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Get mentor review class with empty path")
    public void getMentorReviewClassWithEmptyPath() {
        reviewAPI.setGetReviewMentorEmpty();
    }

    @And("Send get request for review mentor with empty path")
    public void sendGetRequestForReviewMentorWithEmptyPath() {
        SerenityRest.when().get(ReviewAPI.GET_REVIEW_MENTOR_EMPTY);
    }

    @And("Validate get review class using empty path with json schema validator")
    public void validateGetReviewClassUsingEmptyPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_REVIEW + "/GetMentorReviewWithEmptyPathSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }



}
