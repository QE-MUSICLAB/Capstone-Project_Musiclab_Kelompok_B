package starter.Class;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

import starter.Utils.Constants;

import java.io.File;

public class ClassStepDef {
    @Steps
    ClassAPI classAPI;


    @When("Post make class with valid request body")
    public void postMakeClassWithValidRequestBody() {
        File json = new File(Constants.REQ_BODY_CLASS + "/PostMakeClassWithValidBody.json");
        classAPI.setPostMakeClass(json);
    }
    @And("Send request body for create class")
    public void sendRequestBodyForCreateClass() {
        SerenityRest.when().post(ClassAPI.POST_MAKE_CLASS);
    }

    @And("Validate Post make class with json schema validator")
    public void validatePostMakeClassWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_CLASS + "/PostMakeClassWithValidBodySchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Post make class with valid request body using invalid path")
    public void postMakeClassWithValidRequestBodyUsingInvalidPath() {
        File json = new File(Constants.REQ_BODY_CLASS + "/PostMakeClassWithValidBody.json");
        classAPI.setPostMakeClass(json);
    }

    @And("Send request body for create class using invalid path")
    public void sendRequestBodyForCreateClassUsingInvalidPath() {
        SerenityRest.when().post(ClassAPI.POST_MAKE_CLASS_INVALID);
    }
    @And("Validate Post make class using invalid path with json schema validator")
    public void validatePostMakeClassUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_CLASS + "/PostMakeClassInvalidPathSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    ///////////////////////////////////////////////////////////////////////////////////
    @When("Post make class with incomplete request body")
    public void postMakeClassWithIncompleteRequestBody() {
        File json = new File(Constants.REQ_BODY_CLASS + "/PostMakeClassWithIncompleteBody.json");
        classAPI.setPostMakeClass(json);
    }

    @And("Send request body for create class with incomplete request body")
    public void sendRequestBodyForCreateClassWithIncompleteRequestBody() {
        SerenityRest.when().post(ClassAPI.POST_MAKE_CLASS);
    }
    @And("Validate Post make class using invalid incomplete request body with json schema validator")
    public void validatePostMakeClassUsingInvalidIncompleteRequestBodyWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_CLASS + "/PostMakeClassInvalidIncompleteBodySchema.json");
     SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
/////////////////////////////////////////////////////GET MENTOR CLASS////////////////////////////////////////////////////////////////////////////////

    @When("Get mentor class with valid path {}")
    public void getMentorClassWithValidPath(String id) {
        classAPI.setGetClassMentor(id);
    }

    @And("Send request GET for get mentor class")
    public void sendRequestGETForGetMentorClass() {
        SerenityRest.when().get(ClassAPI.GET_MENTOR_CLASS);
    }

    @And("Validate get mentor class with json schema validator")
    public void validateGetMentorClassWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_CLASS + "/GetClassMentorSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Get mentor class with invalid path {}")
    public void getMentorClassWithInvalidPath(String id) {
        classAPI.setGetClassMentor(id);
    }
    @And("Validate get mentor class using invalid path with json schema validator")
    public void validateGetMentorClassUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_CLASS + "/GetMentorClassWithEmptyPathSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Get mentor class with empty path")
    public void getMentorClassWithEmptyPath() {
        classAPI.setGetClassMentorWithEmptyPath();
    }

    @And("Send request GET for get mentor class with empty path")
    public void sendRequestGETForGetMentorClassWithEmptyPath() {
        SerenityRest.when().get(ClassAPI.GET_MENTOR_CLASS_WITHOUT);
    }
    @And("Validate get mentor class using empty path with json schema validator")
    public void validateGetMentorClassUsingEmptyPathWithJsonSchemaValidator() {
    }



    ///////////////////////////////////////////////////////GET ALL MENTOR CLASS///////////////////////////////////////////////////////////
    @When("Get all mentor class with valid path {}")
    public void getAllMentorClassWithValidPath(String id) {
        classAPI.setGetAllClassMentor(id);
    }

    @And("Send request GET for get all mentor class")
    public void sendRequestGETForGetAllMentorClass() {
        SerenityRest.when().get(ClassAPI.GET_MENTOR_ALL_CLASS);
    }
//////////////////////////////////////////////////////////////////////////////////////////////

    @When("Get all mentor class with invalid path {}")
    public void getAllMentorClassWithInvalidPath(String id) {
        classAPI.setGetAllClassMentor(id);
    }
    @And("Validate get all mentor class using invalid path with json schema validator")
    public void validateGetAllMentorClassUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_CLASS + "/GetAllMentorClassInvalidPathSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
///////////////////////////////////////////////////////////////////////////////////
    @When("Get all mentor class without path")
    public void getAllMentorClassWithoutPath() {
        classAPI.setGetAllClassMentorWithoutPath();
    }

    @And("Send request GET for get all mentor class without path")
    public void sendRequestGETForGetAllMentorClassWithoutPath() {
        SerenityRest.when().get(ClassAPI.GET_MENTOR_ALL_CLASS_EMPTY);}
    @And("Validate get all mentor class without path with json schema validator")
    public void validateGetAllMentorClassWithoutPathWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_CLASS + "/GetAllMentorClassIWithoutPathSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
        }




///////////////////////////////////////////////PUT UPDATE CLASSS/////////////////////////////////////////

    @When("Put update mentor class with valid request body using valid path {}")
    public void putUpdateMentorClassWithValidRequestBodyUsingValidPath(String id) {
        File json = new File(Constants.REQ_BODY_CLASS + "/PutUpdateClassWithValidReqBody.json");
        classAPI.setPutUpdateMentorClass(json,id);
    }

    @And("Send request put for update mentor class")
    public void sendRequestPutForUpdateMentorClass() {
        SerenityRest.when().put(ClassAPI.PUT_UPDATE_MENTOR_CLASS);}
    @And("Validate put update mentor class with json schema validator")
    public void validatePutUpdateMentorClassWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_CLASS + "/PutUpdateMentorClassSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
        }



///////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Put update mentor class with invalid request body using valid path {}")
    public void putUpdateMentorClassWithInvalidRequestBodyUsingValidPath(String id) {
        File json = new File(Constants.REQ_BODY_CLASS + "/PutUpdateClassWithInvalidReqBody.json");
        classAPI.setPutUpdateMentorClass(json,id);
    }
    @And("Validate put update mentor class using invalid request body with json schema validator")
    public void validatePutUpdateMentorClassUsingInvalidRequestBodyWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_CLASS + "/PutUpdateMentorClassInvalidReqSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
//////////////////////////////////////////////////////////////////////////////////////////
    @When("Put update mentor class with valid request body using invalid path {}")
    public void putUpdateMentorClassWithValidRequestBodyUsingInvalidPath(String id) {
    File json = new File(Constants.REQ_BODY_CLASS + "/PutUpdateClassWithValidReqBody.json");
    classAPI.setPutUpdateMentorClass(json,id);
    }
    @And("Validate put update mentor class using invalid path with json schema validator")
    public void validatePutUpdateMentorClassUsingInvalidPathWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_CLASS + "/PutUpdateMentorClassInvalidPathSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    @When("Delete class mentor with valid path {}")
    public void deleteClassMentorWithValidPath(String id) {
        classAPI.setDeleteClass(id);
}

    @And("Send DELETE request for delete class")
    public void sendDELETERequestForDeleteClass() {
        SerenityRest.when().delete(ClassAPI.DELETE_CLASS);
    }

    @And("Validate delete class using valid path with json schema validator")
    public void validateDeleteClassUsingValidPathWithJsonSchemaValidator() {
    File json = new File(Constants.JSON_SCHEMA_CLASS + "/DeleteMentorClassSchema.json");
    SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    @When("Delete class mentor with invalid path {}")
    public void deleteClassMentorWithInvalidPath(String id) {
        classAPI.setDeleteClass(id);
    }

    @And("Validate delete class using invalid path with json schema validator")
    public void validateDeleteClassUsingInvalidPathWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_CLASS + "/DeleteMentorClassInvalidPathSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }



/////////////////////////////////////////////////////////////////////////////////


}
